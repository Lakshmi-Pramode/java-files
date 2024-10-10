package m1tut3;
import java.util.*;
public class PrimeNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       int flag=0;
	       System.out.println("Prime numbers between 1 and 100:");
	       for(int n=2;n<=100;n++)
	       {
	    	   flag=1;
	    	   for(int i=2;i<=(n/2);i++)
	    	   {
	    		   if(n%i==0) {
	    			   flag=0; 
	    			   break;
	    		   }  }
	    	   if(flag==1) {
	    		   System.out.println(n);
	    	   }  
	       }
	}
}
