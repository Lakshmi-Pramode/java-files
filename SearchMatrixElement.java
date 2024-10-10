package m1;
import java.util.*;
public class SearchMatrixElement {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
         System.out.println("Enter the no of rows: ");
         int row=sc.nextInt();
         System.out.println("Enter the no of columns: ");
         int col=sc.nextInt();
         System.out.println("Enter the elements:");
         int mat[][]=new int[row][col];
         for(int i=0;i<row;i++) {
       	  for(int j=0;j<col;j++) {
       		  mat[i][j]=sc.nextInt();
       	  } }
         System.out.println("The matrix is:");
         for(int i=0;i<row;i++) {
       	  for(int j=0;j<col;j++) {
       		  System.out.print(mat[i][j]+"\t");    }
       	  	  System.out.print("\n");   }
         System.out.println("Enter the element to search:");
         int k=sc.nextInt();
         int flag=0;
         for(int i=0;i<row;i++) {
       	  for(int j=0;j<col;j++) {
       		  if(mat[i][j]==k) {
       			 System.out.println(k+" is found at "+i+" "+j);
       			 flag=1;
       			 break; }
       	  } }
         if(flag==0) {
			  System.out.println(k+" is not found"); }
	}
}
