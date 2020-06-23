package wrapping;

public class WrapperTest {
	public static void main(String[] args) {
		double result=0;
		for(int i=0;i<args.length;i++)
		{
				result=result+Double.parseDouble(args[i]);
		

		}
		System.out.println("sum of values: "+result);
		
	}
}
