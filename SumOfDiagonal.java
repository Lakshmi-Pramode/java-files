package m1;
import java.util.*;
public class SumOfDiagonal {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of square matrix: ");
	        int n=sc.nextInt();
	        int[][] matrix=new int[n][n];
	        System.out.println("Enter the elements:");
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<n;j++) {
	        		matrix[i][j]=sc.nextInt();
	        	} }
	        System.out.println("The matrix is:");
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix[i][j]+"\t");
				}
				System.out.print("\n"); 
				}
			int d1=0,d2=0;
			for(int i=0;i<n;i++) {
				d1=d1+matrix[i][i];
				d2=d2+matrix[i][n-i-1]; 
				}
			System.out.println("The sum of the first diagonal is"+" "+d1);
			System.out.println("The sum of the second diagonal is"+" "+d2);
	}
}
