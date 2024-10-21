package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class Complement {
    private String nFeKey;                     // cChaveNFe
    private String categoryCode;                // cCodCateg
    private String freightModel;                // cModFrete
    private int nfId;                           // nIdNF
    private int orderId;                        // nIdPedido
    private int receiptId;                      // nIdReceb
    private int transportId;                    // nIdTransp
}
