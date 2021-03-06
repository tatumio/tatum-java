package io.tatum.model.response.tron;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@JsonIgnoreProperties(ignoreUnknown = true)
public class RawData {

    private Contract[] contract;
    private String ref_block_bytes;
    private String ref_block_hash;
    private long expiration;
    private long fee_limit;
    private long timestamp;
}
