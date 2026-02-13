package com.tony.bank.service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LegacyHashService {
    public void computeChecksums(byte[] data) throws NoSuchAlgorithmException {
        // 業界常見：使用 MD5 做快速 Checksum (風險：High)
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] hash1 = md5.digest(data);

        // 業界常見：使用 SHA-1 做檔案比對 (風險：Medium/High)
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        byte[] hash2 = sha1.digest(data);
    }
}
