
class ReverseArray 
{ 

		public static void main(String[] args) 
		{ 
			String input[] = {"Ram", "Mohit", "Shyam"}; 
			String input1[]=new String[3];

			
			StringBuilder builder=null;
	for(int i=0;i<input.length;i++)
	{
		 builder = new StringBuilder(input[i]); 
		 builder.append(input); 
			input1[i] = builder.reverse().toString(); 
	}
	for(int i=0;i<input.length;i++)
	{
			System.out.print("reversed string:  "+input1[i]); 
		
	} 
		}
}
