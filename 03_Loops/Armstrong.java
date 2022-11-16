class Armstrong{
public static void main(String [] args){
	int digit1;
	int digit2;
	int digit3;
	for(int number=1; number<=500; number++){
		int temp = number;
			digit1 = number%10;
			temp = number/10;
			digit2 = number%10;
			temp = number/10;
			digit3 = number%10;
			temp = number/10;
	if(digit1*digit1*digit1 + digit2*digit2*digit2 + digit3*digit3*digit3 == number){
		System.out.println(number);
}
}
}
}