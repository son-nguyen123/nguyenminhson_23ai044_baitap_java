public class Main {
    public static void main(String[] args) throws Exception {
        String password = "myPassword123";

        // Hash
        System.out.println("MD5: " + HashUtil.hashMD5(password));
        System.out.println("SHA: " + HashUtil.hashSHA(password));

        // Multi-thread AES & RSA
        AESEncryption aes = new AESEncryption();
        RSAEncryption rsa = new RSAEncryption();

        Thread aesThread = new EncryptionThread(aes, password);
        Thread rsaThread = new EncryptionThread(rsa, password);

        aesThread.start();
        rsaThread.start();

        aesThread.join();
        rsaThread.join();
    }
}
