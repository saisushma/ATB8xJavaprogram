package Oct.ex_11102024_encapsulation.Practise.eg;

public class ICICIBank {
    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName(boolean Admin) {
        if (Admin) {
            return name;
        }
     else{
            System.out.println("not authenticated");
        }
        return "Null";
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
            System.out.println("admin is allowed");
            System.out.println(bal);
        }else{
            System.out.println("not allowed");
        }

    }
}
