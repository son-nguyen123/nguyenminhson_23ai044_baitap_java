import java.security.MessageDigest;

public class HashUtil {
    public static String hashMD5(String input) throws Exception {
        return hash(input, "MD5");
    }

    public static String hashSHA(String input) throws Exception {
        return hash(input, "SHA-256");
    }

    private static String hash(String input, String algorithm) throws Exception {
        MessageDigest digest = MessageDigest.getInstance(algorithm);
        byte[] hashBytes = digest.digest(input.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
}
