package Chap9ImmutableObjects;

import java.math.BigInteger;


public class DiffieHellman {

    public static void main(String[] args) {

        // Get a big prime number.
        BigInteger p = new BigInteger("7919");

        BigInteger Apriv = new BigInteger("123456789");

        // Alice compute here public key
        BigInteger Apub = BigInteger.TWO.modPow(Apriv, p);

        // Send Bob the public key
        // Bob picks private key
        BigInteger Bpriv = new BigInteger("497");

        //Bob computes public key
        BigInteger Bpub = BigInteger.TWO.modPow(Bpriv, p);

        // Alice can compute the shared key
        BigInteger Ashared = Bpub.modPow(Apriv, p);

        // Bob computes the shared key
        BigInteger Bshared = Apub.modPow(Bpriv, p);

        System.out.println(Ashared);
        System.out.println(Bshared);
        System.out.println(Ashared.equals(Bshared));

    }
}




