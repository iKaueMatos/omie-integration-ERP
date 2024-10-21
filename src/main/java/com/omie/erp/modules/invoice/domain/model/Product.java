package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class Product {
    private String cfop;                  // CFOP
    private String exTipi;                // EXTIPI
    private String ncm;                   // NCM
    private String cofinsWithheld;        // cCOFINSRetido
    private String csllWithheld;          // cCSLLRetido
    private String ean;                   // cEAN
    private String eanTrib;               // cEANTrib
    private String inssWithheld;          // cINSSRetido
    private String irWithheld;            // cIRRetido
    private String issWithheld;           // cISSRetido
    private String origin;                 // cOrigem
    private String pisWithheld;           // cPISRetido
    private String productCode;           // cProd
    private String productOriginCode;     // cProdOrig
    private int stockLocationCode;        // codigo_local_estoque
    private String totalIndicator;        // indTot
    private double nCMCTotal;             // nCMCTotal
    private double nCMCUnitPrice;         // nCMCUnitario
    private double cofinsRate;            // pCOFINS
    private double icmsInterestRate;      // pIcmsInterest
    private double icmsDestinationUfRate; // pIcmsUfDest
    private double mvaStRate;             // pMVAST
    private double pisRate;                // pPIS
    private double reductionBaseRate;     // pRedBC
    private double reductionBaseICMRate;  // pRedBcICMDest
    private double quantityCommercial;     // qCom
    private double quantityTributary;      // qTrib
    private String unitCommercial;         // uCom
    private String unitTributary;          // uTrib
    private double vBC;                    // vBC
    private double vBCCOFINS;              // vBCCOFINS
    private double vBCIPI;                 // vBCIPI
    private double vBCISS;                 // vBCISS
    private double vBCPIS;                 // vBCPIS
    private double vBCST;                  // vBCST
    private double vBCUFDest;              // vBCUFDest
    private double vCOFINS;                // vCOFINS
    private double vDiscount;              // vDesc
    private double vFreight;               // vFrete
    private double vICMDestination;        // vICMDest
    private double vICMRemittance;         // vICMRemet
    private double vOther;                 // vOutro
    private double vPIS;                   // vPIS
    private double vProduct;               // vProd
    private double vInsurance;             // vSeg
    private double vTotalItem;             // vTotItem
    private double vUnitCommercial;        // vUnCom
    private double vUnitTributary;         // vUnTrib
    private String productDescription;     // xProd
    private String productOriginDescription; // xProdOrig
}

