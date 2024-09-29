package sept.Tasks.sept27092024;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        //Create a Java program that prints the first 5 even numbers using a do-while loop.

        int num= 1;
        int count =0;
        do{
           if( num%2 ==0)
           {
               System.out.println(num);
               count++;
           }
           num++;
        }while(count<5);
    }
}
