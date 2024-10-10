package m1;
import java.util.*;
public class Transpose {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	      System.out.print("Enter the no of rows: ");
	      int row=sc.nextInt();
	      System.out.println("Enter the no of columns: ");
	      int col=sc.nextInt();
	      System.out.println("Enter the elements:");
	      int mat[][]=new int[row][col];
	      for(int i=0;i<row;i++) {
	    	  for(int j=0;j<col;j++) {
	    		  mat[i][j]=sc.nextInt();
	    	  }
	      }
	      System.out.println("The matrix is:");
	      for(int i=0;i<row;i++) {
	    	  for(int j=0;j<col;j++) {
	    		  System.out.print(mat[i][j]+"\t");
	    	  }
	    	  System.out.print("\n"); }
	      int transpose[][]=new int[row][col];
	      for(int i=0;i<row;i++)  {
	    	  for(int j=0;j<col;j++)  {
	    		  transpose[i][j]=mat[j][i];
	    	  } }
	      System.out.println("The transpose matrix is:");
	      for(int i=0;i<col;i++) {
	    	  for(int j=0;j<row;j++) {
	    		  System.out.print(transpose[i][j]+"\t"); }
	    	  	  System.out.print("\n"); }
	}

}
