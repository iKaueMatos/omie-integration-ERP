package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class NFProdInt {
    private String cCodItemInt;  // Código interno do item
    private String cCodProdInt;   // Código interno do produto
    private int nCodItem;         // Código do item
    private int nCodProd;         // Código do produto
}
