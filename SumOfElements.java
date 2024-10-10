package m1;
import java.util.*;
public class SumOfElements {
	public static void main(String[] args) {
		   	   Scanner sc=new Scanner(System.in);
		       System.out.print("Enter the number of the elements in array:");
		       int n=sc.nextInt();
		       int sum=0;
		       int[] array=new int[n];
		       System.out.println("Enter the elements:");
		       for(int i=0;i<n;i++)
		       {
		    	   array[i]=sc.nextInt();
		       }
		       System.out.println("the array is: ");
		       for(int i=0;i<n;i++)
		       {
		    	   System.out.print(array[i]+"\t");
		    	   sum=sum+array[i];
		       }
		      System.out.println("\nsum of the elements:"+" "+sum);
	}
}
