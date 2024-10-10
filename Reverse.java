package m1tut3;
import java.util.*;
public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the number:");
	       int n=sc.nextInt();
	       int rev=0;
	       for(int i=0;n>0;i++)
	       {
	    		   int rem=n%10;
	        	   rev=rev*10+rem;
	        	   n=n/10;
	       }
	       System.out.println("Reversed number is"+" "+rev);
	}

}
