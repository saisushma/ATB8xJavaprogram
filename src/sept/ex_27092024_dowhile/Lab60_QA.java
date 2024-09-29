package sept.ex_27092024_dowhile;

import java.util.Scanner;

public class Lab60_QA {

    public static void main(String[] args) {


        //Write a program that prints numbers from 1 to 100. However,
        // for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
        // For numbers that are multiples of both 3 and 5, print "FizzBuzz."


        //logic buidling

        //step -1
        //input -> int - n > n = 100 - scanner class
        //output - string -> fizz , buzz & fizbuzz - sop

        //step -2 ":
        //rough logic
//    for -> int =1 to i <=100(n)
        // i -> multiple of 3 -> i%3 ==0 -> fizz
        // i -> multiple of 5 -> i%5 ==0 -> buzz
        // i -> multiple of 3 and 5 ->i%3 ==0 && i%5 ==0 -> fizzbuzz

        //step 3 : real logic

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num n = 100");

        int n = sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else if (i % 3 == 0 ) {
                System.out.println("fizz");
            } else {
                System.out.println(i);
            }

        }

    }


}
