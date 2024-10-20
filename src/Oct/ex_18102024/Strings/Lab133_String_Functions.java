package Oct.ex_18102024.Strings;

public class Lab133_String_Functions {
    public static void main(String[] args) {

        //length
        String str = "hello world";
        System.out.println("Length: "+str.length());

        //substring
        System.out.println("Substring is "+str.substring(0,4));

        //trim
        System.out.println("trimmed: "+str.trim()+ " '");

        //convert to lowercase
        System.out.println("Uppercase"+str.toLowerCase());
        //convert to upercase
        System.out.println("Uppercase"+str.toUpperCase());

        //charat
        System.out.println(str.charAt(3));

        //equals
        System.out.println(str.equals("hello"));

        System.out.println(str.indexOf("e"));
        System.out.println(str.contains("l"));
        System.out.println(str.contains("p"));
        System.out.println(str.isEmpty());

        System.out.println(str.split(" "));

        //compare to string
        String name = " Pramod DUtta ";
        String name2 = "PramoD";

        System.out.println(name.compareTo(name2));

        //comapre to - O - if both of them are same

        //return number - diff of ASCII values  - between the string

        //d=> D - lexicographically comparison

        System.out.println(name.strip());

    }


}
