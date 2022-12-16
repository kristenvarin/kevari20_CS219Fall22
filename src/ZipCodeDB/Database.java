package ZipCodeDB;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

/*
Store data about all the zip codes.
 */

public class Database implements LatLngInterface{
    private ArrayList<Zipcode> codes; // instance variable

    public Database() { // constructor
        // allocate the array list
        this.codes = new ArrayList<>();
        this.load_zips(); // instance method because not static
    }

    // fill the zip code array list with real data
    private void load_zips() {
        URL url = null; // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL("http://10.60.15.25/~ehar/cs219/zips.txt");
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // read zipcode file line by line
        while (s.hasNextLine()) {
            String line = s.nextLine();
            String[] parts = line.split(",");
            Zipcode z = new Zipcode(
                    parts[1].substring(1, parts[1].length() - 1),
                    parts[2].substring(1, parts[2].length() - 1),
                    parts[3].substring(1, parts[3].length() - 1),
                    Double.parseDouble(parts[4]),
                    Double.parseDouble(parts[5]),
                    Integer.parseInt(parts[6]));

            this.codes.add(z); //put z at the end of the array list
        }

        // sort by the zipcode
        // ArrayList is part of the Collector libraries; can't use it here
        Collections.sort(this.codes);

    } // load zips

    // write a function to search for zipcode data by zipcode
    // return the reference to the object if found
    // null if not found
    public Zipcode findByZip(String code) {
        for (Zipcode zipcode : this.codes) {
            if (code.equals(zipcode.getCode()))
                return zipcode;
        }
        return null;
    }


    // return the max latitude or the northernmost latitude
    public Zipcode getNorthern() {
        double max = 0.0;
        for (Zipcode zipcode : this.codes) {
            if (zipcode.getLat() > max) {
                max = zipcode.getLat();
            }

            return zipcode;
        }
        return null;
    }

    private Zipcode bsearch(String target, int low, int high) {
        if (low > high)
            return null;

        int mid = (low + high) / 2;

        if (this.codes.get(mid).getCode().equals(target))
            return this.codes.get(mid);
        else if (this.codes.get(mid).getCode().compareTo(target) < 0)
            return bsearch(target, mid + 1, high);
        else
            return bsearch(target, low, mid - 1);

    }

    // provides a simpler interface to the bsearch function
    public Zipcode search(String code) {
        // return bsearch(code, 0, codes.size() - 1);
        int pos = Collections.binarySearch(this.codes,
                new Zipcode(code, "", "", 0, 0, 0));
        if (pos != -1)
            return this.codes.get(pos);
        else
            return null;
    }

}




