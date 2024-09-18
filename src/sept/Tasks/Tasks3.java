package sept.Tasks;

public class Tasks3 {

    public static void main(String[] args) {
/*
        Difference between = and  ==?

        = is an assignment operator eg: int a=10;
        == is used to compare the values if both are equal or not.
       */

        int a1= 10;
        boolean b1 = (10==11);

/*
        byte b = 10; long l = 10l; → How much Byte will be used.

        b = 1 byte
        long = 8 8 bytes , so total 8+1 = 9 bytes

        String s = "name" //8 bytes

       Another byte b = 10; byte c = 10;  What is the anwser if the perform b+c,
       What is the data type it will give in result.

       By default it leads to int  i.e greater version of byte
                */


        byte b = 10;
        byte c= 10;
        System.out.println(b+c);


        // if you print character then it prints charcter, but if you print concatination of the charcters, it
        //will take ASCII value
        char c1='A';
        System.out.println(c1);
        char d1 = 'B';
        int e1 = c1+d1;
        System.out.println(e1);


    }
}
