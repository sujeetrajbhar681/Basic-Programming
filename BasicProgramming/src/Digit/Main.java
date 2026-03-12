package Digit;

//Find the Sum of the Digit of a Number

public class Main {
	public static void main(String[] args) {
		int num = 125;
		int sum=0;
		
		while(num!=0) {
			int rem = num%10;
			sum = sum + rem;
			num = num/10;
		}
		System.out.println(sum);
	}	
}
