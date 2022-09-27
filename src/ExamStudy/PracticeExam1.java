package ExamStudy;

import java.util.Scanner;

public class PracticeExam1 {

    public static double volume(double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h)/3;
    }

    public static double getRadius(Scanner s){
        boolean valid = true;
        double radius = 0;
        while (valid){
            System.out.print("Enter a radius as a decimal: ");
            if (s.hasNextDouble()) {
                radius = s.nextDouble();
            if (radius < 0) {
                System.out.printf("Please enter a positive decimal. You entered \"%s\"", radius);
                System.out.println();
            }
            else{
                valid = false;
            }
            }
            else{
                System.out.printf("Please enter a positive decimal. You entered \"%s\"", s.next());
                System.out.println();
            }
        }
        return radius;
    }

    public static double getHeight(Scanner s){
        boolean valid = true;
        double height = 0;
        while (valid){
            System.out.print("Enter a height as a positive decimal: ");
            if (s.hasNextDouble()) {
                height = s.nextDouble();
                if (height < 0) {
                    System.out.printf("Please enter a positive decimal. You entered \"%s\"", height);
                    System.out.println();
                } else {
                    valid = false;
                }
            }
            else{
                System.out.printf("Please enter a positive decimal. You entered \"%s\"", s.next());
                System.out.println();
            }

        }
        return height;
    }

    public static int c2f(int c){
        return (9*c /5) + 32;
    }


    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        double r = getRadius(s);
        double h = getHeight(s);
        System.out.printf("The volume is %.2f\n", volume(r, h));
        System.out.println();

        boolean valid = false;
        while (!valid){
            System.out.println("Enter a temperature in degrees celcius: ");
            if (s.hasNextInt()){
                int c = s.nextInt();
                valid = true;
                System.out.printf("The temperature in fahrenheight is %d.", c2f(c));
                System.out.println();
        }
            else{
                System.out.printf("Invalid. Enter a temperature. You entered \"%s\"", s.next());
                System.out.println();
            }

        }

        System.out.printf("%1.3f\n", 3.14159);
        System.out.println('d' - 'a');  // weird
        System.out.println(2 + "bc");
        System.out.println(2 + 3 + "bc");
        System.out.println((2 + 3) + "bc");
        System.out.println("bc" + 2 + 3);
        System.out.println("bc" + (2 + 3));
        System.out.println(Math.round(6.02235e4));

        String t = "hippopotomonstrosesquippedaliophobia";
        System.out.println(t.charAt(0));
        System.out.println(t.indexOf('q'));
        System.out.println(t.indexOf('o'));
        System.out.println(t.substring(t.indexOf('m'),16));
        System.out.println(t.charAt(t.length()-1));
    }
}



