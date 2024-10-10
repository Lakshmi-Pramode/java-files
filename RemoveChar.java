package tut6;
import java.util.*;
public class RemoveChar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str1=sc.nextLine();
		System.out.println("Enter a character:");
		char c=sc.nextLine().charAt(0);
		String str2=str1.replace(c,'\0').replaceAll("\0","");
		System.out.println("The string after removing character "+c+" "+"is: "+str2);
	}

}
