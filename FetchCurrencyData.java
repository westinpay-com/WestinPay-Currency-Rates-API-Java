import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://westinpay.com/currency/fiat_api?api_key=YOUR-API-KEY&base=USD&output=JSON");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            JSONObject json = new JSONObject(response.toString());
            System.out.println(json);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
