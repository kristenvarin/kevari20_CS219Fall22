package HW3;

import java.util.Scanner;

public class Investment {

    public static double investment(double c, double r, double t, double n) {
        return c * Math.pow(1 + r / n, t * n);
    }
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Enter an initial deposit as a decimal: ");
        if (!kbd.hasNextDouble()) {
            System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", kbd.next());
            System.exit(-1);
        }
        double deposit = kbd.nextDouble();
        if (deposit < 0) {
            System.out.printf("Error: Please enter a positive decimal number. You entered \"%s\"", deposit);
            System.exit(-1);
        }

    System.out.print("Enter a yearly interest rate as a decimal: ");
        if (!kbd.hasNextDouble()) {
            System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", kbd.next());
            System.exit(-1);
        }
        double rate=kbd.nextDouble();
            if(rate< 0||rate>1){
            System.out.printf("Error: Please enter a positive decimal number between 0.0 and 1.0. "+
            "You entered \"%s\"",rate);
            System.exit(-1);
        }

        System.out.print("Enter a number of years as a positive integer: ");
        if (!kbd.hasNextDouble()) {
            System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", kbd.next());
            System.exit(-1);
        }
        double years=kbd.nextDouble();
            if(years< 0){
            System.out.printf("Error: Please enter a positive integer."+
            "You entered \"%s\"",years);
            System.exit(-1);
        }

        System.out.print("Enter a compound interest as a positive decimal: ");
        if (!kbd.hasNextDouble()) {
            System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", kbd.next());
            System.exit(-1);
        }
        double interest=kbd.nextDouble();
            if(interest< 0){
            System.out.printf("Error: Please enter a positive decimal number between 0.0 and 1.0. "+
            "You entered \"%s\"",interest);
            System.exit(-1);
        }

        System.out.print("Your return on investment is ");
        System.out.println(investment(deposit,rate,years,interest));
        }
}
