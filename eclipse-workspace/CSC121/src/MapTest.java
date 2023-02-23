import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, String> myMap = new HashMap<String,String>();
		
		myMap.put("Name","John Doe");
		myMap.put("City", "Los Angeles");
		myMap.put("Email", "name@email.com");
		myMap.put("Name2", "Another name value");
		
		Map<String, String> myStudent2 = new HashMap<String,String>();
		
		myMap.put("Name","John Doe2");
		myMap.put("City", "Orange");
		myMap.put("Email", "name@email.com");
		myMap.put("Name2", "Another name value");
		
		Map<Integer, Map> myClass=new TreeMap<Integer,Map>();
		
		myClass.put(1, myMap);
		myClass.put(2, myStudent2);
		
		Set<String> keys = myMap.keySet();
		Collection values = myMap.values();
		
		for(String key:keys) {
			
			System.out.println(key+" : "+myMap.get(key));
			
		}
		
	}
	
}
