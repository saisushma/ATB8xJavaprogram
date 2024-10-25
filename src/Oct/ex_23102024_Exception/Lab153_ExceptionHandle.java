package Oct.ex_23102024_Exception;

public class Lab153_ExceptionHandle {
    public static void main(String[] args) {

        int a = 0;
       try{
           int c= 10/a;
           System.out.println(c);
       }catch(Exception e){
           System.out.println(e.getMessage());
           throw new ArithmeticException();
       }
       finally{
           System.out.println("i will always execute");
       }
    }
}
