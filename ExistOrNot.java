package tut12;
import java.io.*;
public class ExistOrNot {
	public static void main(String[] args) throws IOException{
		String source="Smith is your Java Teacher\n";
		File f1=new File("File1.txt");
		f1.createNewFile();
		File f2=new File("File2.txt");
		f2.createNewFile();
		try{
			if(f1.exists()){
				System.out.println("File1 exists.");
				FileOutputStream fo=new FileOutputStream(f1);
				fo.write(source.getBytes());
				fo.close();   }
			else{
				System.out.println("File1 does not exists");	}
		}
		catch(Exception e){
			System.out.println("An error occured:"+e.getMessage()); }
		try{
			if(f2.exists()){
				System.out.println("File2 exists");
				FileInputStream fi=new FileInputStream(f1);
				FileOutputStream fo=new FileOutputStream(f2);
				int c;
				while((c=fi.read())!=-1){
					fo.write(c);   }
				fi.close();
				fo.close();
				System.out.println("File contents copied from file1 to file2.");
				String x;
				System.out.println("**File contents of File 1**");
				BufferedReader br1=new BufferedReader(new FileReader(f1));
				while((x=br1.readLine())!=null){
					System.out.println(x);	}
				br1.close();
				System.out.println("**File contents of File 2**");
				BufferedReader br2=new BufferedReader(new FileReader(f2));
				while((x=br2.readLine())!=null){
					System.out.println(x);	}
				br2.close();			
			}
			else{
					System.out.println("File2 does not exists"); }
		}
			catch(Exception e) {
				System.out.println("An error occured:"+e.getMessage()); }
	}
}
