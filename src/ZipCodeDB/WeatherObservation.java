package ZipCodeDB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class WeatherObservation {
    private double humidity;
    private double windspeed;
    private double temperature;
    private String clouds;
    private String lat;
    private String lng;


    public WeatherObservation(double humidity, double windspeed, double temperature,
                              String clouds, String lat, String lng) {
        this.humidity = humidity;
        this.windspeed = windspeed;
        this.temperature = temperature;
        this.clouds = clouds;
        this.lat = lat;
        this.lng = lng;

    }

    @Override
    public String toString() {
        return "WeatherObservation{" +
                "humidity=" + humidity +
                ", windspeed=" + windspeed +
                ", temperature=" + temperature +
                ", clouds='" + clouds + '\'' +
                ", lat='" + lat + '\'' +
                ", lng='" + lng + '\'' +
                '}';
    }
}




