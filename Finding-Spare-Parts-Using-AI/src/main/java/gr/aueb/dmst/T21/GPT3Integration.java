package gr.aueb.dmst.T21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class GPT3Integration {
    public static void main(String[] args) {
        try {
            String apiKey = "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";
            String prompt = "Once upon a time,";

            URL url = new URL("https://api.openai.com/v1/engines/text-davinci-003/completions");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Authorization", "Bearer " + apiKey);
            connection.setRequestProperty("Content-Type", "application/json");
            connection.setDoOutput(true);

            String requestData = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 50}";

            OutputStream os = connection.getOutputStream();
            os.write(requestData.getBytes());
            os.flush();
            os.close();

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Handle the response JSON here
                System.out.println("Response: " + response.toString());
            } else {
                System.out.println("Request failed with response code: " + responseCode);
            }

            connection.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}