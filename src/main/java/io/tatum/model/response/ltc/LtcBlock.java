package io.tatum.model.response.ltc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class LtcBlock {

    private String hash;
    private BigDecimal height;
    private BigDecimal version;
    private String prevBlock;
    private String merkleRoot;
    private BigDecimal ts;
    private BigDecimal bits;
    private BigDecimal nonce;
    private LtcTx[] txs;
}
