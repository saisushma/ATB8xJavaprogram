package Oct.Tasks.task_18102024;

public class StringLength {

    public static void main(String[] args) {

        String str = "sai sushma";
        int count = 0;

        for(char c : str.toCharArray())
        {
            count++;
        }

        System.out.println(count);
    }

}
