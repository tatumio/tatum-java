/*
 * Copyright 2013 Google Inc.
 * Copyright 2015 Andreas Schildbach
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.tatum.network;

import org.bitcoinj.core.*;
import org.bitcoinj.net.discovery.*;
import org.bitcoinj.params.AbstractBitcoinNetParams;

import java.net.*;

import static com.google.common.base.Preconditions.*;

/**
 * Parameters for the main production network on which people trade goods and services.
 */
public class LtcMainNetParams extends AbstractBitcoinNetParams {

    /**
     * Instantiates a new Ltc main net params.
     */
    public LtcMainNetParams() {
        super();
        dumpedPrivateKeyHeader = 128;
        addressHeader = 0;
        p2shHeader = 5;
        segwitAddressHrp = "bc";

        bip32HeaderP2PKHpub = 0x019da462; // The 4 byte header that serializes in base58 to "Ltub".
        bip32HeaderP2PKHpriv = 0x019d9cfe; // The 4 byte header that serializes in base58 to "xprv"

        bip32HeaderP2WPKHpub = 0x04b24746; // The 4 byte header that serializes in base58 to "zpub".
        bip32HeaderP2WPKHpriv = 0x04b2430c; // The 4 byte header that serializes in base58 to "zprv"
    }

    private static LtcMainNetParams instance;

    /**
     * Get ltc main net params.
     *
     * @return the ltc main net params
     */
    public static synchronized LtcMainNetParams get() {
        if (instance == null) {
            instance = new LtcMainNetParams();
        }
        return instance;
    }

    @Override
    public String getPaymentProtocolId() {
        return PAYMENT_PROTOCOL_ID_MAINNET;
    }
}
