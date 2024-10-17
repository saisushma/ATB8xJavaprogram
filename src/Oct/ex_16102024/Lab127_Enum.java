package Oct.ex_16102024;

public class Lab127_Enum {
    public static void main(String[] args) {
        System.out.println(Color.RED.hexacode());
    }
}

enum Color{
    RED("#FF789"),
    GREEN("#61FF33"),
        BLUE("#34567");

    private String hexcode;

    private Color(String hexcode) {
        this.hexcode = hexcode;
    }
    String hexacode(){
        return this.hexcode;
    }

}