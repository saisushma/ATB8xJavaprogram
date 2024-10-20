package Oct.Tasks.task_18102024;

public class Palindrome {

    public static void main(String[] args) {

        String str = "lalal";
        String str1="";

        for(int i = str.length()-1;i>=0;i--){

            str1+=str.charAt(i);
        }

        if(str.equals(str1)){
            System.out.println("given string is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}