package oopj24csb48;
import java.util.*;
public class Matrixmultiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of rows in first matrix:");
		int row1=sc.nextInt();
		System.out.println("enter the no of columns in first matrix:");
		int col1=sc.nextInt();
		System.out.println("enter the no of rows in second matrix:");
		int row2=sc.nextInt();
		System.out.println("enter the no of columns in second matrix:");
		int col2=sc.nextInt();
		int[][] mat1=new int [row1][col1];
		int[][] mat2=new int [row2][col2];
		System.out.println("enter the elements in first matrix:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the elements in second matrix:");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("first matrix is:");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++) {
				System.out.print(mat1[i][j]+"\t");
			}
			System.out.print("\n");
		}
		System.out.println("second matrix is:");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(mat2[i][j]+"\t");
			}
			System.out.print("\n");
		}
		if(col1!=row2) {
			System.out.println("multiplication not possible");
			return;
		}
		int mat3[][]=new int [row1][col2];
		System.out.println("product matrix is: ");
		for (int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				mat3[i][j]=0;
			for (int k=0;k<col1;k++) {
				mat3[i][j]+=mat1[i][k]*mat2[k][j];
		}
	}
}
		for (int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				System.out.print(mat3[i][j]+"\t");
			}
		    System.out.print("\n");
		}
	}

}

