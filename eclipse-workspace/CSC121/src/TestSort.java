import java.lang.reflect.Array;
import java.util.*;

public class TestSort {
	
	public static void main(String[] args) throws Exception{
		
		int[] newArray = {1,3,7,2,9,10,6};
		
		
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		
		arrayList.add(100);
		arrayList.add(99);
		arrayList.add(50);
		arrayList.add(500);
		
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		
		newArray = sort(newArray);
		
		for(int numbers: newArray) System.out.println(numbers);
		
	}
	
	public static int[] sort(int[] input) throws ArrayEmptyException{
		
		//If input length is zero then throw Exception
		//outer loop(while swapped)
		
		if(input.length == 0) {
			throw new ArrayEmptyException();
		}
		
		boolean swapped = false;
		
		while(true) {
			swapped = false;
		for(int outer = 0; outer<input.length-1;outer++) {
			for(int x = 0; x<input.length-1;x++) {
				//System.out.println("X ="+input[x]+","+input[x+1]);
				if(input[x]>input[x+1]) {
					int tempValue = input[x];
					input[x] = input[x+1];
					input[x+1] = tempValue;
				}
			}
		}
		if(!swapped)break;
		}
		
		return input;
	}
	
}