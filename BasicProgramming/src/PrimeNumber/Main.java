package PrimeNumber;

import java.util.Iterator;

//Check if a Number is Prime

public class Main {
	public static void main(String[] args) {

		int num = 7;
		boolean isPrime = true;

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("It is a prime number");
		} else {
			System.out.println("Not a Prime Number");
		}
	}
}
