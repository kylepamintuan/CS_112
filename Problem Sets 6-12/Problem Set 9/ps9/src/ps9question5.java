import java.util.Scanner;


public class ps9question5 
{
	public static String user_input;
	public static int x;
	public static int counter = 0;
	public static char[] word;
	public static char[] two = {'A', 'B', 'C'};
	public static char[] three = {'D', 'E', 'F'};
	public static char[] four = {'G', 'H', 'I'};
	public static char[] five = {'J', 'K', 'L'};
	public static char[] six = {'M', 'N', 'O'};
	public static char[] seven = {'P', 'Q', 'R', 'S'};
	public static char[] eight = {'T', 'U', 'V'};
	public static char[] nine = {'W', 'X', 'Y', 'Z'};
	
	public static void Recursion(String s, int x)
	{
		//base case: stop when the String is long enough
		if(s.length() == user_input.length())
		{
			System.out.println(s);
			
			counter++;
		}
		else if (user_input.charAt(x) == '0')
		{
			Recursion(s + '0', x + 1);
			counter++;
		}
		else if (user_input.charAt(x) == '1')
		{
			Recursion(s + '1', x + 1);
		}
		else if (user_input.charAt(x) == '2')
		{
			//recursive step:
			for(int count = 0; count < two.length; count++)
			{
				Recursion(s + two[count], x + 1);
			}
		}
		else if (user_input.charAt(x) == '3')
		{
			//recursive step:
			for(int count = 0; count < three.length; count++)
			{
				Recursion(s + three[count], x + 1);
			}
		}
		else if (user_input.charAt(x) == '4')
		{
			//recursive step:
			for(int count = 0; count < four.length; count++)
			{
				Recursion(s + four[count], x + 1);
			}
		}
		else if (user_input.charAt(x) == '5')
		{
			//recursive step:
			for(int count = 0; count < five.length; count++)
			{
				Recursion(s + five[count], x + 1);
			}
		}
		else if (user_input.charAt(x) == '6')
		{
			//recursive step:
			for(int count = 0; count < six.length; count++)
			{
				Recursion(s + six[count], x + 1);
			}
		}
		else if (user_input.charAt(x) == '7')
		{
			//recursive step:
			for(int count = 0; count < seven.length; count++)
			{
				Recursion(s + seven[count], x + 1);
			}
		}
		else if (user_input.charAt(x) == '8')
		{
			//recursive step:
			for(int count = 0; count < eight.length; count++)
			{
				Recursion(s + eight[count], x + 1);
			}
		}
		else if (user_input.charAt(x) == '9')
		{
			//recursive step:
			for(int count = 0; count < nine.length; count++)
			{
				Recursion(s + nine[count], x + 1);
			}
		}
	}
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a phone number (numbers only). Type \"exit\" to end.");
		
		user_input = keyboard.nextLine();
		
		do
		{	
			Recursion("", x);
			
			System.out.println(counter + " option(s) are available");
			
			System.out.println("Enter a phone number (numbers only). Type \"exit\" to end.");
			
			user_input = keyboard.nextLine();
			
			counter = 0;
		}
		while(!user_input.equals("exit"));
		
		if (user_input.equals("exit"))
		{
			System.out.println("Bye!");
		}
		
	}
}
