package Oct.Tasks.tasks_25102024;

import java.util.Scanner;

public class Arrays_RightTriangle_Arrays_2D {

    /*

   *****
   ****
   ***
   **
   *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num = 5");
        int n = sc.nextInt();

        for(int i=n; i>0 ;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
