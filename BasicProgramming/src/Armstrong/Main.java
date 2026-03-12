package Armstrong;

//Check if Number is Armstrong

public class Main {
	public static void main(String[] args) {
		int num = 370;
		int sum=0;
		int n = num;
		 while(num!=0) {
			 int rem = num%10;
			 sum = sum + (rem*rem*rem);
			 num = num/10;
		 }
		 if(n==sum) {
			 System.out.println("Armstrong");
		 }else {
			System.out.println("Not Armstrong");
		}
	}
}
