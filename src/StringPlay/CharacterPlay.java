package StringPlay;

public class CharacterPlay {

    public static int countVowels(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); //get character at index i
            if (ch == 'a') {
                count++;
            }
        }
       return count;
    }



    public static void main(String [] args) {
        char ch = 'a'; // 'a' is just shorthand for an integer code
        // assigned by the Unicode Consortium
        System.out.println(ch);
        System.out.println((int) ch);
        System.out.println((char) ('a' + 1));
        System.out.println((char) 8749);
        System.out.println((char) 198);
        System.out.println((char) 960);

        System.out.println(countVowels("applesauce") == 5);
        System.out.println(countVowels("Hippopotomonstrosesquippedaliaphobia") == 16);
    }
}
