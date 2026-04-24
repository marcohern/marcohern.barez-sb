package com.marcohern.barez.repository;

import com.marcohern.barez.domain.entity.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
