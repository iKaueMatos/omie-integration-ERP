package com.omie.erp.modules.invoice.domain.service;

import com.omie.erp.modules.invoice.application.dto.InvoiceResponse;
import com.omie.erp.modules.invoice.application.service.InvoiceService;
import com.omie.erp.modules.invoice.domain.model.Invoice;
import com.omie.erp.modules.invoice.infra.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceServiceImpl implements InvoiceService {

    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceServiceImpl(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public InvoiceResponse getInvoices(int page, int size) {
        List<Invoice> invoices = invoiceRepository.findAll();
        InvoiceResponse response = new InvoiceResponse();
        response.setPage(page);
        response.setTotalPages(1);
        response.setRecords(invoices.size());
        response.setTotalRecords(invoices.size());
        response.setInvoiceRegistration(invoices);
        return response;
    }

    @Override
    public Invoice getInvoiceById(int id) {
        return invoiceRepository.findById(id).orElse(null);
    }

    @Override
    public Invoice createInvoice(Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice updateInvoice(int id, Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    @Override
    public void deleteInvoice(int id) {
        invoiceRepository.deleteById(id);
    }
}

