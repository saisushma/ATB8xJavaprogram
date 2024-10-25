package Oct.ex_23102024_Exception;

public class Lab158_CustomException {

    public static void main(String[] args) throws Exception{

        Bank sbi = new Bank("INR",100);
        Bank icici = new Bank("INR",123);
        Bank jp_morg = new Bank("USD",100);
        System.out.println(icici.add(sbi));
        System.out.println(jp_morg.add(icici));


    }
}
