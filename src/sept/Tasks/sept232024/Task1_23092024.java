package sept.Tasks.sept232024;

public class Task1_23092024 {
    public static void main(String[] args) {

//Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
//
//Inputs :   num 1, num 2, +
//Output :  num1+num2 → print information.
    int num1 = 40;
    int num2 = 30;

    String choice = "mod";

    switch(choice){

        case "add" -> System.out.println(num1+num2);
        case "sub" -> System.out.println(num1 - num2);
        case "mul" -> System.out.println(num1*num2);
        case "div" -> System.out.println(num1/num2);
        case "mod" -> System.out.println(num1%num2);
        default -> System.out.println("not provided");
    }
    }
}
