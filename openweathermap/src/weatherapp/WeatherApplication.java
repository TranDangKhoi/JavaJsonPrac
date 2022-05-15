package weatherapp;

import java.io.IOException;

import com.google.gson.JsonSyntaxException;

public class WeatherApplication {
    public static void main(String[] args) throws JsonSyntaxException, IOException {
        WeatherAPI weatherAPI = new WeatherAPI("0d9f2b730112a0ac4f1d1a9a88546b95", "Hanoi");
        System.out.println("Longtitude:" + weatherAPI.getWeatherData().getCoord().lon);
        System.out.println("Lattitude:" + weatherAPI.getWeatherData().getCoord().lat);
        System.out.println(weatherAPI.getWeatherData().getWeather()[0].toString());
        System.out.println(weatherAPI.getWeatherData().getName());
        System.out.println(weatherAPI.getWeatherData().getMain().getFeels_like());
        System.out.println(weatherAPI.getWeatherData().getMain().getTemp());
        System.out.println(weatherAPI.getWeatherData().getMain().getGrnd_level());
    }
}
