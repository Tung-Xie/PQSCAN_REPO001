package com.tony.bank.auth;
import java.security.*;
public class UserAuthenticator {
    public void verifyUser() throws Exception {
        // Hash: 已碰撞的雜湊算法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        // Signature: 弱簽章
        Signature sig = Signature.getInstance("MD5withRSA");
        Signature dsa = Signature.getInstance("SHA1withDSA");
    }
}
