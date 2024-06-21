# WestinPay Currency Rates API

WestinPay's Free Currency Fiat API provides real-time exchange rates and currency conversion for over 152 currencies. It's ideal for financial apps, e-commerce platforms, and travel services.

## Endpoint

The WestinPay Currency Rates Endpoint delivers real-time exchange rates.

### Authentication

Once you have created an account on [WestinPay](https://westinpay.com/merchant/register), your account will be assigned a unique 32-character API key. Think of this like a secure password; keep it safe and do not share it with others.

### Getting Your API Key

After registering, go to the dashboard and navigate to the "Currency Key" section. Here, you can generate your Fiat API key. This key is essential for authenticating your requests to the API.

### Parameters

- **base**: The base currency for conversion. Default is USD. // For other currencies, use the currency symbol e.g. base=EUR
- **output**: Response format, either JSON or XML. Default is JSON.
- **api_key**: Your unique API key. Replace YOUR-API-KEY with your actual API key.

### Usage Limitations

Please note that your API key allows for up to 5000 monthly requests. This limit is automatically renewed each month. It's important to manage your usage to ensure continuous access to the API.

### Code Example

To fetch the latest rates using JAVA and authenticate with your API key, use the following command:

```sh
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
