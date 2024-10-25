package Oct.ex_21102024_WrapperException;

public class Lab149_MultipleExceptions {
    public static void main(String[] args) {

        int c = 10;
        try {
             c = 10/c;
             String s1 = null;
             s1.trim();
            System.out.println(c);
        } catch (ArithmeticException | NullPointerException e) {

            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
