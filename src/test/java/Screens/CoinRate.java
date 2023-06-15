package Screens;
import Base.BasePage;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

import java.io.IOException;


public class CoinRate extends BasePage{

    String jsonData;
    OkHttpClient client = new OkHttpClient().newBuilder().build();
    public void printCoinValue(){
        JSONObject mainJsonObject = new JSONObject(jsonData);
        JSONObject dataResults = mainJsonObject.getJSONObject("data");
        JSONObject insideILS = dataResults.getJSONObject("ILS");
        double value = insideILS.getDouble("value");
        System.out.println("1 ILS = " + value);
    }
    public void printILS_USDValue(){
        Request request = new Request.Builder()
                .url("https://api.currencyapi.com/v3/latest?apikey=lDb3l1l9IurVueJmeJvKmCOcTIZyYwgZTmB7DVPD&currencies=ILS")
                .build();
        try {
            Response response = client.newCall(request).execute();
            jsonData = response.body().string();
            response.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printCoinValue();
    }


    public void printILS_EURValue(){
        Request request = new Request.Builder()
                .url("https://api.currencyapi.com/v3/latest?apikey=lDb3l1l9IurVueJmeJvKmCOcTIZyYwgZTmB7DVPD&currencies=ILS&base_currency=EUR")
                .build();
        try {
            Response response = client.newCall(request).execute();
            jsonData = response.body().string();
            response.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        printCoinValue();
    }
}
