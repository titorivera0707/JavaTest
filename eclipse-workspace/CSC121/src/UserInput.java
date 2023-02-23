import java.util.Scanner;
import java.util.ArrayList;

public class UserInput {

	public static void main(String[] args) {
		
		ArrayList<String> fileContent =MyUsefulCode.readFile("/Users/titorivera/new.txt");
		if(fileContent !=null) {
			for(String line:fileContent) {
				System.out.println(line);
			}
		}
		else {
			System.out.println("There was a problem with reading the file");
		}
		System.out.println(fileContent);
		
	}
	
}
