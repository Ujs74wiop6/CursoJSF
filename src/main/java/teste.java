
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.KeyGenerator;

/**
 *
 * @author Home
 */
public class teste {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        String key = Base64.getEncoder().encodeToString(keyGen.generateKey().getEncoded());
        System.out.println(key);
    }
}
