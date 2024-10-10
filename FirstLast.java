package tut6;
import java.util.*;
public class FirstLast {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string:");
			String str=sc.nextLine();
			str=str.toLowerCase();
			String c1=str.substring(0,1);
			int len=str.length();
			String c2=str.substring(len-1);
			boolean result=c1.equals(c2);
			String str2=str.substring(1,len-1);
			if(result==true){
				System.out.println(str2);
				System.out.println("same characters are found at the start and end");
				return;
			}
			else{
				System.out.println(str);
				System.out.println("No same character is found at the start and end");
				return;
			}
	}
}
