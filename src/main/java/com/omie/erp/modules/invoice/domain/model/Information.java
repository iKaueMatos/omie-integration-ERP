package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class Information {
    private String apiImport;             // cImpAPI
    private String lastUpdatedDate;       // dAlt
    private String createdDate;            // dInc
    private String lastUpdatedTime;       // hAlt
    private String createdTime;           // hInc
    private String lastUpdatedUser;       // uAlt
    private String createdUser;           // uInc
}