import java.util.*;
class AddInt{
	public static void main(String args[]){
	System.out.println("Enter any number");
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int sum = 0;
		while(num!=0){
		int digit = num%10;
		num= num/10;
	      sum = sum +digit;
}
		
	System.out.println("The sum is : " +sum);
}

}