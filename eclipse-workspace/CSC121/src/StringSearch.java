import java.util.Scanner;
public class StringSearch {
	
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		
		String s = "A quick brown fox jumps over the lazy dog";
		System.out.println(s);
		
		System.out.print("Enter a String to search: ");
		String search = keyboard.nextLine();
		
		s.split(" ");
		
		if(s.indexOf(search)>-1) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not found.");
		}
		
		
		
	}

}
