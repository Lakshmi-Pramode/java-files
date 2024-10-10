package tut12;
import java.io.*;
public class CreateFile {
	public static void main(String[] args)throws IOException {
		File f=new File("MyFile.txt");
		f.createNewFile();
		String source="This is the University Exam for OODP. \nThis a program to illustrate the use of files.";
		try
		{
			FileOutputStream fo=new FileOutputStream(f);
			fo.write(source.getBytes());
			FileInputStream fi=new FileInputStream(f);
			int i;
			while((i=fi.read())!=-1)
			{
				char c=(char)i;
				System.out.print(c);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}