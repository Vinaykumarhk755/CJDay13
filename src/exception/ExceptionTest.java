package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int division=0;
		try
		{
		division=Integer.parseInt(args[0])/Integer.parseInt(args[1]);
		
		}
		catch(NumberFormatException n)
		{
			System.out.println("Only integers are allowed");
		}
		
		catch(ArithmeticException m)
		{
			System.out.println("division with zero not allowed");
		}
		if(args.length==0)
			System.out.println("no input recieved");
			System.out.println(division);
			
			
	}

}
