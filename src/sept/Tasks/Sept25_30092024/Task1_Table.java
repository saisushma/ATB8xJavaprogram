package sept.Tasks.Sept25_30092024;

import java.util.Scanner;

public class Task1_Table {
    public static void main(String[] args) {

        //table
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num for the table");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d * %d = %d \n", num,1,num*i);
        }
    }
}
