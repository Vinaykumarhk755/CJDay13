import java.util.Scanner;
public class CreateArray {

	public static void main(String[] args) {
		 int n=0;
		 int even=0;
		 int odd=0;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        int a[] = new int[n];
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            
	        }
	        for(int i = 0; i < n; i++)
	        {
	        	  if (a[i] % 2 == 0) 
	        	        even += a[i]; 
	        	    else
	        	        odd += a[i];   
	        }

	        System.out.println("Even index positions sum: " + even); 
	        System.out.println("Odd index positions sum: " + odd);
	        
	        even=0;
	        odd=0;
	        System.out.println("Enter all the elements:");
	        for(int i = 0; i < n; i++)
	        {
	            a[i] = s.nextInt();
	            
	        }
	        for(int i = 0; i < n; i++)
	        {
	        	  if (a[i] % 2 == 0) 
	        	        even += a[i]; 
	        	    else
	        	        odd += a[i];   
	        }
	        System.out.println("Even index positions sum: " + even); 
	        System.out.println("Odd index positions sum: " + odd);
 
} 
} 