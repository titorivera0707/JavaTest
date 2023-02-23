
public class Dog {

	private String breed;
	private String color;
	private int legs;
	
	public Dog(String b, String c, int l) {
		
		this.breed = b;
		this.color = c;
		this.legs = l;
		
	}
	
	
	
	public String getBreed() {
		return breed;
	}



	public void setBreed(String breed) {
		this.breed = breed;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getLegs() {
		return legs;
	}



	public void setLegs(int legs) {
		this.legs = legs;
	}



	public String toString() {
		return breed+":"+color+":"+legs;
	}
	
	
	
}
