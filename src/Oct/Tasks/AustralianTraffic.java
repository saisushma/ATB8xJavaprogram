package Oct.Tasks;

public class AustralianTraffic implements  CentralTrafficInterface, ContinentalTraffic{
    public static void main(String[] args) {

        CentralTrafficInterface a = new AustralianTraffic();
        a.redStop();
        a.flashYellow();
        a.greenGo();

        AustralianTraffic at = new AustralianTraffic();
        at.walk();



    }

    @Override
    public void greenGo() {
        //code

        System.out.println("green GO implementation");
    }

    public void walk(){
        System.out.println("Im walking");
    }

    @Override
    public void redStop() {
    //code
        System.out.println("redstop implementation");

    }

    @Override
    public void flashYellow() {
        //code
        System.out.println("yellow implementation");


    }

    @Override
    public void TrainSymbol() {
        System.out.println("train symbol");
    }
}
