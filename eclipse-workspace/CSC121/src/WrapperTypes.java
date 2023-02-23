import java.util.Scanner;

public class WrapperTypes {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("Input: ");
		
		Object o = s.next();
		
		try {
		int a = Integer.parseInt((String)o);
		System.out.println(a);
		}
		catch(NumberFormatException ne) {
			System.out.println("Enter a valid number.");
			System.out.println(ne.getMessage());
			System.out.println("What you entered is: "+ o.getClass().getName());
		}
		
		
		
	}

}
