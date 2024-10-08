package sept.Tasks.Sept25_30092024;

import java.util.Scanner;

public class Task5_PrimeNumbers {
    //Prime Number from between 2 given nums

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("starting from which number do you need to check the prime numbers");
        int num=sc.nextInt();
        System.out.println("till which number do you need to check the prime numbers");
        int num1=sc.nextInt();
        int sum=0;
        for(int j=num;j<num1;j++) {
           int count = 1;
           int i =2;
           while (i < j) {
               if (j % i == 0) {
                   count++;
//                   System.out.printf("%d is not prime \n",j);
                   break;
               }
               i++;
           }
            if (count == 1) {
                System.out.println(j);
               sum++;
           }
       }
        System.out.printf("num of primes between %d and %d is %d",num,num1,sum);

    }
    }

