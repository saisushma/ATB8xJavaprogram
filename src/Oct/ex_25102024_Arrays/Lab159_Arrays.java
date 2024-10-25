package Oct.ex_25102024_Arrays;

public class Lab159_Arrays {
    public static void main(String[] args) {

        int [] marks = {51,100,91,87,90};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
       // System.out.println(marks[5]); //array index out of bound exception


        int[] marks2 = new int[5];
        marks2[0]=1;
        marks2[1]=12;
        marks2[2]=23;
        marks2[3]=43;
        marks2[4]=56;

        System.out.println(marks2);
    }
}
