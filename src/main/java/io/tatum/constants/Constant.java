package io.tatum.constants;

import io.tatum.model.request.Currency;
import io.tatum.utils.LtcMainNetParams;
import io.tatum.utils.LtcTestNet3Params;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.params.TestNet3Params;

import java.util.AbstractMap;
import java.util.Map;

import static io.tatum.model.request.Currency.*;

public class Constant {
    public static final String TATUM_API_URL = "https://api-eu1.tatum.io";

    public static final String EMPTY_BODY = "{}";

    public static final NetworkParameters BITCOIN_MAINNET = MainNetParams.get();

    public static final NetworkParameters BITCOIN_TESTNET = TestNet3Params.get();

    public static final NetworkParameters LITECOIN_MAINNET = LtcMainNetParams.get();

    public static final NetworkParameters LITECOIN_TESTNET = LtcTestNet3Params.get();


    // TESTNET_DERIVATION_PATH = 'm/44\'/1\'/0\'/0'
    public static final String TESTNET_DERIVATION_PATH = "M/44H/1H/0H/0";

    // BTC_DERIVATION_PATH = 'm/44\'/0\'/0\'/0';
    public static final String BTC_DERIVATION_PATH = "M/44H/0H/0H/0";

    //LTC_DERIVATION_PATH = 'm/44\'/2\'/0\'/0';
    public static final String LTC_DERIVATION_PATH = "M/44H/2H/0H/0";

    public static final String BCH_DERIVATION_PATH = "M/44H/145H/0H/0";

    public static final String ETH_DERIVATION_PATH = "M/44H/60H/0H/0";

    public static final String VET_DERIVATION_PATH = "M/44H/818H/0H/0";

    public static final String ADA_DERIVATION_PATH = "M/44H/1815H/0H/0/0";

    public static final String TRANSFER_METHOD_ABI = "{" +
            "   \"constant\":false," +
            "   \"inputs\":[" +
            "      {" +
            "         \"name\":\"to\"," +
            "         \"type\":\"address\"" +
            "      }," +
            "      {" +
            "         \"name\":\"value\"," +
            "         \"type\":\"uint256\"" +
            "      }" +
            "   ]," +
            "   \"name\":\"transfer\"," +
            "   \"outputs\":[" +
            "      {" +
            "         \"name\":\"\"," +
            "         \"type\":\"bool\"" +
            "      }" +
            "   ]," +
            "   \"payable\":false," +
            "   \"stateMutability\":\"nonpayable\"," +
            "   \"type\":\"function\"" +
            "}";

    public static final Map<String, String> CONTRACT_ADDRESSES = Map.ofEntries(
            new AbstractMap.SimpleEntry<>(USDT.toString(), "0xdac17f958d2ee523a2206206994597c13d831ec7"),
            new AbstractMap.SimpleEntry<>(LEO.toString(), "0x2af5d2ad76741191d15dfe7bf6ac92d4bd912ca3"),
            new AbstractMap.SimpleEntry<>(UNI.toString(), "0x1f9840a85d5af5bf1d1762f925bdaddc4201f984"),
            new AbstractMap.SimpleEntry<>(LINK.toString(), "0x514910771af9ca656af840dff83e8264ecf986ca"),
            new AbstractMap.SimpleEntry<>(FREE.toString(), "0x2f141ce366a2462f02cea3d12cf93e4dca49e4fd"),
            new AbstractMap.SimpleEntry<>(MKR.toString(), "0x9f8f72aa9304c8b593d555f12ef6589cc3a579a2"),
            new AbstractMap.SimpleEntry<>(USDC.toString(), "0xa0b86991c6218b36c1d19d4a2e9eb0ce3606eb48"),
            new AbstractMap.SimpleEntry<>(BAT.toString(), "0x0d8775f648430679a709e98d2b0cb6250d2887ef"),
            new AbstractMap.SimpleEntry<>(TUSD.toString(), "0x0000000000085d4780B73119b644AE5ecd22b376"),
            new AbstractMap.SimpleEntry<>(PAX.toString(), "0x8e870d67f660d95d5be530380d0ec0bd388289e1"),
            new AbstractMap.SimpleEntry<>(PAXG.toString(), "0x45804880de22913dafe09f4980848ece6ecbaf78"),
            new AbstractMap.SimpleEntry<>(PLTC.toString(), "0x429d83bb0dcb8cdd5311e34680adc8b12070a07f"),
            new AbstractMap.SimpleEntry<>(MMY.toString(), "0x385ddf50c3de724f6b8ecb41745c29f9dd3c6d75"),
            new AbstractMap.SimpleEntry<>(XCON.toString(), "0x0f237d5ea7876e0e2906034d98fdb20d43666ad4")
    );


    public static final Map<String, Integer> CONTRACT_DECIMALS = Map.ofEntries(
            new AbstractMap.SimpleEntry<>(USDT.toString(), 6),
            new AbstractMap.SimpleEntry<>(LEO.toString(), 18),
            new AbstractMap.SimpleEntry<>(UNI.toString(), 18),
            new AbstractMap.SimpleEntry<>(LINK.toString(), 18),
            new AbstractMap.SimpleEntry<>(FREE.toString(), 18),
            new AbstractMap.SimpleEntry<>(MKR.toString(), 18),
            new AbstractMap.SimpleEntry<>(USDC.toString(), 6),
            new AbstractMap.SimpleEntry<>(BAT.toString(), 18),
            new AbstractMap.SimpleEntry<>(TUSD.toString(), 18),
            new AbstractMap.SimpleEntry<>(PAX.toString(), 18),
            new AbstractMap.SimpleEntry<>(PAXG.toString(), 18),
            new AbstractMap.SimpleEntry<>(PLTC.toString(), 18),
            new AbstractMap.SimpleEntry<>(MMY.toString(), 18),
            new AbstractMap.SimpleEntry<>(XCON.toString(), 18)
    );

}
