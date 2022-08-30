public class Investment {

    public static double investment(double c, double r, int t, int n) {
        return c * Math.pow(1+ r/n, t*n);
    }

    public static void main(String [] args) {

        /*
        double c = 1.0; // initial deposit
        double r = 1.0; // 100% yearly interest rate
        int t = 1;      // number of years
        int n = (int) 2e9; // compound interest 1 billion times
            // cast the int to a double; otherwise just assign a double
        double p = c * Math.pow(1+ r/n, t*n);
         */

        System.out.println(investment(1.0, 1.0, 1, (int) 1e9));
        System.out.println(investment(1000, .03, 10, 365));
    }
}
