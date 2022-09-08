package Utility;

public class DigitExtractor {

    public static int last(int n) {
        n = Math.abs(n);
        if (n < 0) {
            n = -n;
        }
        return n % 10;
    }
    public static int secondToLast(int n) {
        n = Math.abs(n);
        return (n / 10) % 10;
    }


    public static void main(String [] args) {
        System.out.println(last(2753) == 3);
        System.out.println(last(-749) == 9);
        System.out.println(secondToLast(67) == 6);
        System.out.println(secondToLast(-67) == 6);

    }
}
