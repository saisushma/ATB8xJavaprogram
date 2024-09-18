package sept.ex_18092024_TypeCasting;

public class Lab035 {
    public static void main(String[] args) {

        //GST= 18.45;
        int course = 100;
        float GST = 18.45f;
        //int total_price = course+GST; //narrowing - Implicit-JVM-invalid
        float total_price = course+GST; //widening - explicit casting-JVM- - no loss - valid;
        System.out.println(total_price);

        int total1_price = course+(int)GST; //narrowing - explicit - LOSS
        System.out.println(total1_price);

    }
}
