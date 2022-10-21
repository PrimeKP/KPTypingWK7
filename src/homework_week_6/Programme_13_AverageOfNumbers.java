package homework_week_6;

/*
 *Write a Java program that takes three numbers as input to calculate and
 *print the average of the numbers.
 */

import java.util.Scanner;

public class Programme_13_AverageOfNumbers {

    public static void main(String[] args){

        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double x = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double y = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double z = scanner.nextDouble();
        averageOfThreenumber(x, y , z);
        //closing the scanner object
        scanner.close();
    }
    //Calculate the average of three number
    public static void averageOfThreenumber(double a, double b, double c) {
        double average = (a + b + c) / 3;
        System.out.print("The average of " + a + ", " + b + ", " + c + " is " + average );

    }

}
