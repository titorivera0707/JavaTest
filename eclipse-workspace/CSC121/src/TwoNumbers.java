
public class TwoNumbers {
	
	public static void main(String[] args) {
		System.out.println(smaller(4,7));
		System.out.println(smallerChar('b','A'));
		System.out.println(wordCount("The cat jumped over the moon."));
		System.out.println(numberCount("How are we 100 doing 14108."));
	}
	
	public static int smaller(int a, int b) {
		
		if(a <b ) return a;
		else return b;
		
	}
	
	public static char smallerChar (char a, char b) {
		
		if (a<b) return a;
		else return b;
		
	}
	
	public static int wordCount(String s) {
		String[] newS = s.split(" ");
		
		return newS.length;
	}
	
	public static int numberCount(String s) {
		char[] newCount = s.toCharArray();
		
		int totalNumbers=0;
		
		for(int x=0;x<newCount.length;x++) {
			if(newCount[x]>=48&&newCount[x]<=57) {
				totalNumbers=totalNumbers +1;
			}
		}
		
		return totalNumbers;
	}
	
	

}
