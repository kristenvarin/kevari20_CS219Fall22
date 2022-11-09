package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam2Redo {
    public static void reverse(String [] arr) {
        for (int i = 0; i < arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static boolean isPalindrome(String s) {
        if (s.length() < 2)
            return true;
        else return s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome(s.substring(1, s.length() - 1));
    }
    public static String [] load_words(String path, int n) {

        URL url = null;
        Scanner s = null;

        try {
            url = new URL(path);
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] palindromes = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            String word = s.nextLine();
            if (isPalindrome(word))
                palindromes[i++] = word;
        }
        return palindromes;
    }

    public static void main(String[] args) {
        String [] palindromes = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                9);
        Arrays.sort(palindromes);
        reverse(palindromes);

        System.out.println(Arrays.toString(palindromes));
    }
}

