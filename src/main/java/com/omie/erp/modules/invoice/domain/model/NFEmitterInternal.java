package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class NFEmitterInternal {
    private String internalCompanyCode; // cCodEmpInt
    private int companyCode;             // nCodEmp
}
