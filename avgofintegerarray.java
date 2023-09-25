package Number;

public class avgofintegerarray {
	public static void main(String[] args) {
	    float sum=0;
	    int i=0;
	    int[] arr = {1, 2, 3, 4, 5};
	    while(i<arr.length) {
	        sum=sum+arr[i];
	       i++;
	    }
	    float average = sum/arr.length;
	    System.out.println("Average of Array Integer is : "+average);
	    }

}
//average of number taken from user
//import java.util.*;
//public class Main
//{
//    public static void main(String[] args) {
//        float sum=0;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of array: ");
//        int n = sc.nextInt();
//        float arr[] = new float[n];
//        System.out.println("Enter " + n + " array elements: ");
//        for(int i=0; i<n; i++) {
//            arr[i] = sc.nextInt();
//            sum=sum+arr[i];
//        }
//        float average = sum/n;
//        System.out.println("Average of number is : "+average);
//    }
//}