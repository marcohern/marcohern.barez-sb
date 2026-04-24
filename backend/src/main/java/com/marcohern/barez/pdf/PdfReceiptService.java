package com.marcohern.barez.pdf;

import com.marcohern.barez.domain.entity.Order;
import com.marcohern.barez.domain.entity.OrderItem;
import com.marcohern.barez.domain.entity.Receipt;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.font.Standard14Fonts;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

@Service
public class PdfReceiptService {

  private static final float PAGE_WIDTH = 226f; // ~80mm
  private static final float MARGIN = 15f;
  private static final float LINE_HEIGHT = 14f;
  private static final DateTimeFormatter FMT = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

  @Value("${app.pdf.storage-path}")
  private String storagePath;

  @Value("${app.bar.name}")
  private String barName;

  public String generateReceiptPdf(Order order, Receipt receipt) {
    String filename = "receipt-" + receipt.getId() + ".pdf";
    File dir = new File(storagePath);
    if (!dir.exists())
      dir.mkdirs();
    File file = new File(dir, filename);

    try (PDDocument doc = new PDDocument()) {
      PDPage page = new PDPage(new PDRectangle(PAGE_WIDTH, 600f));
      doc.addPage(page);

      try (PDPageContentStream cs = new PDPageContentStream(doc, page)) {
        float y = 580f;

        y = writeLine(cs, barName, 11, true, y);
        y = writeLine(cs, "Receipt #" + receipt.getId(), 9, false, y);
        y = writeLine(cs, order.getCreatedAt().format(FMT), 9, false, y);
        y -= 4;
        y = writeLine(cs, "Table: " + order.getTable().getTableNumber(), 9, false, y);
        y -= 6;
        y = writeSeparator(cs, y);

        y = writeLine(cs, "Item                  Qty  Price   Total", 8, false, y);
        y = writeSeparator(cs, y);

        for (OrderItem item : order.getItems()) {
          String name = truncate(item.getProduct().getName(), 20);
          String line = String.format("%-20s %3d  %6.2f  %6.2f",
              name, item.getQuantity(),
              item.getUnitPrice(), item.lineTotal());
          y = writeLine(cs, line, 8, false, y);
        }

        y = writeSeparator(cs, y);
        y = writeLine(cs, String.format("TOTAL: %.2f", receipt.getTotalAmount()), 10, true, y);
        y -= 8;
        y = writeLine(cs, "Thank you!", 9, false, y);

        // Trim page height to content
        page.setMediaBox(new PDRectangle(PAGE_WIDTH, 600f - y + 20f));
      }

      doc.save(file);
    } catch (IOException e) {
      throw new RuntimeException("Failed to generate PDF receipt", e);
    }

    return storagePath + File.separator + filename;
  }

  private float writeLine(PDPageContentStream cs, String text, float fontSize, boolean bold, float y)
      throws IOException {
    PDType1Font font = bold
        ? new PDType1Font(Standard14Fonts.FontName.HELVETICA_BOLD)
        : new PDType1Font(Standard14Fonts.FontName.COURIER);
    cs.beginText();
    cs.setFont(font, fontSize);
    cs.newLineAtOffset(MARGIN, y);
    cs.showText(text);
    cs.endText();
    return y - LINE_HEIGHT;
  }

  private float writeSeparator(PDPageContentStream cs, float y) throws IOException {
    cs.moveTo(MARGIN, y);
    cs.lineTo(PAGE_WIDTH - MARGIN, y);
    cs.stroke();
    return y - LINE_HEIGHT;
  }

  private String truncate(String s, int max) {
    return s.length() <= max ? s : s.substring(0, max);
  }
}
