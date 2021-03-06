package io.tatum.offchain;

import io.tatum.model.request.BroadcastWithdrawal;
import io.tatum.model.response.common.TxHash;
import io.tatum.model.response.offchain.WithdrawalResponse;
import io.tatum.utils.Async;
import io.tatum.utils.BaseUrl;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static io.tatum.constants.Constant.TATUM_API_URL;

/**
 * The type Common.
 */
public class Common {

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/storeWithdrawal" target="_blank">Tatum API documentation</a>
     *
     * @param data the data
     * @return the withdrawal response
     * @throws InterruptedException the interrupted exception
     * @throws ExecutionException   the execution exception
     * @throws IOException          the io exception
     */
    public static WithdrawalResponse offchainStoreWithdrawal(Object data) throws InterruptedException, ExecutionException, IOException {
        String uri = BaseUrl.getInstance().getUrl() + "/v3/offchain/withdrawal";
        return Async.post(uri, data, WithdrawalResponse.class);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/cancelInProgressWithdrawal" target="_blank">Tatum API documentation</a>
     *
     * @param id     the id
     * @param revert the revert
     * @throws ExecutionException   the execution exception
     * @throws InterruptedException the interrupted exception
     */
    public static void offchainCancelWithdrawal(String id, boolean revert) throws ExecutionException, InterruptedException {
        String uri = (StringUtils.isNotEmpty(BaseUrl.getInstance().getUrl()) ?
                BaseUrl.getInstance().getUrl() : TATUM_API_URL) + "/v3/offchain/withdrawal/" + id + "?revert=" + revert;
        Async.delete(uri);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/broadcastBlockchainTransaction" target="_blank">Tatum API documentation</a>
     *
     * @param data the data
     * @return the tx hash
     * @throws InterruptedException the interrupted exception
     * @throws ExecutionException   the execution exception
     * @throws IOException          the io exception
     */
    public static TxHash offchainBroadcast(BroadcastWithdrawal data) throws InterruptedException, ExecutionException, IOException {
        String uri = (StringUtils.isNotEmpty(BaseUrl.getInstance().getUrl()) ?
                BaseUrl.getInstance().getUrl() : TATUM_API_URL) + "/v3/offchain/withdrawal/broadcast";
        return Async.post(uri, data, TxHash.class);
    }
}
