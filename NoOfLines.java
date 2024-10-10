package tut12;
import java.io.*;
public class NoOfLines {
	public static void main(String[] args)throws IOException {
		int i=0;
			File f=new File("input.txt");
			f.createNewFile();
			String source="Smitha Jacob is your Java Teacher\nAll the best\nI Love java world";
			FileInputStream fin=new FileInputStream(f);
			FileOutputStream fo=new FileOutputStream(f);
			fo.write(source.getBytes());
			fo.close();
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			String line;
			int lineno=0;
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				lineno++;
			}
			System.out.println("Number of lines:"+lineno);
	}
}
