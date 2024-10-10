package m1;
import java.util.*;
public class MaxAndMin {
	public static void main(String[] args) {
		   	   Scanner sc =new Scanner(System.in);
		       System.out.print("Enter the number of the elements in array:");
		       int n=sc.nextInt();
		       int[] arr=new int[n];
		       System.out.println("Enter the elements:");
		       for(int i=0;i<n;i++) {
		    	   arr[i]=sc.nextInt();
		       }
		       System.out.println("the array is: ");
		       for(int i=0;i<n;i++) {
		    	   System.out.print(arr[i]+"\t");
		       }
		       int max=arr[0];  
		       System.out.print("\nThe maximum element in the array is: ");
		       for(int i=0;i<n;i++) {
		    	   if(max<arr[i]) {
		    		   max=arr[i]; }
		       } System.out.print(max);
		       int min=arr[0];
		       System.out.print("\nThe minimum element in the array is: ");
		       for(int i=0;i<n;i++) {
		    	   if(min>arr[i]) {
		    		   min=arr[i]; }
		       } System.out.print(min);
	}
}
