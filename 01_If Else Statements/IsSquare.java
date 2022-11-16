import java.util.*;

class IsSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int breadth = sc.nextInt();

		if (length == breadth)
			System.out.print("it is a square");

		else {
			System.out.print("it's a rectangle");
		}

	}

}