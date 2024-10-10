package m1;
import java.util.*;
public class MatrixAddition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of rows of first matrix: ");
        int r1=sc.nextInt();
        System.out.print("Enter the no of columns of first matrix: ");
        int c1=sc.nextInt();
        System.out.print("Enter the no of rows of second matrix: ");
        int r2=sc.nextInt();
        System.out.print("Enter the no of columns of second matrix: ");
        int c2=sc.nextInt();
        if(r1==r2 && c1==c2) {
        	int[][] mat1=new int[r1][c1];
            System.out.println("Enter the elements of the first matrix:");
            for(int i=0;i<r1;i++) {
          	  for(int j=0;j<c1;j++) {
          		  mat1[i][j]=sc.nextInt();
          	  } 
          	 }
            System.out.println("The first matrix is:");
            for(int i=0;i<r1;i++) {
          	  for(int j=0;j<c1;j++) {
          		  System.out.print(mat1[i][j]+"\t"); 
          	  }
          	      System.out.print("\n");
            }
            int[][] mat2=new int[r2][c2];
            System.out.println("Enter the elements of the second matrix:");
            for(int i=0;i<r2;i++) {
          	  for(int j=0;j<c2;j++) {
          		  mat2[i][j]=sc.nextInt();
          	  }
          	}
            System.out.println("The second matrix is:");
            for(int i=0;i<r2;i++) {
          	  for(int j=0;j<c2;j++) {
          		  System.out.print(mat2[i][j]+"\t");  }
          	      System.out.print("\n");  }
            int[][] result=new int[r1][c1];
            for(int i=0;i<r1;i++) {
            	for(int j=0;j<c1;j++) {
            		result[i][j]=mat1[i][j]+mat2[i][j];
            	}
            }
            System.out.println("The resultant matrix is:");
            for(int i=0;i<r1;i++) {
            	for(int j=0;j<c1;j++) {
            		System.out.print(result[i][j]+"\t");
            		}
            		System.out.print("\n");
            		}
        }
        else {
        	System.out.println("Matrix addition is not possible");  }
	}

}
