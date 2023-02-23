import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class HashTest {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<Integer, String>();
		
		//Adding values
		m.put(100, "One Hundred");
		m.put(101, "One Hundred One");
		m.put(102, "One Hundred Two");
		m.put(103, "One Hundred Three");
		m.put(104, "One Hundred Four");
		m.put(105, "One Hundred Five");
		
		//Getting values
		
		System.out.println(m.get(100));
		
		//Getting all the keys
		Set<Integer> s = m.keySet();
		
		for(int i: s) {
			
			System.out.println(m.get(i));
			
		}
		
		//Getting all values
		Collection<String> c = m.values();
	}

}
