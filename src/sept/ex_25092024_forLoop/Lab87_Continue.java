package sept.ex_25092024_forLoop;

public class Lab87_Continue {
    public static void main(String[] args) {
      //print the values of even and odd nums from 0 to 50
        for (int i = 0; i <=50 ; i++) {
            if(i%2 == 0)
            {
                System.out.println("even : "+i);
                continue;
            }
            System.out.println(i);
            
        }
    }
}
