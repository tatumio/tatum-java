package io.tatum.model.response.bch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

/**
 * The type Bch block.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class BchBlock {

    private String hash;
    private long size;
    private long height;
    private int version;
    private String merkleroot;
    private BchTx[] tx;
    private String versionHex;
    private String bits;
    private long strippedsize;
    private long time;
    private BigInteger nonce;
    private BigInteger difficulty;
    private int confirmations;
    private String previousblockhash;
    private String nextblockhash;

}
