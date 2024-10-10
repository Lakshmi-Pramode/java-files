package m1tut3;
import java.util.*;
public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		int first = 0,second = 1,next;
		int count=2;
		System.out.print("Fibonacci series upto "+n+" is :"+first+" "+second);
		while(count<n) {
			next=first+second;
			System.out.print(" "+next);
			first=second;
			second=next;
			count++;
			
		}
	}

}
