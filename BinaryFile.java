package tut12;
import java.io.*;
public class BinaryFile {
	public static void main(String[] args) throws IOException {
		File f1=new File("Binary1.bin");  f1.createNewFile();
		File f2=new File("Binary2.bin");  f2.createNewFile();
		String source="Smith is your Java Teacher\n";
		FileOutputStream fo=new FileOutputStream(f1);
		fo.write(source.getBytes());
		fo.close();
		try{
			FileInputStream fin=new FileInputStream(f1);
			FileOutputStream fout=new FileOutputStream(f2);
			int i;
			System.out.print("Data of the original file: ");
			while((i=fin.read())!=-1){
				char c=(char)i;
				System.out.print(c);
				fout.write(i);	}
			System.out.println("\nSuccessfully written to another file!"); }
		catch(Exception e) {
			System.out.println("An error occured:"+e.getMessage());
		}
		try {
			FileInputStream fin2=new FileInputStream(f2);
			System.out.print("Data of copied file: ");
			int i;
			while((i=fin2.read())!=-1){
				char c=(char)i;
				System.out.print(c);}	
			}
		catch(Exception e){
			System.out.println("An error occured: "+e.getMessage());	}
	}
}