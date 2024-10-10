package oopj24csb48;
import java.io.*;
import java.util.*;
public class FileCopy {
	public static void main(String[] args)throws IOException {
		Scanner sc=new Scanner(System.in);
		File f1= new File("sample.txt\n");
		f1.createNewFile();
		if(f1.exists()) {
			FileWriter fw1=new FileWriter(f1);
			System.out.println("sample.txt exists");
			System.out.println("enter string: ");
			String source = sc.nextLine();
			fw1.write(source);
			fw1.close();
			System.out.println("content written to sample.txt");
		}
		else {
			System.out.println("file doesn't exists!");
		}
		File f2= new File("new-sample.txt");
		f2.createNewFile();
		if(f2.exists()) {
			FileReader fr1= new FileReader(f1);
			System.out.println("\nnew-sample.txt exists");
			System.out.println("---contents of sample.txt---");
			int i;
			FileWriter fw2= new FileWriter(f2);
			while((i=fr1.read())!=-1) {
				System.out.print((char)i);
				fw2.write(i);
			}
			fr1.close();
			fw2.close();
			System.out.println("\ncontents copied from sample.txt to new-sample.txt");
			System.out.println("---contents of new-sample.txt---");
			FileReader fr2= new FileReader(f2);
			int j;
			while((j=fr2.read())!=-1) {
				System.out.print((char)j);
			}
			fr2.close();
		}
		else {
			System.out.println("file doesn't exists!");
		}
		sc.close();
	}
}
