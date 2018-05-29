import java.util.Scanner;


public class ps1question9 
{
	public static void main(String[] args)
	{
		long num = 1;
		long total = 1;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num = keyboard.nextLong();
		
		if (num < 0)
		{
			System.out.println("Input must be greater than zero.");
		}
		else
		{	
	        for (long counter = num; counter > 0; counter --)
	        {
	        	total = counter * total;
	        }
	        
	        System.out.println(num + "! = " + total);
		}
	}
}
