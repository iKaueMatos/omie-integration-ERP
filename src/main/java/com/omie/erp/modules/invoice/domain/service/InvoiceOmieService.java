package com.omie.erp.modules.invoice.domain.service;

import com.omie.erp.core.infra.OmieApiClient;
import com.omie.erp.modules.invoice.application.dto.InvoiceResponse;
import com.omie.erp.modules.invoice.application.dto.NFConsultRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

@Service
public class InvoiceOmieService {

    @Value("${omie.app.key}")
    private String appKey;

    @Value("${omie.app.secret}")
    private String appSecret;

    private final OmieApiClient omieApiClient;

    public InvoiceOmieService(OmieApiClient omieApiClient) {
        this.omieApiClient = omieApiClient;
    }

    public InvoiceResponse getInvoices(int page, int size) {
        String endpoint = "produtos/nfconsultar/";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        NFConsultRequest request = new NFConsultRequest(
                appKey,
                appSecret,
                1,
                20,
                "N",
                "CODIGO"
        );

        return omieApiClient.consult(endpoint, request, InvoiceResponse.class);
    }
}
