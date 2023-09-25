package Number;

import java.util.Scanner;

public class squareofagivenno {
	public static void main(String[] args) {
        float num,square;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the number to calculate square");
        num= sc.nextFloat();
        square = num*num;
        System.out.println("Square of "+num+" is ");
        System.out.printf("%.2f", square);
    }

}
//cube of given a no
//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//        double num,cube;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give the number to calculate cube");
//        num= sc.nextDouble();
//        cube = num*num*num;
//        System.out.println("Cube of "+num+" is ");
//        System.out.printf("%.2f",cube);
//    }
//}

//square root of a given no
//import java.util.*;
//import java.lang.Math.*;
//public class Main
//{
//    public static void main(String[] args) {
//        double num,cube;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give a number to calculate Square root" );
//        num= sc.nextDouble();
//        System.out.println("Square Root of "+num+" is ");
//        System.out.printf("%.2f",Math.sqrt(num));
//    }
//}