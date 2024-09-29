package sept.Tasks.sept27092024;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
//Write a Java program that calculates the sum of numbers from 1 to 100 using a while loop.

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num ");

        int num = sc.nextInt();
        int sum=0;

        while(num>0)
        {
            sum=sum+num;
            num--;
        }
        System.out.println(sum);
    }
}
