package ZipCodeDB;

/*
Hold data about one zip code
 */

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zipcode implements Comparable<Zipcode>, Distance, WeatherInfo {
        private String code;
        private String state; // two character code abbreviation
        private String city;
        private double lng;
        private double lat;
        private int pop; // instance variables or properties

        public Zipcode(String code, String state, String city, double lng, double lat, int pop) { // constructor
            this.code = code;
            this.state = state;
            this.city = city;
            this.lng = lng;
            this.lat = lat;
            this.pop = pop;
        }

        public String getCode() {
            return code;
        }
        public double getLat() {
            return lat;
        }


        // the natural ordering for a zipcode
        @Override
        public int compareTo(Zipcode zc) {
            return this.code.compareTo(zc.code);
        }


        @Override
        public String toString() {
            return "Zipcode{" +
                    "code='" + code + '\'' +
                    ", state='" + state + '\'' +
                    ", city='" + city + '\'' +
                    ", lng=" + lng +
                    ", lat=" + lat +
                    ", pop=" + pop +
                    '}';
        }

    @Override
    public double distance(Zipcode zip) {
        return 0;
    }

    public WeatherObservation getWeatherData(){
        URL url = null; // null is the "nothing value"
        Scanner s = null;
        String path = "http://api.geonames.org/findNearByWeatherJSON?formatted=true&lat=" +
                this.lat + "&lng=-" + this.lng + "&username=edharcourt\n";

        try {
            url = new URL(path);
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        double humidity = 0, temp = 0, speed = 0;
        String clouds = null, lat = null, lng = null;

        while (s.hasNextLine()) {
            String line = s.nextLine();
            if (line.indexOf("humidity") > 0) {
                humidity = Double.parseDouble(
                        line.substring(line.indexOf(':') + 1, line.indexOf(',')));
            }
            else if (line.indexOf("windSpeed") > 0) {
                speed = Double.parseDouble(
                        line.substring(line.indexOf(':') + 3, line.indexOf(',') - 1));
            }
            else if (line.indexOf("temperature") > 0) {
                temp = Double.parseDouble(
                        line.substring(line.indexOf(':') + 3, line.indexOf(',') - 1));
            }
            else if (line.indexOf("clouds") > 0) {
                clouds = line.substring(line.indexOf(':') + 3, line.indexOf(',') - 1);
            }
            else if (line.indexOf("lat") > 0) {
                lat = line.substring(line.indexOf(':') + 3, line.indexOf(',') - 1);
            }
            else if (line.indexOf("lng") > 0) {
                lng = line.substring(line.indexOf(':') + 3, line.indexOf(',') - 1);
            }
        }

        WeatherObservation ob = new WeatherObservation(humidity, speed, temp, clouds, lat, lng);
        return ob;

    }
}







