import java.util.Scanner;
public class Calculator {

public static void main(String[] args){
	Scanner keyboard = new Scanner(System.in);

		int[] newNumber= new int[5];
		int number = 0, n =0, addition;

		while(number<5){

			System.out.print("Enter a number " + (number +1) + " : ");
			n= keyboard.nextInt();
			newNumber[number] = n;
			++number;

			}
		
		addition = newNumber[0] + newNumber[1] + newNumber[2] + newNumber[3] + newNumber[4];
		
		System.out.println(addition);
		}
	
}
