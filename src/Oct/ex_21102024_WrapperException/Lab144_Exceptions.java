package Oct.ex_21102024_WrapperException;

public class Lab144_Exceptions {
    public static void main(String[] args) {

        int a = 10;
        int c = a/0;  // java.lang.ArithmeticException - terminated
        System.out.println(c);
        // in this case, until you run JVM doesnt know about the exception - called unchecked exception.
    }
}
