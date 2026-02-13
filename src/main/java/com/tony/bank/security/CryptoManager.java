package com.tony.bank.security;

import javax.crypto.Cipher;
import java.security.KeyPairGenerator;

public class CryptoManager {
    public void initLegacyCrypto() throws Exception {
        // 測試 RSA 金鑰長度識別 (1024 bit is insecure)
        KeyPairGenerator rsaGen = KeyPairGenerator.getInstance("RSA");
        rsaGen.initialize(1024); 
        
        // 測試不安全模式識別 (ECB mode is insecure)
        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        
        // 測試極弱對稱加密 (DES is broken)
        Cipher des = Cipher.getInstance("DES/CBC/PKCS5Padding");
    }
}
