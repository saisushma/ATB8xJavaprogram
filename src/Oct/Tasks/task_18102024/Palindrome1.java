package Oct.Tasks.task_18102024;

public class Palindrome1 {

    public static void main(String[] args) {

        String str = "lalali";
        //String str1="";
        boolean isPalindrome = true;

        for(int i = str.length()-1; i>=0;i--)
        {
            if(str.charAt(i)!=str.charAt(str.length()-1-i))

            {
                isPalindrome= false;
                System.out.println("given string is not a palindrome");
                break;
            }
        }

        if(isPalindrome){
            System.out.println(" given string is a palindrome ");
        }

    }
}