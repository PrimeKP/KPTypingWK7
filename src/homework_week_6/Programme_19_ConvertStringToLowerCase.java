package homework_week_6;

import java.util.Scanner;

/**
 * Write a Java program to convert a given string into lowercase.
 * Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 * Output: the quick brown fox jumps over the lazy dog.
 */

public class Programme_19_ConvertStringToLowerCase {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter upper case sentence: ");
        String upperCase = scn.nextLine();
        Programme_19_ConvertStringToLowerCase t = new Programme_19_ConvertStringToLowerCase();
        t.convertStringToLowerCase(upperCase);
        scn.close();
    }
    //convert string to lower case
    public void convertStringToLowerCase(String str){
        System.out.println("The lower case of the string is " + str.toLowerCase());
    }

}
