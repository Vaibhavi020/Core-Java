import java.util.*;
	class EvenMethod{

	public static void printEvenOdd(int n){
		if(n % 2 == 0){
			System.out.println("The given number is even number");
		}
		else{
			System.out.println("The given number is odd number");
		}
	}	
	
	static int calculateSum(int a, int b){
		int sum= a+b;
		return sum;
	}	


	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a = sc.nextInt();
	int b = sc.nextInt();
	int sum = calculateSum(a,b);
	System.out.println(sum);
//	System.out.println(calculateSum(a,b));
	printEvenOdd(n);
}
}