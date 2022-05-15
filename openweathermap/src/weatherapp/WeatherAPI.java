package weatherapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class WeatherAPI {
    private String keys;
    private String city;
    Gson gson = new Gson();

    public WeatherAPI(String keys, String city) {
        this.keys = keys;
        this.city = city;
    }

    //Parser API from OpenWeatherMap
    // CONG THUC PARSER API
    public String getJsonAPI(String link) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        //http://
        URL url = new URL(link);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line); // Đọc từng dòng trong URL rồi ghép lại và gán cho StringBuilder
        }
        return stringBuilder.toString();
    }

    public String getLink() {
        String link = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&units=metric&appid=" + keys + "";
        return link;
    }

    public WeatherRoot getWeatherData() throws JsonSyntaxException, IOException {
        WeatherRoot weatherRoot = gson.fromJson(getJsonAPI(getLink()), WeatherRoot.class);
        return weatherRoot;
    }

    public static void main(String[] args) throws JsonSyntaxException, IOException {
        WeatherAPI weatherAPI = new WeatherAPI("0d9f2b730112a0ac4f1d1a9a88546b95", "Hanoi");
        System.out.println(weatherAPI.getWeatherData().getCoord().lon);
        System.out.println(weatherAPI.getWeatherData().getCoord().lat);
    }
}
