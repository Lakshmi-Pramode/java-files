package tut12;
import java.io.*;
public class LineNo {
	public static void main(String[] args) throws IOException{
		int i=0;
			File f=new File("Line.txt");
			f.createNewFile();
			String source=" Smitha Jacob is your Java Teacher\n All the best\n I Love java world";
			FileOutputStream fo=new FileOutputStream(f);
			fo.write(source.getBytes());
			fo.close();
			FileInputStream fin=new FileInputStream(f);
			BufferedReader br=new BufferedReader(new InputStreamReader(fin));
			String line;
			int lineno=1;
			while((line=br.readLine())!=null)
			{
				System.out.println(lineno+":"+line);
				lineno++;
			}
	}
}