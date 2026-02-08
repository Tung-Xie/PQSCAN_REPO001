package com.tony.bank.network;
import java.security.*;
import javax.crypto.*;
public class SslHandshake {
    public void setupProtocol() throws Exception {
        // KEX: 弱金鑰交換
        KeyPairGenerator dh = KeyPairGenerator.getInstance("DH");
        dh.initialize(1024); 
        // 舊式 Cipher Suites 常見組合
        Cipher c1 = Cipher.getInstance("RC4");
        Cipher c2 = Cipher.getInstance("DESede"); // 3DES
    }
}
