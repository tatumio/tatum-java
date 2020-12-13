package io.tatum.model.response.xrp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Account {

    private BigDecimal ledgerCurrentIndex;
    private BigDecimal sequence;
}
