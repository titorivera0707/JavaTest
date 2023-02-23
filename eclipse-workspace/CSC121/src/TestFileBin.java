import java.io.File;
import java.io.FileInputStream;

public class TestFileBin {

	public static void main(String[] args) throws Exception {
		
		File myFile = new File("/Users/titorivera/new.txt");
		System.out.println(myFile.canRead());
		
		FileInputStream in = new FileInputStream(myFile);
		
		System.out.println(in.available());
		
		byte[] bucket = new byte[in.available()];
		
		in.read(bucket);
		
		//Read one byte at a time
		
		System.out.println(bucket[0]);
		
		String message = new String(bucket);
		
		System.out.println(message);
		
		
	}
	
}
