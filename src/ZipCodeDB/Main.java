package ZipCodeDB;

public class Main {

    public static void main(String[] args) {
        Zipcode z1 = new Zipcode("13617", "NY",
                "Canton", 75.16, 44.59, 11781);
        Zipcode z2 = new Zipcode("05403", "VT",
                "South Burlington", 73.18, 44.45, 12809);
        System.out.println(z1);
        System.out.println(z2);

        Database db = new Database(); // db is a database object

        // reference to an object is on left of dot, so it's an instance method
        System.out.println(db.findByZip("12901"));
        System.out.println(db.findByZip("hello"));
        System.out.println(db.search("43221"));

        WeatherObservation wob = db.search("13617").getWeatherData();
        System.out.println(wob);
        return;

    }
}




