/*
* Kristen Varin
* 9/7/2022
* HW 2
*/
package HW2;
import java.util.Scanner;

public class DayOfWeek {
    // create a function that takes three integers (month, day, year) and
    // returns the integer that represents the day of the week that date fell on
    public static int dayofweek(int m, int d, int y) {
        int year = y-(14-m)/12;
        int x = year + (year / 4) - (year / 100) + (year/400);
        int month = m + 12*((14 - m) / 12) - 2;
        int day = (d+ x + (31 * month / 12))%7;
        return day;
    }
    public static void main(String [] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter a month: ");
        int month = kbd.nextInt();
        System.out.print("Enter a day: ");
        int day = kbd.nextInt();
        System.out.print("Enter a year: ");
        int year = kbd.nextInt();

        System.out.println(dayofweek(month, day, year));
    }
}
