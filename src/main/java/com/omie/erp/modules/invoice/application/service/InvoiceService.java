package com.omie.erp.modules.invoice.application.service;

import com.omie.erp.modules.invoice.application.dto.InvoiceResponse;
import com.omie.erp.modules.invoice.domain.model.Invoice;

public interface InvoiceService {
    InvoiceResponse getInvoices(int page, int size);
    Invoice getInvoiceById(int id);
    Invoice createInvoice(Invoice invoice);
    Invoice updateInvoice(int id, Invoice invoice);
    void deleteInvoice(int id);
}