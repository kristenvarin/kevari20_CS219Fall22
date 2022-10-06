package Exam1;

import java.util.Scanner;

public class Exam1Redo {
    public static int getValue(Scanner s) {
        int value = 0;
        boolean valid = true;
        while (valid) {
            System.out.print("Enter a positive integer: ");
            if (s.hasNextInt()) {
                value = s.nextInt();
                if (value < 0) {
                    System.out.printf("Error. Please enter a positive integer. You entered \"%s\"", value);
                    System.out.println();
                } else {
                    valid = false;
                }
            } else {
                System.out.printf("Please enter a positive integer. You entered \"%s\"", s.next());
                System.out.println();
            }
        }
        return value;
    }

    public static int count2to7(int n) {
        int cnt = 0;
        while (n > 0) {
            if (n % 10 < 7 && n % 10 > 2) {
                cnt++;
            }
            n = n / 10;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = getValue(s);

        System.out.printf("The amount of digits between 2 and 7 is %d.", count2to7(n));
    }

}
