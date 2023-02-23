import java.util.Scanner;

public class LabWeek8 {

	public static void main(String[] args) {
		int a = 10;
		int b=20;
		System.out.println(isEqual(a,b));
	}
	
	public static void printHelloWorld() {
		System.out.println("Hello World");
	}
	
	public static boolean isEqual(int a, int b) {
		return a==b;
	}
	
	public static int add(int a, int b) {
		int c = a+b;
		return c;
	}
	public static int readInput() {
		Scanner s = new Scanner(System.in);
		System.out.print("Type an integer: ");
		int newInput=s.nextInt();
		return newInput;
	}
	
	public static void readFile(){
		
	}
	
}