package com.tony.bank.auth;

import java.security.Signature;
import java.security.KeyPairGenerator;
import java.security.spec.ECGenParameterSpec;

public class LegacySigner {
    public void testInsecureSignatures() throws Exception {
        // 簽章：使用過時的 MD5withRSA (風險：Critical)
        Signature sig = Signature.getInstance("MD5withRSA");

        // 測試弱橢圓曲線
        KeyPairGenerator ecGen = KeyPairGenerator.getInstance("EC");
        // 顯式字串最容易被掃描器捕捉
        ecGen.initialize(new ECGenParameterSpec("secp160k1"));
        ecGen.initialize(new ECGenParameterSpec("secp192r1"));
    }
}
