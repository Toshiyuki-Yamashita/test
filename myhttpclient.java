import java.net.HttpURLConnection;
import java.net.URL;

public class ProxySample {
    public static void main(String... args) throws Exception {
        URL url = new URL(args[0]);

        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        System.out.printf("Access URL => %s%n", url);
        System.out.printf("Response Code => %d%n", conn.getResponseCode());
    }
}
