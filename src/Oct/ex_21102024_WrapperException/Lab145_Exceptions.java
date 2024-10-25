package Oct.ex_21102024_WrapperException;

public class Lab145_Exceptions {
    public static void main(String[] args) {

        String s1 = null; // java.lang.NullPointerException - terminated
        System.out.println(s1.trim());
        // in this case, until you run JVM doesnt know about the exception - called unchecked exception.
    }
}
