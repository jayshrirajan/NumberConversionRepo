package Number;

import java.util.Scanner;

public class givennoisperfectornot {
	public static void main(String ...args){
        int remainder, sum=0, i, originalNum;
        Scanner sc= new Scanner(System.in);
        System.out.print("please enter a number: ");  
        originalNum = sc.nextInt();  
        for (i = 1; i <= originalNum/2; i++)
        {
            remainder = originalNum % i;
            if (remainder == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == originalNum)
            System.out.print("given no. is perfect number");
        else
            System.out.print("given no. is not a perfect number");
    }

}
