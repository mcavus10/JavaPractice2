import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class BasicApiExample {
    public static void main(String[] args) {

        HttpURLConnection();

        //Yerelde kullanılabilir ancak, springbootta resttemplate ve webclient kullanımı çok yaygındır ve kesinlikle derinlemesine öğrenilmeli.
    }

    public static void HttpURLConnection() {
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/posts/1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();
            if (responseCode == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println("Yanıt: " + response.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
