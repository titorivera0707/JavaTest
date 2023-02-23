import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestClass2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File f = new File("/Users/titorivera/new.txt");
		
		File fout=new File("/Users/titorivera/csc.txt");
		
		if(!fout.exists())fout.createNewFile();
		
		Scanner s = new Scanner(f);
		
		PrintWriter p = new PrintWriter(fout);
		
		while(s.hasNext()) {
			p.println(s.nextLine());
			System.out.println(s.nextLine());
		}
		
		p.close();
		
		System.out.println(f.canWrite());
		s.close();
		
	}
	
}
