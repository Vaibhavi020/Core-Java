import java.util.*;
class LetterCase{
	public static void main(String args[]){
	System.out.println("Enter a character");
	Scanner sc = new Scanner(System.in);
	char ch = sc.next().charAt(0);
	if(ch >='a' && ch<='z'  )
	System.out.println("Entered char is in small case");
	else if(ch >='A' && ch<='Z')

	System.out.println("Entered char is in upper case");

 	else{
	System.out.println("it is invalid character");


}



}



}