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
public class BchInfo implements IBchInfo {

    private String chain;
    private BigDecimal blocks;
    private String bestblockhash;
    private BigDecimal difficulty;

}
