package io.tatum.ledger;

import io.tatum.model.request.CustomerUpdate;
import io.tatum.model.response.ledger.Customer;
import io.tatum.utils.Async;
import io.tatum.utils.BaseUrl;

import java.io.IOException;
import java.util.concurrent.ExecutionException;

import static io.tatum.constants.Constant.EMPTY_BODY;

public class LedgerCustomer {

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/getCustomerByExternalId" target="_blank">Tatum API documentation</a>
     */
    public Customer getCustomer(String id) throws IOException, ExecutionException, InterruptedException {
        String uri = BaseUrl.getInstance().getUrl() + "/v3/ledger/customer" + id;
        return Async.get(uri, Customer.class);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/findAllCustomers" target="_blank">Tatum API documentation</a>
     */
    public Customer[] getAllCustomers(Integer pageSize, Integer offset) throws IOException, ExecutionException, InterruptedException {
        String uri = BaseUrl.getInstance().getUrl() + "/v3/ledger/customer?pageSize=" + pageSize + "&offset=" + offset;
        return Async.get(uri, Customer[].class);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/updateCustomer" target="_blank">Tatum API documentation</a>
     */
    public String updateCustomer(String id, CustomerUpdate data) throws IOException, ExecutionException, InterruptedException {
//        await validateOrReject(data);
//        TO-DO
        String uri = BaseUrl.getInstance().getUrl() + "/v3/ledger/customer/" + id;
        return Async.put(uri, data);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/activateAccount" target="_blank">Tatum API documentation</a>
     */
    public void activateCustomer(String id) throws IOException, ExecutionException, InterruptedException {
        String uri = BaseUrl.getInstance().getUrl() + "/v3/ledger/customer/" + id + "/activate";
        Async.put(uri, EMPTY_BODY);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/deactivateCustomer" target="_blank">Tatum API documentation</a>
     */
    public void deactivateCustomer(String id) throws IOException, ExecutionException, InterruptedException {
        String uri = BaseUrl.getInstance().getUrl() + "/v3/ledger/customer/" + id + "/deactivate";
        Async.put(uri, EMPTY_BODY);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/enableCustomer" target="_blank">Tatum API documentation</a>
     */
    public void enableCustomer(String id) throws IOException, ExecutionException, InterruptedException {
        String uri = BaseUrl.getInstance().getUrl() + "/v3/ledger/customer/" + id + "/enable";
        Async.put(uri, EMPTY_BODY);
    }

    /**
     * For more details, see <a href="https://tatum.io/apidoc#operation/disableCustomer" target="_blank">Tatum API documentation</a>
     */
    public void disableCustomer(String id) throws IOException, ExecutionException, InterruptedException {
        String uri = BaseUrl.getInstance().getUrl() + "/v3/ledger/customer/" + id + "/disable";
        Async.put(uri, EMPTY_BODY);
    }
}
