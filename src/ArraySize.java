
import java.util.Scanner;
public class ArraySize {
public static void main(String[] args){
	int n;
    Scanner s = new Scanner(System.in);
    System.out.print("Enter no. of elements you want in array:");
    n = s.nextInt();
    int a[] = new int[n];
    System.out.println("Enter all the elements:");
    
    try
    {
    for(int i = 0; i < n; i++)
    {
    	a[i] = s.nextInt();
    
    	if(a[i]<n)
    
    }
    }
	      catch(ArrayIndexOutOfBoundsException e) {
	         System.out.println("array is greater than "+n);
	      }
	   }
	}