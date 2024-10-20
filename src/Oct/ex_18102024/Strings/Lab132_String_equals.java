package Oct.ex_18102024.Strings;

public class Lab132_String_equals {
    public static void main(String[] args) {
        String s1 = "hello"; //SCP
        String s4 = "hello";

        String s2 = new String("hello"); //Object area
        String s3 = new String("hello");//Object area
        String s5 = new String("HELLO");

        System.out.println(s1==s2); //false
        System.out.println(s2==s3); //false
        // == is checking the ref location
        //new keyword is used, it creates a new object

        // to check the values of the String


        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s5.equals(s3));
        System.out.println(s5.equalsIgnoreCase(s3));

    }
}
