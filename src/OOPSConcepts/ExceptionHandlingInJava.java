package OOPSConcepts;

public class ExceptionHandlingInJava {

	public static void main(String[] args) {
		ExceptionHandlingInJava e = new ExceptionHandlingInJava();
		try {
			e.test();
			e.fun();
		} 
		catch(ArithmeticException |NullPointerException e1)
		{
			e1.getMessage();
		}
		
//		finally {
//			System.out.println("ending test");
//		}
		System.out.println("Print next number");
	}

	public void test() throws ArithmeticException,NullPointerException {
		int i = 9 / 0;
		System.out.println("Test");
	}
	
	public void fun()
	{
		 try {
	            throw new NullPointerException("demo");
	        }
	        catch (NullPointerException e) {
	            System.out.println("Caught inside fun().");
	            throw e; // rethrowing the exception
	        }
	}
}
