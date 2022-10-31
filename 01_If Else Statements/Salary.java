import java.util.*;
	class Salary{
	public static void main(String args[]){
	System.out.println("enter age");
	Scanner sc = new Scanner(System.in);
	int age1 = sc.nextInt();
	int age2 = sc.nextInt();
	int age3 = sc.nextInt();
 
      if(age1>age2 && age1>age3)
	System.out.println(age1);
	 else if(age2>age1 && age2>age3){
	System.out.println(age2);
}
	else{
	System.out.println(age3);
}



	     



}


}