# Recursion-Puzzles


public class Main {

	public static void main(String[] args) {
		
		//1. Print numbers
		int num = 4;
		printNumbers(num);
		
		//2. Cat eyes
		int cats = 2;
		int totalEyes = catEyes(cats);
		System.out.println("The total number of cat eyes are: "+totalEyes);
		
		//3. Power
		int num1 = 3;
		int fact = 3;
		System.out.println("The power of "+num+ " to the power of "+ fact+" is equals to: "+ power(num1,fact));
		
		//4. Factorial
		int num2 = 5;
		System.out.println("The factorial of "+num+" is: "+factorial(num2));
		
		//5. Fibionacci series
		int num3 = 4;
		System.out.println("The fibionacci series of "+num3+ " is: "+fib(num3));
		
		//6. Mobile Speakers
		int mobile = 5;
		System.out.println("The speakers of "+mobile+ " mobile phones is: "+speakers(mobile));
		
		//7. Sum of Individual Numbers
		int num4 = 8765644;
		System.out.println("The addition of the individual numbers of "+num4+ " is: "+sum(num4));
		
		//8. Number of occurences of 5
		int num5 = 5;
		System.out.println("The number of times that 5 occurs in the number  "+num5+ " is: "+count(num5));
		
	
	}
	public static void printNumbers(int numIn){
		if(numIn ==0){
			return;
		}
		System.out.println(numIn);
		printNumbers(numIn-1);
		
	}
	
	public static int catEyes(int catsIn) {
		if (catsIn == 0) {
			return 0;
		} else {
			return 2 + catEyes(catsIn - 1);
		}
	}

	public static int power(int numIn, int factIn){
		if(factIn == 1){
			return numIn;
		}else{
			return numIn*power(numIn, factIn-1);
		}
	}
	
	public static int factorial(int numIn){
		
		if(numIn == 0|| numIn ==1){
			return 1;
		} else{
			return numIn*factorial(numIn-1);	
		}		
	}
	
	public static int fib(int numIn){
		int x;
		int y;
		if(numIn == 0){
			return 0;
		} if(numIn ==1){
			return 1;
		} else {
			x = fib(numIn -1);
			y = fib(numIn -2);
			int z = x + y;
			return  z;
		}
	}
	
	public static int speakers(int mobile){
		if(mobile == 0){
			return 0;
		} if( mobile % 2 ==0){
			return 2+ speakers(mobile -1);
		} else {
			return 1 + speakers(mobile -1);
		}
	}
	
	public static int sum(int num){
		if(num  == 0){
			return 0;
		} else { 
			int a = num%10;
			int b = num/10;
			return a + sum(b);
		}
	}
	
	public static int count(int num){
		if(num == 0){
			return 0;
		} if(num%10 ==5){
			return 1+count(num/10);
		} else {
			return count(num/10);
		}
	}
	
}
