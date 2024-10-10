package oopj24csb48;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String str=sc.nextLine();
		int n=str.length();
		String rev=new String();
		for(int i=n-1;i>=0;i--) 
		{
			 rev=rev+str.charAt(i);
		}
		System.out.println("reverse:"+" "+rev);
		if (str.equals(rev)) 
		{
			System.out.println(str+" "+"is"+" "+"palindrome");
		}
		else 
		{
			System.out.println(str+" "+"is"+" "+"not"+" "+"palindrome");
		}
	}
}

