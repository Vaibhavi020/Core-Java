import java.util.*;

class SumOddEven {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int evenSum = 0;
		int oddSum = 0;
		while (num != 0) {
			int digit = num % 10;
			if (digit % 2 == 0) {
				evenSum = evenSum + digit;
			}

			else {
				oddSum = oddSum + digit;
			}

			num = num / 10;
		}

		System.out.println("The sum of Even digits is " + evenSum);
		System.out.println("The sum of Odd digits is " + oddSum);

	}

}