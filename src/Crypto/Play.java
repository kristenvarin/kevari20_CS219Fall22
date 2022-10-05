package Crypto;

public class Play {

    public static void main(String [] args) {

        // regular int division
        System.out.println(3/2);                  // 1
        System.out.println(-3/2);                 // -1

        // Floor division
        // Remember double vs int gives different answers
        System.out.println(Math.floor(-3.0/2.0)); // -2.0
        System.out.println(Math.floor(-3/2));     // -1.0
        System.out.println(Math.floorDiv(-3, 2)); // -2

        System.out.println(Math.floor(-33.1));    // -34.0
        System.out.println(Math.floor(33.1));     // 33.0

        // Remainder play
        System.out.println(-15 % 12);             // -3
        System.out.println(Math.floorMod(-15, 12)); // 9
        System.out.println(-93 % 13);             // -2
        System.out.println(Math.floorMod(-93, 13)); // 11

    }

}


