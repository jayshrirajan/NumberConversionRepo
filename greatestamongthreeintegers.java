package Number;

import java.util.Scanner;

public class greatestamongthreeintegers {
	public static void main(String ...args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter first number- ");  
        int a= sc.nextInt();  
        System.out.print("Enter second number- ");  
        int b= sc.nextInt();  
        System.out.print("Enter third number- ");  
        int c= sc.nextInt();  
        if(a>=b && a>=c)
            System.out.println(" a is greatest");
        if(b>=a && b>=c)
            System.out.println(" b is greatest");
        if(c>=a && c>=b)
            System.out.println("c is greatest");
    }

}
//smallest no among three integrs
//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//        int a, b, c;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please give the first number");
//        a= sc.nextInt();
//        System.out.println("Please give the second number");
//        b= sc.nextInt();
//        System.out.println("Please give the third number");
//        c= sc.nextInt();
//        if(a<=b && a<=c)
//            System.out.println("a is smallest");
//        if(b<=a && b<=c)
//            System.out.println("b is smallest");
//        if(c<=a && c<=b)
//            System.out.println("c is smallest");
//    }
//}
