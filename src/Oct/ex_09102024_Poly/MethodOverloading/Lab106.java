package Oct.ex_09102024_Poly.MethodOverloading;

public class Lab106 {

    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        int res = m.add(3,4);
        System.out.println(res);

        String name = m.add("sai", "sushma");
        System.out.println(name);
    }


}
