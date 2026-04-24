export const getReceiptPdfUrl = (receiptId) =>
  `http://localhost:8080/api/receipts/${receiptId}/pdf`;
