package Number;

import java.util.Scanner;

public class firstnprimenumber {
	public static void main(String[] args) {
	    int i=0,n,temp,temp1=1;
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Java Program to print first n prime numbers ");
	    n= sc.nextInt();
	    System.out.println("Prime numbers are before "+n);
	    while(temp1<=n){
	        temp=0;
	        for(i=2;i<=(temp1/2);i++){
	            if(temp1%i==0)
	            {
	                temp=1;
	                break;
	            }
	        }
	        if(temp==0){
	            System.out.println(temp1);
	        }
	        temp1++;
	        }
	    }

}
// print prime no in a given range
//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//    int i=0,fNum,sNum, temp,temp1=1;
//    Scanner sc = new Scanner(System.in);
//    System.out.println("Please give the first number");
//    fNum= sc.nextInt();
//    System.out.println("Please give the second number");
//    sNum= sc.nextInt();
//    System.out.println("Prime numbers in range "+fNum+ " and " +sNum+"are");
//    while(fNum<=sNum){
//        temp=0;
//        for(i=2;i<=(fNum/2);i++){
//            if(fNum%i==0){
//                temp=1;
//                break;
//            }
//        }
//        if(temp==0)
//            System.out.println(fNum);
//        fNum++;
//    }
//}
//}
