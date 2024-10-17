package Oct.ex_11102024_encapsulation.Practise.eg;

public class Lab121
{
    public static void main(String[] args) {
        ICICIBank sai = new ICICIBank("sai",1000);

        sai.setBal(10000000,true);
        sai.getName(true);
    }

}
