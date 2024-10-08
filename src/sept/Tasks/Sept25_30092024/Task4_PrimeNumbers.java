package sept.Tasks.Sept25_30092024;

import java.util.Scanner;

public class Task4_PrimeNumbers {
    //Prime Number from 1 to 100. (for loop)

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Till which number do you need to check the prime numbers");
        int num=sc.nextInt();
        int sum=0;
        for(int j=2;j<num;j++) {
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
        System.out.printf("num of primes less than %d is %d",num,sum);

        /* Algorithm:
        1.Verify whether the number is a prime or not.
        2. First, get the number as an input
        3. Check if it is divisible by any number which is greater than or equal to 2
        4. If it is divisible by any one number then it is not a prime number, then break the loop
        5. Else then it is a prime number.
         */
    }
    }

