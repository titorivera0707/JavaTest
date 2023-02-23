import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class MyUsefulCode {
	
	public static int readIntFromUser(String inputString, int min, int max ) {
		Scanner s = new Scanner(System.in);
		while(true) {
			try {
			System.out.print(inputString+"["+min+", "+max+"]");
			int a=s.nextInt();
			if(a>=min && a <= max) return a;
			else
				System.out.println("Number must be within range ["+min+", "+max+"]");
			}
			catch(Exception e) {
				System.out.println("Enter a valid number");
				s.next();
			}
		}
	}
	
	public static ArrayList<String> readFile(String fileName) {
		
		File sourceFile = new File(fileName);
		ArrayList<String> output = new ArrayList<String>();
		
		try {
			if(!sourceFile.exists()) return null;
			
			Scanner reader = new Scanner(sourceFile);
			
			while (reader.hasNext()) {
				output.add(reader.nextLine());
			}
		} catch(FileNotFoundException fne) {
			return null;
		}catch(IOException ioe) {
			return null;
		}
		
		return output;
		
	}

}
