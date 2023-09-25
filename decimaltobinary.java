package numberconversion;

public class decimaltobinary {
	public static void toBinary(int decimal) {
	int binary[] = new int[40];
	int index =0;
	while(decimal>0) {
		binary[index++] = decimal%2;
		decimal = decimal/2;
	}
		for(int i=index-1;i>=0;i--) {
			System.out.println(binary[i]);
		}
		
		System.out.println();
	}
	
	
	public static void main(String args[]) {
		System.out.println("binary no is 10:");
		toBinary(10);
		System.out.println("binary no is 21:");
		toBinary(21);
		System.out.println("binary no is 31:");
		toBinary(31);
		
	}

}
