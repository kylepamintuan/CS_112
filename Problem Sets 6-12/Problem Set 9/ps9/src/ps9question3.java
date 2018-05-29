import java.util.Scanner;


public class ps9question3 
{
	public static int user_input;
	
	public static void ABC(String s)
	{
		//base case: stop when the String is long enough
		if(s.length() == user_input)
		{
			System.out.println(s);
		}
		else
		{
			//recursive step:
			for(char letter = 'A'; letter <= 'C'; letter++)
			{
				ABC(s + letter);
			}
		}
	}
	
	public static void main(String[] args)
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the maximum number of characters");
		
		user_input = keyboard.nextInt();
		
		ABC("");
	}
}
