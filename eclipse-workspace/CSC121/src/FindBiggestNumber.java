import java.util.Scanner;
public class FindBiggestNumber {
	
	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);	
	
	int[] newNumber= new int[5];
	int number = 0, n =0, highestNumber=0;

	
	while(number<5){

		System.out.print("Enter a number " + (number +1) + " : ");
		n= keyboard.nextInt();
		newNumber[number] = n;
		if(newNumber[number]> highestNumber)
			highestNumber = newNumber[number];
		++number;

		}
		
		System.out.println(highestNumber);
	
	}

}
