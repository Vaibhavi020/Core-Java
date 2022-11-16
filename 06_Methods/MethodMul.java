import java.util.*;

class MethodMul {
	public static int multiplyNumbers(int n, int m) {
		return n * m;
	}

	public static void main(String[] args) {
		System.out.println("Enter any two numbers");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		System.out.println("Multiplication of two numbers is " + multiplyNumbers(n, m));

	}

}