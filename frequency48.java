package oopj24csb48;
import java.util.Scanner;
public class Frequency {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
char cont;
do
{
System.out.println("Enter a string:");
String str=sc.nextLine();
System.out.println("Enter the character:");
char c=sc.next().toLowerCase().charAt(0);
sc.nextLine();
str=str.toLowerCase();
int len=str.length();
int count=0,i=0;
do
{
if(str.charAt(i)==c)
{
count++;
}
i++;
}
while(i<len);
System.out.println("No of occurences of character= "+count);
System.out.println("Do you want to continue(y/n):");
cont=sc.nextLine().toLowerCase().charAt(0);
}
while(cont=='y');
}
}
