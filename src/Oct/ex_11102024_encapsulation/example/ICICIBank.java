package Oct.ex_11102024_encapsulation.example;

public class ICICIBank {

    //encapsulation is a fundamnetal concept in oops
    //bundling of data and methods that operate on that data within a single
    //data members should be private


    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isAdmin) {

      if(isAdmin){
          this.bal = bal;
          System.out.println("admin");
      }

      else{
          System.out.println("not an admin to change");;
      }
    }
}
