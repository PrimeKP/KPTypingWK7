package homework_week_6;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUppertoLowerCase {

    public static void main(String[] args){
        //Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUppertoLowerCase t = new Programme_9_ConvertUppertoLowerCase();
        t.convertUpperCaseToLowerCase(uppercase);
        //closing the scanner object
        scanner.close();

    }

    //Conversion of Uppercase to lower case method
    public void convertUpperCaseToLowerCase(String text){
        System.out.println("The LowerCase value is = " + text.toLowerCase());
    }

}
