package Utility;

import java.util.Scanner;

// Create the class:
public class Weather {

    // Create a function for getting Windchill from temperature and win velocity:
    public static double windchill(double t, // temperature
                                   double v){ // velocity in MPH
        return 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
    }

    // Code to use the function:
    public static void main(String [] args) {

        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter temperature in degrees F: ");
        double temperature = kbd.nextDouble();

        System.out.print("Enter a wind velocity in MPH: ");
        double velocity = kbd.nextDouble();

        // Print the response:
        System.out.printf("Windchill for temperature " + temperature +
                        " degrees at " + velocity + " MPH is %.2f.\n",
                windchill(temperature, velocity));

        // same thing but a different way of dong it:
        System.out.printf("Windchill for temperature %.1f degrees at %.1f MPH is %.2f.\n",
                temperature, velocity, windchill(temperature, velocity));

        // Print something in quotes:
        System.out.println("They said \"don't do it.\"");
    }
}


