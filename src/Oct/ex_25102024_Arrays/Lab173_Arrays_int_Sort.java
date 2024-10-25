package Oct.ex_25102024_Arrays;

import java.util.Arrays;

public class Lab173_Arrays_int_Sort {

    public static void main(String[] args) {

        //int[] marks2 = new int[5];
        int [] marks = {51,100,91,87,90};

        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);

        Arrays.sort(marks);

        for(int i = 0; i<marks.length;i++) {
            System.out.println(marks[i]);
        }
            int item = Arrays.binarySearch(marks,100);
            System.out.println(item);
        }


    }


