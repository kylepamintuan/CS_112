import java.util.Scanner;


public class ps1question4 
{
	public static void main(String[] args)
	{
		float x = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a number");
		x = keyboard.nextFloat();
		
		if (x < 30.5)
		{
			System.out.println("x is under 30.5");
		}
		else if (x >= 30.5)
		{
			System.out.println("x is greater than or equal to 30.5");
		}
	}
}
