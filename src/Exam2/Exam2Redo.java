package Exam2;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;

public class Exam2Redo {
    public static boolean isPalindrome2(String s) {
        if (s.length() < 2)
            return true;
        else return s.charAt(0) == s.charAt(s.length() - 1) &&
                isPalindrome2(s.substring(1, s.length() - 1));
    }
    public static void reverse(String [] arr) {
        for (int i = 0; i < arr.length/2; i++){
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
    public static String [] load_words(String path, int n) {

        URL url = null; // null is the "nothing value"
        Scanner s = null;

        try {
            url = new URL(path); // create a URL object for the path
            s = new Scanner(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] words = new String[n];
        int i = 0;
        while (s.hasNextLine()) {
            String word = s.nextLine();
            if (isPalindrome2(word))
                words[i++] = word;
        }
        return words;
    }

    public static void main(String[] args) {
        String [] words = load_words("http://10.60.15.25/~ehar/cs219/wordle-nyt-solutions.txt",
                9);

        Arrays.sort(words);
        reverse(words);

        System.out.println(Arrays.toString(words));
    }
}


