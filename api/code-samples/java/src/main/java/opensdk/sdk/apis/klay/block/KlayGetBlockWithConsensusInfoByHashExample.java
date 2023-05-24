package org.web3j.protocol.klaytn.core.klay.block;

import opensdk.sdk.apis.constant.UrlConstants;
import org.web3j.protocol.klaytn.core.method.response.KlayGetBlockWithConsensusInfoByHashResponse;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.klaytn.Web3j;

import java.io.IOException;

public class KlayGetBlockWithConsensusInfoByHashExample {

    private final OpenSDK sdk = new OpenSDK(UrlConstants.TEST_URL);

    void klayGetBlockWithConsensusInfoByHashExample() throws IOException {
        KlayGetBlockWithConsensusInfoByHashResponse gr = sdk.klay.getBlockWithConsensusInfoByHash(
                        "0xba647d41423faeebe8a7c64737d284fc2eba6f0388a3e1ebf6243db509ec1577")
                .send();
        gr.getResult();
    }
}
