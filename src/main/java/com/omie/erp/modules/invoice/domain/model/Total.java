package com.omie.erp.modules.invoice.domain.model;

import lombok.Data;

@Data
public class Total {
    private ICMSTotal icmsTotal;   // ICMSTot
    private ISSQNTotal issqnTotal;  // ISSQNtot
    private RetainedTax retainedTax; // retTrib
}
