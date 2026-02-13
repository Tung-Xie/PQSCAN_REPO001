package com.tony.bank.core;
import java.security.*;
import javax.crypto.*;

public class AccountVault {
    public void encryptData() throws Exception {
        // 測試 RSA 金鑰長度識別
        KeyPairGenerator rsaGen = KeyPairGenerator.getInstance("RSA");
        rsaGen.initialize(1024); 
        
        // 測試不安全模式識別
        Cipher aes = Cipher.getInstance("AES/ECB/PKCS5Padding");
        
        // 測試極弱對稱加密
        Cipher des = Cipher.getInstance("DES/CBC/PKCS5Padding");
    }
}
