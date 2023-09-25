package Number;

import java.util.Scanner;

public class tofindevenorodd {
	public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check even or odd ");
        num= sc.nextInt();
        if(num%2==0){
            System.out.println("Given number "+num+" is even");
        }else{
            System.out.println("Given number "+ num +" is odd");
        }
    }

}
