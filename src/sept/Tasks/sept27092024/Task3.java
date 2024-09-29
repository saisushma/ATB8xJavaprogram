package sept.Tasks.sept27092024;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num ");

        int num = sc.nextInt();
        int sum=0;
     //   int i=1;

        while(num>0)
        {
            sum=sum+num;
            num--;
        }
        System.out.println(sum);
    }
}
