package Oct.ex_21102024_WrapperException;

public class Lab146_Exceptions {
    public static void main(String[] args) {

        int c = 10;
        try {
             c = 10/0;  // java.lang.ArithmeticException - terminated
            System.out.println(c);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
