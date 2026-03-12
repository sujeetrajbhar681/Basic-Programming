package Palindrome;

//Check if a Number is a Palindrome 

public class Main {
	public static void main(String[] args) {
		int num=121;
		int reverse=0;
		int n=num;
		
		while(num!=0) {
			int rem = num%10;
			reverse = reverse*10+rem;
			num=num/10;
		}
		if(n==reverse) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrom");
		}
	}
}
