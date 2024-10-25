package Oct.ex_21102024_WrapperException;

public class Lab141_Exception {
    public static void main(String[] args) {

        System.out.println("start of the program");
        String ip = args[0];
        String ip1 = args[1];
        String ip2 = args[2];

        String ip33 = args[3]; //ArrayIndexoutOfBoundException

        System.out.println(ip);
        System.out.println(ip1);
        System.out.println(ip2);
    }
}
