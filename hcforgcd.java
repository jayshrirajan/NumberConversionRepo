package Number;

import java.util.Scanner;

public class hcforgcd {
	
	    public static void main(String[] args) {
	        double num1,num2,gcd=0;
	        System.out.println("Java Program to calculate HCF/GCD " );
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Please give first number");
	        num1= sc.nextDouble();
	        System.out.println("Please give second number");
	        num2= sc.nextDouble();
	        for(int i=1; i <= num1 && i <= num2; ++i)
	        {
	            if(num1%i==0 && num2%i==0)
	            gcd = i;
	        }
	        System.out.println("G.C.D of number "+num1+" and "+num2+" = " +gcd);
	    }
	}
//to find gcd of two numbers using recursion
//public class GCDRecursive {
//    public static int findGCD(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return findGCD(b, a % b);
//    }
//
//    public static void main(String[] args) {
//        int num1 = 48;
//        int num2 = 36;
//
//        int gcd = findGCD(num1, num2);
//        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
//    }
//}

//celsius to farenheit
//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//        float celsius, fahrenheit;
//        System.out.println("Program to convert Celsius to Fahrenheit" );
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give the Celsius Temperature");
//        celsius= sc.nextFloat();
//        fahrenheit = (celsius * 9 / 5) + 32;
//        System.out.printf("Fahrenheit = %.2f",fahrenheit);
//    }
//}
//fahrenheit to celsius
//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//        float celsius, fahrenheit;
//        System.out.println("Program to convert Fahrenheit to Celsius" );
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give the Fahrenheit Temperature");
//        fahrenheit= sc.nextFloat();
//        celsius = ((fahrenheit-32)*5)/9;
//        System.out.printf("Celsius = %.2f",celsius);
//    }
//}



