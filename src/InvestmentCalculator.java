import HW3.Investment;

import java.util.Scanner;
// can reuse a function from another class

public class InvestmentCalculator {

    public static void main(String [] args){

        // prompt the user for c, r, t, n;
        // and call the function with the inputted values

        Scanner s = new Scanner(System.in);
        System.out.print("Enter an initial deposit as a decimal: ");
        double c = s.nextDouble();
        System.out.print("Enter a yearly interest rate as a decimal: ");
        double r = s.nextDouble();
        System.out.print("Enter a number of years as an integer: ");
        int t = s.nextInt();
        System.out.print("Enter number of times to compound interest per year as an integer: ");
        int n = s.nextInt();

        System.out.printf("Your investment is worth %.2f dollars.",
                Investment.investment(c, r, t, n));
    }

}
