package Oct.Tasks;

public class Assignment1 {
    public static void main(String[] args) {
       int k=1;
        for(int i=1; i< 4;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print(3*k);
                System.out.print("\t");
                k++;
            }
            System.out.println(" ");
        }

    }
}

/* output:
3
6 9
12 15 18
 */
