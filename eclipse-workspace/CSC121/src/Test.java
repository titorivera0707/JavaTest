import java.util.Calendar;
import java.util.Date;
import java.io.*;
import java.util.*;

public class Test {

	public static void main(String[] args) throws Exception {
		
		NewCar car1 = new NewCar("Toyota","Black", "Camry");
		NewCar car2 = new NewCar("Toyota","Blue", "Camry");
		
		Person p = new Person("Name", "Something@something.com", "999-333-3333");
		
		Registration r = DMV.register(car1, p);
		Registration r2 = DMV.register(car2, p);
				
		System.out.println(r);
		System.out.println(r2);
		
		System.out.println(DMV.find("LIC1000"));

	}
	
}