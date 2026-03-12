package PerfectSquare;

//Check if Number is a Perfect Square

public class Main {
	public static void main(String[] args) {
		int num= 16;
		boolean isPerfect = false;
		
		for(int i=1; i<=num/2; i++) {
			if(i*i == num) {
				isPerfect = true;
				break;
			}
		}
		if (isPerfect) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
