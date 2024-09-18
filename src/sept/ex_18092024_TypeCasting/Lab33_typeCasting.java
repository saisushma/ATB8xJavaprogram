package sept.ex_18092024_TypeCasting;

public class Lab33_typeCasting {

    public static void main(String[] args) {

        //It has 2 types of type casting
        //
        //Widening - implicit, explicit - lossless
        //Narrowing - implicit , explicit (with datatype), loss

        //WIDENING
        byte b = 10;
        int a = b; //valid sytax - implicit casting - JVM does it automatically without any loss
        System.out.println(a);
        int a1 =(int)b; //valid - explicit casting - JVM

        //NARROWING

        int val = 300;
       // byte b1 =val; //invalid implicit casting - JVM
        byte b2 =(byte) val; //invalid explicit casting - Loss of data [ whatever is stored will be stored rest will be lost]
        System.out.println(b2);



    }
}
