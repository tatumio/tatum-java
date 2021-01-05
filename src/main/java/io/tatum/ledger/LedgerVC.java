package io.tatum.ledger;

import io.tatum.model.response.ledger.VC;
import io.tatum.utils.Async;
import io.tatum.utils.BaseUrl;

import java.util.concurrent.ExecutionException;

public class LedgerVC {

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/getCurrency" target="_blank">Tatum API documentation</a>
     */
    public VC getVirtualCurrencyByName(String name) throws ExecutionException, InterruptedException {
        String url = BaseUrl.getInstance().getUrl() + "/v3/ledger/virtualCurrency/" + name;
        return Async.get(url, VC.class);
    }
}
