package HW5;

public class Exercise66 {
    public static boolean canSpell(String word, String tiles) {
        for (int i = 0; i < word.length(); i++){
            int j = tiles.indexOf(word.charAt(i));
                if (j == -1) {
                    return false;
                }
                else{
                tiles = tiles.substring(0, j) + tiles.substring(j + 1, tiles.length());
                }
            }
        return true;
        }

    public static void main(String [] args) {
        System.out.println(canSpell("boot", "axobasrto"));
        System.out.println(!canSpell("hippo", "haxobapsrito"));
        System.out.println(canSpell("hi", "itchy"));
        System.out.println(!canSpell("hi", "hello"));
        System.out.println(!canSpell("hair", "apple"));
        System.out.println(canSpell("bit", "burlington"));

    }

}
