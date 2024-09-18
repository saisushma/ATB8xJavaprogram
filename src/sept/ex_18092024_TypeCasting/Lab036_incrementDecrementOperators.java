package sept.ex_18092024_TypeCasting;

public class Lab036_incrementDecrementOperators {

    public static void main(String[] args) {

        //increment (++) / decrement(--) operators
        //pre& post
        //ready

        //pre-increment - ++operand
        //value is incremented first and then stored in the result

//        int a = 10;
//        int b = ++a; //a = a+1;
//        // |a | output(b) |
//        //10
//        // 11| 11
//        System.out.println(b);
//
//        int a = 10;
//        System.out.println(++a); //increment first and then print
//        System.out.println(a);
            //op - 11 , 11
        //post a++
        //print first and then increase the value

        int a_post = 10;
        System.out.println(a_post++);
        System.out.println(a_post);

        //o/p - 10,11

    }
}
