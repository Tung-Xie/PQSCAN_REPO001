package com.tony.bank.external;
import java.security.*;
import java.security.spec.ECGenParameterSpec;
public class PartnerGateway {
    public void connect() throws Exception {
        // 弱橢圓曲線 (Weak Curves)
        KeyPairGenerator ec = KeyPairGenerator.getInstance("EC");
        ec.initialize(new ECGenParameterSpec("secp160k1"));
        ec.initialize(new ECGenParameterSpec("sect163k1"));
        ec.initialize(new ECGenParameterSpec("secp192r1"));
    }
}
