package com.omie.erp.modules.invoice.application.dto;

import com.omie.erp.modules.invoice.domain.model.Invoice;
import lombok.Data;

import java.util.List;

@Data
public class InvoiceResponse {
    private int page;
    private int totalPages;
    private int records;
    private int totalRecords;
    private List<Invoice> invoiceRegistration;
}
