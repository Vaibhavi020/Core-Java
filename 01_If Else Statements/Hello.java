import java.util.Scanner;

class Statements {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		// int age = 50;

		if (age >= 18 || age <= 80)
			System.out.print(" you are eligible for blood donation ");
		else
			System.out.println("sorry you cannot donate!");

	}
}
