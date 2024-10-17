package Oct.ex_11102024_encapsulation.AccessModifier.Police;

public class Cop {
   private int gun;
   private String idcard;

    public Cop(int gun)
    {
        this.gun = gun;
    }
    protected void canShoot(){
        System.out.println("yes can shoot");
    }
}
