package Oct.ex_21102024_WrapperException;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab143_Exceptions {
    public static void main(String[] args) {

        //checked exception - JVM knows about it.
      //  FileInputStream file = new FileInputStream("C://a.txt");

        //JVM knows that file may or may not exists.


        int a = 10;
        int c = a/0;
        System.out.println(c);
        // in this case, until you run JVM doesnt know about the exception - called unchecked exception.
    }
}
