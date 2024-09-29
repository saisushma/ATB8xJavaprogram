package sept.Tasks.sept232024;

public class Task2_23092024 {
    public static void main(String[] args) {
        //Write a program that takes an integer input (1-12) and
        // prints the name of the corresponding month using a switch statement.
        //Input  - 12
        //Out - Dec.
        String month = "Dec";

        switch (month){

            case "Jan":
                System.out.println("January");
                break;
            case "Feb":
                System.out.println("February");
                break;
            case "Mar":
                System.out.println("March");
                break;
            case "Apr":
                System.out.println("April");
                break;
            case "May":
                System.out.println("May");
                break;
            case "Jun":
                System.out.println("June");
                break;
            case "Jul":
                System.out.println("July");
                break;
            case "Aug":
                System.out.println("August");
                break;
            case "Sept":
                System.out.println("September");
                break;
            case "Oct":
                System.out.println("October");
                break;
            case "Nov":
                System.out.println("November");
                break;
            case "Dec":
                System.out.println("December");
                break;
            default:
                System.out.println("not a valid input");
                break;

        }

    }
}
