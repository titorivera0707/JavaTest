import java.util.Date;
import java.util.Calendar;
import java.io.*;
import java.text.SimpleDateFormat;

public class Registration {
	
	private static final int DEFAULT_EXPIRY = 6;
	private static int licenseCounter = 1000;
	private static final long SIX_MONTHS=1555200000;
	private NewCar car;
	private Person owner;
	private String licenseNumber;
	private Date expiryDate;
	
	public Registration(NewCar car, Person owner) {
		super();
		this.car = car;
		this.owner = owner;
		this.licenseNumber = "LIC" +licenseCounter++;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.MONTH, c.get(Calendar.MONTH)+DEFAULT_EXPIRY);
		this.expiryDate = c.getTime();
	}

	public NewCar getCar() {
		return car;
	}

	public Person getOwner() {
		return owner;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}
	
	public String toString() {
		
		SimpleDateFormat dt = new SimpleDateFormat("MM/dd/yyyy");

		
		return car.toString()+" | "+owner.toString()+" | "+licenseNumber+" | "+dt.format(expiryDate);
		
	}

}
