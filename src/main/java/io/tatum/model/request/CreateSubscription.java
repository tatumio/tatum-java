package io.tatum.model.request;

import io.tatum.model.response.ledger.SubscriptionType;

import javax.validation.constraints.NotEmpty;

public class CreateSubscription {

    @NotEmpty
    private SubscriptionType type;

    @NotEmpty
    public ISubscriptionAttr attr;

    public SubscriptionType getType() {
        return type;
    }

    public void setType(SubscriptionType type) {
        this.type = type;
    }

    public ISubscriptionAttr getAttr() {
        return attr;
    }

    public void setAttr(ISubscriptionAttr attr) {
        this.attr = attr;
    }
}