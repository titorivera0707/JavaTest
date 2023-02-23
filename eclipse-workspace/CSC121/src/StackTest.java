import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		
		String s = "Hello World";
		
		char[] chars = s.toCharArray();
		
		Stack<Character> myStack = new Stack<Character>();
		
		for(Character c: chars) {
			myStack.push(c);
		}
		
		System.out.println(myStack.size());
		
		char[] output = new char[myStack.size()];
		
		int x=1;
		for(Character c: myStack) {
			
			output[myStack.size()-x++]=c;
			
		}
		
		String sout = new String(output);
		System.out.println(sout);
		
		
		
//		System.out.println(myStack.size());
//		System.out.println(myStack.peek());
//		System.out.println(myStack.isEmpty());
//		
//		while(!myStack.isEmpty()) {
//			
//			System.out.println(myStack.pop());
//		}
			
		
	}

}