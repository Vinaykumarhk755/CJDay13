package wrapping;

public class CodeGenerator 
{

	public  void codeGenerator()
	{
		StringBuilder str=	 new StringBuilder("Manipal");
		str.reverse();
		str.deleteCharAt( 0);
		str.replace(1, 2, "*");
		str.deleteCharAt(5);
		str.replace(5, 5, "#");
		System.out.println(str.substring(1, 6).toUpperCase());
		
		
	}
}
	