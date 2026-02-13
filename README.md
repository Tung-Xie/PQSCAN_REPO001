# REPO 001: Legacy Cryptography Test Suite (Java)

## 📌 Project Overview
此專案為加密資產掃描器（如 PQScan, Cbomkit, cdxgen）的標準測試基準。
主要模擬企業遺留系統中常見的**不安全加密演算法 (Insecure Algorithms)** 與**過時配置**。

## 🎯 Expected CBOM Detection Results (預期掃描結果)

根據 `src/main/java/com/tony/bank/` 下的實作，掃描器應識別出以下加密資產：

### 1. Symmetric Encryption (對稱加密)
| Algorithm | Mode / Padding | Risk Level | Target File |
| :--- | :--- | :--- | :--- |
| **AES** | ECB / PKCS5Padding | **High** (ECB is insecure) | `CryptoManager.java` |
| **DES** | CBC / PKCS5Padding | **Critical** (Broken algorithm) | `CryptoManager.java` |

### 2. Asymmetric Encryption & Key Exchange (非對稱加密)
| Algorithm | Key Size / Curve | Risk Level | Target File |
| :--- | :--- | :--- | :--- |
| **RSA** | 1024-bit | **High** (Short key length) | `CryptoManager.java` |
| **EC** | secp160k1 | **Critical** (Weak curve) | `LegacySigner.java` |
| **EC** | secp192r1 | **High** (Insufficient entropy) | `LegacySigner.java` |

### 3. Hashing & Digital Signatures (雜湊與簽章)
| Algorithm | Usage | Risk Level | Target File |
| :--- | :--- | :--- | :--- |
| **MD5** | MessageDigest | **High** (Collision risk) | `LegacyHashService.java` |
| **SHA-1** | MessageDigest | **Medium/High** | `LegacyHashService.java` |
| **MD5withRSA** | Signature | **Critical** (Deprecated signature) | `LegacySigner.java` |
| **HMAC-MD5** | Mac / HMAC | **Critical** (Weak inner hash) | `LegacySigner.java` |

---

## 🛠 Technical Implementation Details
* **Language**: Java 11+
* **Framework**: Java Cryptography Architecture (JCA/JCE)
* **Standard**: Maven (Object Model 4.0.0)

## 📊 Evaluation Criteria
1. **Detection Rate**: 掃描器是否能 100% 辨識上述所有硬編碼 (Hardcoded) 的演算法字串。
2. **Component Mapping**: 掃描器是否能正確將演算法關聯至正確的 Java Class 檔案路徑。
3. **Risk Scoring**: CBOM 工具是否能針對 RSA-1024 或 ECB 模式標註正確的 CVE/CWE 風險編號。
