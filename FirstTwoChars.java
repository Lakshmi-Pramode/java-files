package tut6;
import java.util.*;
public class FirstTwoChars {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		String c1=str.substring(0,2);
		int len=str.length();
		String c2=str.substring(len-2);
		boolean result=c1.equals(c2);
		if(result==true)
		{
		System.out.println("The first two characters '"+c1+"' appears at the end of the string");
		}
		else
		{
		System.out.println("The first two characters '"+c1+"' do not appear at the end of the string");
		}
	}
}
