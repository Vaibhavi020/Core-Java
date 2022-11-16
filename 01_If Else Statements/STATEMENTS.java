import java.util.*;

class Statements {
	public static void main(String args[]) {
		int age;
		System.out.print("enter age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		if (age >= 18 || age <= 80)
			System.out.print(" you are eligible for blood donation ");
		else
			System.out.println("sorry you cannot donate!");

	}
}
