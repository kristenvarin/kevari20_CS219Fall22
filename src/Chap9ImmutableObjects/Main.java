package Chap9ImmutableObjects;

public class Main {

    public static void main(String[] args) {

        String s = "hello";
        String t = new String("hello");

        // make a version of s that is capitalized
        // this is a static method
        String s1 = Character.toUpperCase(s.charAt(0)) + s.substring(1);

        // strings are immutable
        // character objects are also immutable

        char ch = 'a';
        // char is a primitive type (has a direct representation of binary)
        // capitalized Character is char's non-primitive type
        Character ch12 = 'z';
        // Character ch3 = new Character('a');
        int x = 33;
        Integer y = 33;
        // y is a reference to the object; the chuck of code that contains 33 is the object
        // Integer y1 = new Integer(33);

        double pi = 3.14;
        Double pi1 = 3.14;
        Boolean flag = false;
        Long ll = 43L;
        // changed the reference, not the object;
        pi1 = 2.7;

        // Double, Long, Integer, Boolean, Character are all wrapper classes
        // for their respective primitive type.
        // taking a primitive value and wrapping in an object is autoboxing
        // turning an object into its primitive is called autounboxing

        Student student1 = new Student("Hermione", "Granger",
                "123", "The Smart One");
        // student1.first = "Harry"; // error
        // student1.nickname = ""; // dont have access because we made it private
        System.out.println(student1);
        // toString is implicitly called

        Student student2 = new Student("Kristen", "Varin",
                "14005697", "The Swag Monster");
        System.out.println(student2);

    }

}
