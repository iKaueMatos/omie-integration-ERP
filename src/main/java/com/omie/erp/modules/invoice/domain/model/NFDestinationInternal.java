package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class NFDestinationInternal {
    private String internalClientCode;   // cCodCliInt
    private String clientName;            // cRazao
    private String cnpjOrCpf;             // cnpj_cpf
    private int clientCode;               // nCodCli
}
