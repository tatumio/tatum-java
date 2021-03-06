package io.tatum.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;
import java.math.BigDecimal;

/**
 * The type Order book request.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class OrderBookRequest {

    @NotEmpty
    private TradeType type;

    @NotEmpty
    @Pattern(regexp = "^[+]?((\\d+(\\.\\d*)?)|(\\.\\d+))$") // number string
    @Size(max = 38)
    private String price;

    @NotEmpty
    @Pattern(regexp = "^[+]?((\\d+(\\.\\d*)?)|(\\.\\d+))$") // number string
    @Size(max = 38)
    private String amount;

    @NotEmpty
    @Pattern(regexp = "^[A-a-zZ0-9_\\-]+\\/[A-Za-z0-9_\\-]+$")
    @Size(min = 3, max = 30)
    private String pair;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z]+")
    @Size(min = 24, max = 24)
    private String currency1AccountId;

    @NotEmpty
    @Pattern(regexp = "[a-zA-Z]+")
    @Size(min = 24, max = 24)
    private String currency2AccountId;

    @NotEmpty
    @Pattern(regexp = "\\d+")
    @Min(0)
    @Max(100)
    private BigDecimal fee;

    @NotEmpty
    @Size(min = 24, max = 24)
    private String feeAccountId;

}
