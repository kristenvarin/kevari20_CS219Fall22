package Chapter6Exercises;

public class Exercise64 {

    public static String toLower(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ('A' <= ch && ch <= 'Z')
                r = r + (char) ('a' + (ch - 'A'));
            else
                r = r + ch;
        }
        return r;
    }
    public static boolean isAbcedarian(String s) {
        s = s.toLowerCase();
        s = toLower(s);

        for (int i = 0; i < s.length()-1; i++) {

            if (s.charAt(i) > s.charAt(i+1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAlphabetical(String s) {
        // rewrite using a while loop
        int i = 0;
        while (i < s.length() - 1) {
            if (s.charAt(i) > s.charAt(i+1)){
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String [] args) {
        System.out.println(isAbcedarian("biopsy"));
        System.out.println(!isAbcedarian("apple"));
        System.out.println(isAlphabetical("biopsy"));
        System.out.println(!isAlphabetical("apple"));
        System.out.println(toLower("APPLE"));
        System.out.println(toLower("Apple!!&*"));
    }

}
