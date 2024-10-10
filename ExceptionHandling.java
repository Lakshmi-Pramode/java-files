package oopj24csb48;
import java.util.*;
public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c;
		int op;
		do {
		System.out.println("1: Arithmetic Exception.\n2: Array index out of bounds exception.\n3: exit");
		System.out.println("choose an option(1/2/3): ");
		op=sc.nextInt();
		switch(op) {
		case 1:
			//ArithmeticException
			System.out.println("program to perform division");
			System.out.println("Enter number-1: ");
			int n1=sc.nextInt();
			System.out.println("Enter number-2: ");
			int n2=sc.nextInt();
			try {
				int res=n1/n2;
				System.out.println("Result= "+res);
				System.out.println("End of Try Block");
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			finally {
				System.out.println("Finally block content\nMy code is safe from exception");
			}
			break;
		case 2: 
			//ArrayIndexOutOfBoundsException
		    System.out.println("Enter the no of elements you want to store: ");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements of array: ");
			for(int i=0;i<n;i++) {
				 a[i]= sc.nextInt();
			}
			System.out.println("array length: "+a.length);
			System.out.println("Array elements are: ");
			for(int i=0;i<n;i++) {
				System.out.print(a[i]+"\t");
			}
			try {
			System.out.println("\nenter the position of element to be accessed: ");
			int x= sc.nextInt();
			a[x]=n;
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array Index is Out of Bounds");
			}
			break;
		case 3:
			System.out.println("exiting...");
			break;
		default: 
			System.out.println("invalid choice!");
			break;
		}
		System.out.println("do you want to continue? (y/n): ");
		c=sc.next().toLowerCase().charAt(0);
		sc.nextLine();
		} while(c=='y');
		sc.close();
	}
}
