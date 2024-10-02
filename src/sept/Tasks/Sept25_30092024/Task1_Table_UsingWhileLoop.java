package sept.Tasks.Sept25_30092024;

import java.util.Scanner;

public class Task1_Table_UsingWhileLoop {
    public static void main(String[] args) {

        //table
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num for the table");
        int num = sc.nextInt();

        int i=1;
        while(i<=10)
        {
            System.out.printf("%d * %d = %d \n", num,1,num*i);
            i++;
        }
    }
}
