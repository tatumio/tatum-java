package io.tatum.model.response.bch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class BchTxVout implements IBchTxVout {

    private String value;
    private BigDecimal n;
    private IBchTxScriptPubKey scriptPubKey;

}
