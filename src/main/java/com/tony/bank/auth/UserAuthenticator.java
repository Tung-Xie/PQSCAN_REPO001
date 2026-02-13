package com.tony.bank.auth;
import java.security.*;
import javax.crypto.*;

public class UserAuthenticator {
    public void verifyUser() throws Exception {
        // 確保使用標準 getInstance 呼叫
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        
        // 增加一個簽章辨識點
        Signature sig = Signature.getInstance("MD5withRSA");
    }
}
