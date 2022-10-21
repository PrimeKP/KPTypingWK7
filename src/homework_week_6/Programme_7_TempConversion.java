package homework_week_6;

import java.util.Scanner;

public class Programme_7_TempConversion {

    public static void main(String[] args){

        //Scanner declaration for reading input from consile
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temprature in fahrenheit : ");
        float temp = scanner.nextFloat();
        //Object creation
        Programme_7_TempConversion t = new Programme_7_TempConversion();
        t.convertTempToDegreeCelsius(temp);

    }
    //Temprature conversion method
    public void convertTempToDegreeCelsius(float temp){
        float c = ((temp - 32) * 5 / 9);
        System.out.println("The temprature " + temp + " fahrenheit is equal to " + c + " degree celsius");
    }
}
