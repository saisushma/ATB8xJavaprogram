package Oct.ex_21102024_WrapperException;

public class Lab142_Exception {
    public static void main(String[] args) {

        System.out.println("start of the program");
        String ip = args[0]; //10 //ArrayIndexOutOFBoundException
        int a = Integer.parseInt(ip); //10 -> NumberFormatException
        int b = 1000/a; //100 - ArthimeticException if divided by zero.

        System.out.println(b);
        System.out.println("End of the program");


        //jvm will be initalised [RAM]
        //creates and starts the main Thread - main is called
        //1 - collects the CLI arguments - 10
        //String [ ] args = {10}  ->
        //2. Lab142_execption.main()
        //now control will be transferred from  main thread to main method

        //when problem comes in the
    }
}
