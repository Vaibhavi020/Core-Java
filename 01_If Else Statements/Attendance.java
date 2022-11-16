import java.util.*;

class Attendance {
	public static void main(String args[]) {
		System.out.println("enter name of the candidate");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.println("number of classes held");
		System.out.println("number of classes attended");

		int classesheld = sc.nextInt();
		int classesattended = sc.nextInt();

		int perscentatended = (classesattended * 100 / classesheld);
		if (perscentatended < 75)
			System.out.println("not eligible for exam");
		else {
			System.out.print("eligible for exam");
		}

	}

}