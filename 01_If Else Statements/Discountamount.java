import java.util.*;
class Discountamount{
public static void main(String args[]){
	int unit = 100;
	System.out.println("enter the quantity");
	Scanner sc = new Scanner(System.in);
	int	quantity= sc.nextInt();
	int totalAmount= unit * quantity;
	int discAmount= (totalAmount * 100)/10 ; 
	
		if((quantity * unit )>1000){
		System.out.println("you get discount"+"/n"+"amount is"+ discAmount );

}
	else{
	System.out.println("you don't get any discount");
}

}



}