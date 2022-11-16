import java.util.*;

class FactValue {
	public static void main(String args[]) {
		System.out.println("Enter any number between 1-20");
		int num;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println("The factorial value of the number is  " + fact);

	}
}