import java.util.Scanner;


public class ps1question10 
{
	public static void main(String[] args)
	{
		int height = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter block height");
		height = keyboard.nextInt();
		
		if (height < 1)
		{
			System.out.println("Height must at least be 1.");
		}
		else
		{
			for (int counter = 1; counter <= height; counter++)
	        {

	            for(int counter2 = 1; counter2 <= counter; counter2++)
	            {
	            	System.out.print("*");
	            }

	            System.out.println();
	        }
			
		}
	}
}
