package com.tony.bank.core;
import java.security.*;
import javax.crypto.*;
public class AccountVault {
    public void encryptData() throws Exception {
        // PKI: 過時公鑰標準
        KeyPairGenerator rsa = KeyPairGenerator.getInstance("RSA");
        rsa.initialize(1024);
        // 不安全的對稱加密模式
        Cipher aesEcb = Cipher.getInstance("AES/ECB/PKCS5Padding");
        Cipher des = Cipher.getInstance("DES/CBC/PKCS5Padding");
    }
}
