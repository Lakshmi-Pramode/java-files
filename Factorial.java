package m1tut3;
import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int fact=1;
		int i=n;
		while(i>0){
			fact=fact*i;
			i--;
		}
		System.out.print("Factorial of " + n + " is " + fact);
		
	}

}
