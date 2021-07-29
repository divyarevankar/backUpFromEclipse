import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		int n=s1.nextInt();
		
		int rev=0,rem;
		while(n>0) {
			rem = n % 10;
			rev = (rev*10) + rem;
			n = n/10;
		}
		System.out.print("reversed strig is :" +rev);
	}
	

}
