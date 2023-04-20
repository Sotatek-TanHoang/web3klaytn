package opensdk.sdk.apis.eth.others;

import opensdk.sdk.apis.constant.UrlConstants;
import opensdk.sdk.models.EthCreateAccessListResponse;
import org.klaytn.OpenSDK;
import org.web3j.protocol.core.methods.request.Transaction;

import java.io.IOException;
import java.math.BigInteger;

public class EthCreateAccessListExample {
    private final OpenSDK sdk = new OpenSDK(UrlConstants.TEST_URL);
    void ethCreateAccessListExample() throws IOException {
        Transaction args = Transaction.createFunctionCallTransaction("0x3bc5885c2941c5cda454bdb4a8c88aa7f248e312",null
                ,new BigInteger("3b9aca00",16)
                ,new BigInteger("3d0900",16)
                ,"0x00f5f5f3a25f142fafd0af24a754fafa340f32c7"
                ,"0x20965255");
        String blockNumberOrHash = "latest";
        EthCreateAccessListResponse response = sdk.eth.createAccessList(args,blockNumberOrHash).send();
        response.getResult();
    }
    
}
