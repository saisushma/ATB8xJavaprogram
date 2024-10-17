package Oct.ex_11102024_encapsulation.Practise.accessModifiers.Police;

public class Cop {
  protected  int gun;
    String idCard;

    public Cop(int gun) {
        this.gun = gun;
    }
    protected void canIShoot(){
        System.out.println("yes you can shoot, as a COP");
    }
}
