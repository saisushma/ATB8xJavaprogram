package sept.ex_18092024_TypeCasting;

public class Lab34 {
    public static void main(String[] args) {
        long ph = 9876543210l;
       // short s = ph; //narrowing - implicit - JVM //-invalid
        short s1 = (short)ph; //narrowing - explicit - loss //invalid
    }
}
