package sept.ex_25092024_forLoop;

public class Lab78_forLoopQA {

    public static void main(String[] args) {
        //condtn not provided in the for=loop
        for(int i = 0;;i++)
        {
            System.out.println(i);
            //as there is no condtn within the for loop , so it went to infinite loop
            //exit 130 - is a force exiting by the keyboard
        }
    }
}
