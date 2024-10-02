package sept.ex_25092024_forLoop;

public class Lab86_continueKeywd {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++) {
            System.out.println(i);
            if(i==5)
            {
                continue;
            }

            System.out.println("after");
            
        }
    }
}
