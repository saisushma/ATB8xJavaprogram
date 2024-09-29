package sept.ex_27092024_dowhile;

import java.util.Scanner;

public class Lab61_QA {


      //  ✅ Triangle Classifier ( If)

// Write a program that classifies a triangle based on its side lengths.

// Given three input values representing the lengths of the sides, determine

// if the triangle is equilateral (all sides are equal),

// isosceles (exactly two sides are equal), or

// scalene (no sides are equal).

// Use an if-else statement to classify the triangle.

// side1, side2, side3 ->

    public static void main(String[] args) {

        //step-1:
        //sides of triangle - double

        //always talk to your interviews and give them extra
        //edge you  need to give them a

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side 1: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter the length of the side 2: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter the length of the side 3: ");
        double side3 = sc.nextDouble();

        if(side1 >=1 && side2>=1 && side3>=1) {

            if (side1 == side2 && side1 == side3 && side2 == side3) {
                System.out.println("equilatoral triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("is a isolated triangle");
            } else {
                System.out.println("scalene triangle");
            }
        }
        else{
            System.out.println("Are you mad? , negative sides");
        }
    }
}
