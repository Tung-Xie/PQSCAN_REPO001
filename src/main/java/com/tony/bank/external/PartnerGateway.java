package com.tony.bank.external;
import java.security.*;
import java.security.spec.*;

public class PartnerGateway {
    public void connect() throws Exception {
        KeyPairGenerator ecGen = KeyPairGenerator.getInstance("EC");
        // 顯式字串最容易被掃描器捕捉
        ecGen.initialize(new ECGenParameterSpec("secp160k1"));
        ecGen.initialize(new ECGenParameterSpec("secp192r1"));
    }
}
