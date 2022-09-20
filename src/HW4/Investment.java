package HW4;

import java.util.Scanner;

public class Investment {

    public static double investment(double deposit, double rate, int years, double interest) {
        return deposit * Math.pow(1 + rate / interest, years * interest);
    }

    public static double getDeposit(Scanner s) {
        boolean valid = false;
        double deposit = 0;
        while (!valid) {
            System.out.print("Enter an initial deposit as a decimal: ");
            if (s.hasNextDouble()) {
                deposit = s.nextDouble();
                if (deposit < 0) {
                    System.out.printf("Error: Please enter a positive decimal number. " +
                            "You entered \"%s\"", deposit);
                    System.out.println();
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Please enter a decimal number. " +
                        "You entered \"%s\"", s.next());
                System.out.println();
            }
        }
        return deposit;
    }

    public static double getRate(Scanner s) {
        boolean valid = false;
        double rate = 0;
        while (!valid) {
            System.out.print("Enter a yearly interest rate as a decimal: ");
            if (s.hasNextDouble()) {
                rate = s.nextDouble();
                if (rate < 0 || rate > 1) {
                    System.out.printf("Error: Please enter a decimal between 0 and 1. " +
                            "You entered \"%s\"", rate);
                    System.out.println();
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", s.next());
                System.out.println();
            }
        }
        return rate;
    }

    public static int getYears(Scanner s) {
        int years = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter a number of years: ");
            if (s.hasNextInt()) {
                years = s.nextInt();
                if (years < 0) {
                    System.out.printf("Error: Please enter a positive number. You entered \"%s\"", years);
                    System.out.println();
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Please enter a positive integer. You entered \"%s\"", s.next());
                System.out.println();
            }
        }
        return years;
    }

    public static double getInterest(Scanner s) {
        double interest = 0;
        boolean valid = false;
        while (!valid) {
            System.out.print("Enter a compound interest rate: ");
            if (s.hasNextDouble()) {
                interest = s.nextDouble();
                if (interest < 0 || interest > 1) {
                    System.out.printf("Error: Please enter a number between 0 and 1. " +
                            "You entered \"%s\"", interest);
                    System.out.println();
                } else {
                    valid = true;
                }
            } else {
                System.out.printf("Error: Please enter a decimal number. You entered \"%s\"", s.next());
                System.out.println();
            }
        }
        return interest;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double deposit = getDeposit(s);
        double rate = getRate(s);
        int years = getYears(s);
        double interest = getInterest(s);

        System.out.printf("Your return on investment is %.2f",
                investment(deposit, rate, years, interest));
    }
}


