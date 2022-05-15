package accuweatherapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class AccuWeatherAPI {

    private String apiKey;
    private String locationKey;
    private String language;
    private String showDetailsOrNot;

    Gson gson = new Gson();

    public AccuWeatherAPI(String apiKey, String locationKey, String language, String showDetailsOrNot) {
        this.apiKey = apiKey;
        this.locationKey = locationKey;
        this.language = language;
        this.showDetailsOrNot = showDetailsOrNot;
    }

    // Parser API from AccuWeatherMap
    // Cong thuc PARSER API

    public String getJsonAPI(String link) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        //http://
        URL url = new URL(link);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            stringBuilder.append(line); // Đọc từng dòng trong URL rồi ghép lại và gán cho string builder
        }
        return stringBuilder.toString();
    }

    public String getLink() {
        String link = "https://dataservice.accuweather.com/forecasts/v1/daily/1day/" + locationKey
                + "?apikey=" + apiKey + "&language=" + language + "&details="
                + showDetailsOrNot + "&metric=true";
        return link;
    }

    public ForecastRoot getForecastData() throws JsonSyntaxException, IOException {
        ForecastRoot forecastRoot = gson.fromJson(getJsonAPI(getLink()), ForecastRoot.class);
        return forecastRoot;
    }

    public static void main(String[] args) throws JsonSyntaxException, IOException {
        AccuWeatherAPI accuWeatherAPI = new AccuWeatherAPI("wlmksTKESlAeercoXHXZrmjh0jgdKwjw", "1-353412_1_AL", "en-us",
                "true");
        System.out.println(accuWeatherAPI.getForecastData().getDailyForcasts()[0].getRealFeelTemperatureShade()
                .getMaximum().getPhrase());
    }

}
