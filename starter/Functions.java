import java.util.*;
	class Functions{
	public static void printMyName(String name){
	
		System.out.println(name);
	return;
}
	public static void main(String args[]){
	System.out.println("Enter your name here-");
	Scanner sc= new Scanner(System.in);
	String name= sc.next();
	
	printMyName(name); //call function

}


}