import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


//Set ------> TreeSet

public class ps7question2 
{
	public static void main(String[] args)
	{
		Set<String> my_collection = new TreeSet<String>();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 10 words");
		String user_input;
		
		for (int x = 1; x < 11; x++)
		{
			System.out.println("Enter word " + x);
			
			user_input = keyboard.next();
			
			my_collection.add(user_input);
		}
		
		System.out.println("Here is that data without duplicates:");
		for(String current : my_collection)
		{
			System.out.println(current);
		}
	}
}
