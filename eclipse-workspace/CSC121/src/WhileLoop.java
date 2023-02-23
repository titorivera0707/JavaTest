import java.util.Scanner;

public class WhileLoop {
	
	public static void main(String[] args) {
		
		int a=2;
		int b=10;
		int x=1;
		Scanner s = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("Enter value: ");
			a=s.nextInt();
			if(a<0)
				System.out.println("\nTry again!! \n");
			else
				break;
			
			
		}
		
	}

}
