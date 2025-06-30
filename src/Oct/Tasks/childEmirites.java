package Oct.Tasks;

public class childEmirites extends Airlines{

    public static void main(String[] args) {
        childEmirites c = new childEmirites();
        c.airlinesColor();
        c.airlineGuidelines();
        c.systemGuidelines();
    }
    @Override
    public void airlinesColor() {
        System.out.println("my color is red");
    }
}
