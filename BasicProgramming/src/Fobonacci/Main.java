package Fobonacci;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		int n1=0, n2=1, range=5;
		
		for(int i=0; i<range; i++) {
			System.out.println(n1);
			
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}
}
