import java.util.*;


public class ps8question1 
{
	public static void main(String[] args)
	{		
		Scanner keyboard = new Scanner(System.in);		
		
		String user_input;
		
		System.out.println("Enter some text:");
		user_input = keyboard.nextLine();
		
		System.out.println("Here are the digits in that text:");
		
		for (int x = 0; x < user_input.length(); x++)
		{
			char current = user_input.charAt(x);
			
			if (Character.isDigit(current))
			{
				System.out.print(current);
			}
		}
		
		System.out.println();
		
		
	}
}
