package io.tatum.model.response.btc;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * The type Btc tx prevout.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class BtcTxPrevout {

    private String hash;
    private long index;

}
