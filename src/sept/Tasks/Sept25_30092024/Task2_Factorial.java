package sept.Tasks.Sept25_30092024;

import java.util.Scanner;

public class Task2_Factorial {
    public static void main(String[] args) {

        //  Factorial Program - n = 5 , Output = 120 //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        // n = 1 ->  Fact = 1*1 -> 1
        // n = 3 -> Fact = 3*2*1 -> 6
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num for calulcating its factorial value");
        int num = sc.nextInt();
        int val= 1;

        for(int i=1;i<=num;i++)
        {
           val=val*i;
        }

        System.out.println(val);
    }
}
