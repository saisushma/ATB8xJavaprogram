package sept.ex_25092024_forLoop;

public class Lab88_forLoopPreIncrement {
    public static void main(String[] args) {
//        for (int i = 0; i < 10 ; ++i) {
//            System.out.println(i);
//        }
//        System.out.println("===========");
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
        for(char i = 'A'; i<='Z';i++)
        {
            if(i=='P')
            {
                break;
            }
            System.out.println(i);
        }
    }
}
