package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class Detail {
    private NFProdInt nfProductInternal; // nfProdInt
    private Product product;                     // prod
}
