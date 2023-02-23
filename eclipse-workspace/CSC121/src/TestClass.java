import java.lang.ArithmeticException;
public class TestClass {

	public static void main(String[] args) throws ArithmeticException{
		
		try {
		divide(100, 0);
		System.out.println("Done");
		}
		catch(ArithmeticException | NullPointerException ae) {
			ae.printStackTrace();
		}
		
		catch(RuntimeException ae) {
			
		}
		
		catch(Exception e) {
			
		}
		
		finally {
			System.out.println("Finally");
		}
		
	}
	
	public static int divide(int x, int y) throws ArithmeticException{
		
		if(y==0) throw new ArithmeticException("Don't divide by zero");
		return x/y;
		
	}
}