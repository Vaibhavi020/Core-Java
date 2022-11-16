import java.util.*;

class ReverseNum {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		int reverse = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		/*
		 * while(num!=0)
		 * {
		 * int digit= num%10;
		 * reverse =reverse * 10 + digit;
		 * num = num/10;
		 * }
		 * 
		 */
		for (; num != 0; num = num / 10) {
			int digit = num % 10;
			reverse = reverse * 10 + digit;

		}

		System.out.println("The reverse of number is " + reverse);

	}

}