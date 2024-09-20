package sept.ex_20092024_conditions;

public class Lab55_QA {
    public static void main(String[] args) {

        //grade calculator:
        //write a program that calculates teh grade:
      //  A : 90-100
        //B : 80-89
        //C : 70-79
        //D:60-69
        //F : 0-59

        //90-A , 87- B , 23 - F)

        int res = 87;
//        int A = 90;
//        int B = 87;
//        int C = 23;

        char grade = 'F';

        if (res >= 90 && res <=100){
            grade = 'A';
        } else if (res<90 && res>=80) {
            grade = 'B';
        }
        else if (res<80 && res>=70) {
            grade = 'C';
        }
        else if (res<70 && res>=60) {
           grade = 'D';
        }
        else{
           grade = 'F';
        }
        System.out.println(grade);

    }
}
