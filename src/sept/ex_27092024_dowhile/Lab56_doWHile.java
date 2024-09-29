package sept.ex_27092024_dowhile;

public class Lab56_doWHile {

    public static void main(String[] args) {
        // while - intialization -> condtn-> body ->  -> incr/decrement
        //do while - intialization -> body -> condtn -> incr/decrement

        int a = 0;
        do {
            System.out.println("print"+a);
            a++;
        }while(a<10);

    }
}
