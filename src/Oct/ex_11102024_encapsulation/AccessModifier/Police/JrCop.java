package Oct.ex_11102024_encapsulation.AccessModifier.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop JrCop = new Cop(10);

        JrCop.canShoot();

        //protected - same package is allowed
    }
}
