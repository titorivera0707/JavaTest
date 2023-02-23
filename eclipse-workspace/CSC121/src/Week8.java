
public class Week8 {

	public static void main(String[] args) {
		
		printToScreen("This is a test", 2);
		int total =sum(10,5);
		System.out.println(total);
	}
	
	private static int sum(int a, int b) {
		int c=a+b;
		return c;
	}
	
	public static void printToScreen(String s, int x) {
		
		for(int y=0;y<x;y++)
			System.out.println(s);
		
	}
	
}
