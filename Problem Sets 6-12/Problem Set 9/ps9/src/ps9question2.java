import java.util.Scanner;


public class ps9question2 
{
	public static void output(char[] word)
	{
		for (int x = word.length - 1; x >= 0; x--)
		{
			//base case: stoppping point of a recursive method
			if (word[x] == word.length - 1)
			{
				System.out.println(word[x]);
			}
			else
			{
				//recursive step: keep going (call method again)
				System.out.println(word[x]);
			}
		}
		
	}
	
	public static void main (String[] args)
	{
		String user_input;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a String");
		user_input = keyboard.nextLine();
		
		char[] word = user_input.toCharArray();
		
		//call recursive method
		output(word);
	}
}
