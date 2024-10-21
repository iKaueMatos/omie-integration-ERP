package com.omie.erp.modules.invoice.infra.repository;

import com.omie.erp.modules.invoice.domain.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> { }
