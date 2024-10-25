package Oct.ex_23102024_Exception;

public class Lab154_Exception_MultiCatch {
    public static void main(String[] args) {

        try {
            String ip = args[0]; //java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);
            int b = 100 / a;
            System.out.println(b);
        } catch (NumberFormatException ex) {
            throw new RuntimeException(ex);
        }catch (ArithmeticException ex) {
        throw new RuntimeException(ex.getMessage());
    }

    }
}
