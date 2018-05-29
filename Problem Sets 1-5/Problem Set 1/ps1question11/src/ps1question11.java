import java.util.Scanner;


public class ps1question11 
{
	public static void main(String[] args)
	{
		String user_input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a line of text:");
		user_input = keyboard.nextLine();
		
		String result = user_input.toUpperCase();
		
		System.out.println(result);
	}
}
