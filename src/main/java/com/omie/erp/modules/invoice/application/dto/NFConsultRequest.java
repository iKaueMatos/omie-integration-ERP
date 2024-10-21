package com.omie.erp.modules.invoice.application.dto;

import lombok.Data;


@Data
public class NFConsultRequest {
    private String appKey;
    private String appSecret;
    private int page;
    private int recordsPerPage;
    private String onlyImportedAPI;
    private String orderBy;

    public NFConsultRequest(String appKey, String appSecret, int page, int recordsPerPage, String onlyImportedAPI, String orderBy) {
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.page = page;
        this.recordsPerPage = recordsPerPage;
        this.onlyImportedAPI = onlyImportedAPI;
        this.orderBy = orderBy;
    }
}

