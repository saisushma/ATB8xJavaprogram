package sept.ex_25092024_forLoop;

import java.util.Scanner;

public class Lab92_UserInput {
    public static void main(String[] args) {
        //how to take user input

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num");
        int num= sc.nextInt();
        System.out.println(num);
        System.out.println("enter the name");
        String Name = sc.next();
        System.out.println(Name);
    }
}
