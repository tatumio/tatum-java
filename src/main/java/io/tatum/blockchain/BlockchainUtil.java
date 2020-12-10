package io.tatum.blockchain;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.tatum.model.response.common.TransactionHash;
import io.tatum.utils.ApiKey;
import io.tatum.utils.Async;
import io.tatum.utils.Env;
import org.json.JSONObject;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public class BlockchainUtil {

    public static TransactionHash broadcast (String uri, String txData, String signatureId) throws IOException, ExecutionException, InterruptedException {
        var values = new HashMap<String, String>() {{
            put("txData", txData);
        }};
        if (signatureId != null) {
            values.put("signatureId", signatureId);
        }

        var objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(values);
        HttpResponse res = Async.post(uri, ApiKey.getInstance().apiKey, requestBody);

        if (res.statusCode() == 200) {
            JSONObject jsonObj = new JSONObject(res.body());
            String txId = jsonObj.getString("txId");
            return new TransactionHash(txId);
        }

        return null;
    }

}