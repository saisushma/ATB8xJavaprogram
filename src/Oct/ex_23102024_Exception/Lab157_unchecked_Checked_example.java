package Oct.ex_23102024_Exception;

public class Lab157_unchecked_Checked_example {
    public static void main(String[] args) {

        try {
            int a = 10/0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
        }
    }
}
