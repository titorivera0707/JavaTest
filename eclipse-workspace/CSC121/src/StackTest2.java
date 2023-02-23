import java.util.Stack;
import java.util.*;

public class StackTest2 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String s = "Hello World";
		
		char[] chars = s.toCharArray();
		char[] newChars = new char[chars.length];
		
		Stack<Character> myStack = new Stack<Character>();
		
		for(Character c: chars) {
			myStack.push(c);
		}
		
		

		int i = 0;
		
		while(!myStack.isEmpty()) {
			
	 		newChars[i++] = (myStack.pop());
			
		}
		
		System.out.println(newChars);
		
		
	}
	
}