public class EncryptionThread extends Thread {
    private Encryptable algorithm;
    private String data;

    public EncryptionThread(Encryptable algorithm, String data) {
        this.algorithm = algorithm;
        this.data = data;
    }

    public void run() {
        try {
            String encrypted = algorithm.encrypt(data);
            String decrypted = algorithm.decrypt(encrypted);
            System.out.println("Encrypted: " + encrypted);
            System.out.println("Decrypted: " + decrypted);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
