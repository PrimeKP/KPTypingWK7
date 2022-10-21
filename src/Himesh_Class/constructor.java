package Himesh_Class;

//rule for constructor to always create before main method

import java.util.Scanner;

public class constructor{

    public constructor(){
        Scanner scn = new Scanner(System.in);
        int a, b, x;
        System.out.println("Enter value of a: ");
        a = scn.nextInt();
        System.out.println("Enter value of b: ");
        b = scn.nextInt();
        x=a+b;
        System.out.println("sum of a and b is: " + x);

    }

    public constructor(int x){

        Scanner scn = new Scanner(System.in);
        int a, b;
        System.out.println("Enter value of a: ");
        a = scn.nextInt();
        System.out.println("Enter value of b: ");
        b = scn.nextInt();
        x = a - b;
        System.out.println("substraction of a and b is: " + x);

    }

    public static void main(String[] args) {

        constructor obj = new constructor();
        //constructor obj1 = new constructor(int x);

    }
}
