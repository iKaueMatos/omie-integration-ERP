package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class Identification {
    private String deniedCode;            // cDeneg
    private String cancellationDate;      // dCan
    private String emissionDate;          // dEmi
    private String invalidationDate;      // dInut
    private String registrationDate;      // dReg
    private String exitEntryDate;         // dSaiEnt
    private String nFePurpose;            // finNFe
    private String emissionHour;          // hEmi
    private String exitEntryHour;         // hSaiEnt
    private String paymentIndicator;      // indPag
    private String model;                  // mod
    private String nNF;                   // nNF
    private String series;                 // serie
    private String environmentType;       // tpAmb
    private String nFType;                // tpNF
}
