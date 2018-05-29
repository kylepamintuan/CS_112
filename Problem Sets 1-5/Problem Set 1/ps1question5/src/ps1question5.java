import java.util.Scanner;


public class ps1question5 
{
	public static void main(String[] args)
	{
		float left = 0;
		float right = 0;
		float x = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter three numbers: left right x");
		left = keyboard.nextFloat();
		right = keyboard.nextFloat();
		x = keyboard.nextFloat();
		
		if (x > left && x < right)
		{
			System.out.println(x + " is within the range [" + left + ", " + right + "]");
		}
		else if (x == left || x == right)
		{
			System.out.println(x + " is within the range [" + left + ", " + right + "]");
		}
		else
		{
			System.out.println(x + " is outside the range [" + left + ", " + right + "]");
		}
	}

}
