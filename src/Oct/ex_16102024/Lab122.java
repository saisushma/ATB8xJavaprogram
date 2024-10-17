package Oct.ex_16102024;

public class Lab122 {
    public static void main(String[] args) {

        Book book = new PrintMyBook("pramod", "PD", 123);
        PrintMyBook bk = new PrintMyBook("pramod","PD",123); //both the statements can be written
        book.getDetails();
        }
    }

