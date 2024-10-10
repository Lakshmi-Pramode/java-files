package tut6;
import java.util.*;
public class ReverseString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		String reverse="";
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		System.out.println("The reverse of the string is "+reverse);
	}
}
