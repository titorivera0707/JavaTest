
public class Car {
	
	private String make;
	private short year;
	private int mileage;
	private String model;
	private String color;
	private boolean engineRunning;
	private char gear;
	private int currentSpeed;
	private boolean ignitionState;
	private int fuelLevel;
	
	public Car(String make, short year, String model, String color) {
		super();
		this.make = make;
		this.year = year;
		this.model = model;
		this.color = color;
		engineRunning = false;
		gear = 'N';
		currentSpeed = 0;
		ignitionState = false;
		fuelLevel = 0;
	}
	
	public String toString() {
		String s = ("Engine Running: " +engineRunning  +", Gear ="+gear);
		return s;
	}
	
	public void changeGear(char g) {
		
		gear = g;
		
	}
	
	public void start() {
		if(gear == 'P')engineRunning = true;
	}
	
	public void stop() {
		engineRunning = false;
	}

}
