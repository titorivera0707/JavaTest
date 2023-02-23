import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;

public class SetTest1 {

	public static void main(String[] args) {
		
		String s = "ABCDDDFFF123231";
		char[] chars = s.toCharArray();
		
		System.out.println(chars);
		
		//Primitive types cannot be used with Sets
		Set<Character> mySet = new TreeSet<Character>();
		
		for(Character c: chars) {
			
			mySet.add(c);
			
		}
		
		System.out.println(mySet.size());
		System.out.println(mySet);
		
		 char[] output = new char[mySet.size()];
		 
		 int x=0;
		 for(Character c: mySet) {
			 output[x++]=c;
		 }
		 
		 String sout= new String(output);
		 System.out.println(sout);
	}
	
}
