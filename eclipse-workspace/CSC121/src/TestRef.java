
public class TestRef {
	
	public static void main(String[] args) {
		
		Engine e = new Engine(4,2,200,"Buick");
		
		Car car1 = new Car("Toyota", "Black", e, 4);
		
		System.out.println(car1);
		
	}

}