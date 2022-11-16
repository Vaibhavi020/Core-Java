import java.util.*;

class PrimeNum {
	public static void main(String args[]) {
		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean flag = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			} else {
				flag = true;
				break;
			}

		}
		/*
		 * if(Flag==true){
		 * System.out.println("Entered number is a Prime number");
		 * }
		 * else{
		 * System.out.println("Entered number is not a Prime number");
		 * }
		 */

		System.out.println(flag ? "It is a prime number" : "It is not a prime number");
	}

}