import java.util.*;

class PowerNum {
	public static void main(String args[]) {
		System.out.println("Enter any two nos.");
		Scanner sc = new Scanner(System.in);
		int result = 1;
		int num = sc.nextInt();
		int power = sc.nextInt();
		for (int i = 0; i < power; i++) {
			result = result * num;

		}

		System.out.println(result);
	}

}
