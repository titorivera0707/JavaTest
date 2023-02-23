
public class ArrayExample {
	
	public static void main(String[] args) {
		
		int[] numbers = new int[5];
		numbers[0]=3;
		numbers[1]=4;
		numbers[2]=6;
		numbers[3]=8;
		numbers[4]=9;
		
		int x=0;
		
		while(true) {
			System.out.println(numbers[x++]);
			if(x>4)
				break;
		}
		
	}

}
