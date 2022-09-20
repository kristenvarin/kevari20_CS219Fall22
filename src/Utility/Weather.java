package Utility;

import java.util.Scanner;

// Create the class:
public class Weather {

    // Create a function for getting Windchill from temperature and win velocity:
    public static double windchill(double t, // temperature
                                   double v){ // velocity in MPH
        return 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
    }

    public static double getVelocity(Scanner s) {
        boolean valid = false;
        double velocity = 0;

        while (!valid) {
            System.out.print("Enter a wind velocity in MPH: ");
            if (s.hasNextDouble()) {
                velocity = s.nextDouble();
                if (velocity < 0){
                    System.out.printf("Error: velocity cannot be negative. Your entered %.2f", velocity);
                }
                else{
                    valid = true;
                }
                //break; would also work to quit the loop if we said while (true)
            } else {
                System.out.printf("Error: Please enter a decimal number. " +
                        "You entered \"%s\"", s.next());
            }
        }
        return (velocity);
    }

    public static double getTemperature(Scanner s) {
        double temperature = 0;
        while (true) {
            System.out.print("Enter temperature in degrees F: ");
            if(s.hasNextDouble()) {
                temperature = s.nextDouble();
                break;
            }
            else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", s.next());
            }
        }
        return (temperature);
        }

    // Code to use the function:
    public static void main(String [] args) {

        // used for getting input from the keyboard
        Scanner kbd = new Scanner(System.in);

        double temperature = getTemperature(kbd);
        double velocity = getVelocity(kbd);

        System.out.printf("Windchill for temperature %.1f degrees at %.1f MPH is %.2f.\n",
                temperature, velocity, windchill(temperature, velocity));

        // Print something in quotes:
        System.out.println("They said \"don't do it.\"");
    }
}


