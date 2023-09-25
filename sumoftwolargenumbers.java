package numberconversion;

import java.math.BigInteger;

public class sumoftwolargenumbers {
	
		public static void main(String []args){
			String str="7777555511111111";
			String str1="3332222221111";
			
			BigInteger a=new BigInteger(str); // creating obj of biginteger and pass str in it
			BigInteger b=new BigInteger(str1); // creating obj of biginteger and pass str1 in it
			
			System.out.println(a.add(b)); //add
			
		}
	}

// to add two  binary strings

//public class GFG {
//
//		static String addBinary(String A, String B)
//	{
//		// initialize the ith index
//		int i = A.length()-1;
//		// initialize the jth index
//		int j = B.length()-1;
//		// initialize the carry
//		int carry = 0;
//	// initialize the sum
//		int sum = 0;
//		StringBuilder result = new StringBuilder();
//		while(i>=0 || j>=0 || carry == 1){
//			sum = carry;
//			if(i>=0) sum = sum+A.charAt(i)-'0';
//			if(j>=0) sum = sum+B.charAt(j)-'0';
//			result.append((char)(sum%2+'0'));
//			carry = sum/2;
//			i--;
//			j--;
//		}
//		return result.reverse().toString();
//	}
//
//	
//	public static void main(String args[])
//	{
//		String a = "1101", b="100";
//		
//		System.out.print(addBinary(a, b));
//	}
//}





