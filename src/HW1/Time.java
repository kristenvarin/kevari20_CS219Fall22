package HW1;

public class Time {
    public static void main(String[] args) {
    int hour = 15;
    int minute = 23;
    int second = 20;
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.print(second);
        System.out.print(" is ");
        System.out.print(hour * Math.pow(60, 2) + 60 * minute + second);
        System.out.println(" seconds since midnight.");

        System.out.print("There are ");
        System.out.print(24 * Math.pow(60, 2) - (hour * Math.pow(60, 2) + 60 * minute + second));
        System.out.println(" seconds remaining.");

        System.out.print(Math.round((hour * Math.pow(60, 2) + 60 * minute + second) * 100 / (24 * Math.pow(60, 2))));
        System.out.print("% of the day has elapsed.");
    }
}
