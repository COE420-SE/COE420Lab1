
public class Calculations {

	public static void main(String[] args) {
		int x = 2;
		int y = 1;
		
		//sum of x and y 
		int sum = x+y;
		System.out.println("The sum is= "+ sum);
		
		int sub = x-y;
		System.out.println("The sub is= "+ sub);
		//member_B add the feature of subtracting x from y and print the result
		
		//member_C add the feature of dividing x by y and print the result
		int div = x/y;
		System.out.println("The division is= "+ div);
		
		//member_D add the feature of multiplying x by y and print the result
		int multiply = x*y;
		System.out.println("The multiplication is= "+ multiply);
		
		
		//Exercise 5: Spot the issues to be reported
		addition(4,5); // should print the sum of the values provided
		System.out.println(welcome()); //corrected
		// should print the welcome message to the console
	}
	
	public static int addition(int w, int z) {
		int sum = w + z;//corrected
		return sum; 
	}
	
	public static String welcome() {
		return "Hello World"; 
	}

}
