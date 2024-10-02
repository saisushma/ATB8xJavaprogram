package sept.ex_30092024_functions;

public class Lab74_voidFunction {
    public static void main(String[] args) {

        FunctionName();
        greet();

        for(int i = 0;i<10; i++)
        {
            greet();
        }
    }


    //defining part of the function
    //no return type and no argument // without parameters and without return type


    public static void FunctionName()
    {
        System.out.println("this is a void function");
    }
    public static void greet(){
        System.out.println("Hi");
    }
}

