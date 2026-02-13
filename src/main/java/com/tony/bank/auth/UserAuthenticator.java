package com.tony.bank.auth;
import javax.crypto.Cipher;

public class UserAuthenticator {
    public void verifyUser() throws Exception {
        // 原本是 MessageDigest，現在改成 Cipher 模式來測試
        Cipher c1 = Cipher.getInstance("MD5"); 
        Cipher c2 = Cipher.getInstance("SHA1");
    }
}
