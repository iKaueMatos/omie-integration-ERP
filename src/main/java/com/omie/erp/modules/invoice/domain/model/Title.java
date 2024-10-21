package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class Title {
    private String categoryCode;      // cCodCateg
    private String internalTitleCode; // cCodIntTitulo
    private String document;           // cDoc
    private String titleNumber;        // cNumTitulo
    private String paymentMethod;      // cPagForma
    private String issueDate;          // dDtEmissao
    private String forecastDate;       // dDtPrevisao
    private String dueDate;            // dDtVenc
    private String registration;        // dReg
    private int buyerCode;             // nCodComprador
    private int projectCode;           // nCodProjeto
    private int repeatedTitleCode;     // nCodTitRepet
    private int titleCode;             // nCodTitulo
    private int sellerCode;            // nCodVendedor
    private int installmentNumber;     // nParcela
    private int totalInstallments;     // nTotParc
    private double titleValue;         // nValorTitulo
}
