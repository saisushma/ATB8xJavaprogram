package Oct.ex_11102024_encapsulation.Practise.accessModifiers.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop jrCop = new Cop(20);
        System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}
