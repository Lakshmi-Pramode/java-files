package tut6;
import java.util.*;
public class CountingString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String str=sc.nextLine();
		str=str.toLowerCase();
		int len=str.length();
		int ch=0,digit=0,sp=0,line=0,ab=0,word=0,spcl=0;
		for(int i=0;i<len;i++)
		{
			if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				ab++; 
			}
			else if(str.charAt(i)>='0'& str.charAt(i)<='9')
			{
				digit++; 
			}
			else if(str.charAt(i)=='\n')
			{
				line++; 
			}
			else if(str.charAt(i)==' ')
			{ 
				sp++; 
			}
			else
			{ 
				spcl++; 
			} 
		}
		ch=digit+ab+spcl;
		line=line+1; word=sp+1;
		System.out.println("no of characters: "+ch);
		System.out.println("no of words: "+word);
		System.out.println("no of lines: "+line);
		System.out.println("no of alphabets :"+ab);
		System.out.println("no of digits:"+digit);
		System.out.println("no of white spaces:"+sp);
	}
}
