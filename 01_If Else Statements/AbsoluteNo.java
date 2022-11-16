import java.util.*;

class AbsoluteNo {
	public static void main(String args[]) {
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num < 0)
			System.out.println(num * (-1));
		else {
			System.out.println(num);

		}

	}

}