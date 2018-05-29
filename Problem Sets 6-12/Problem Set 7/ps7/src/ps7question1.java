import java.util.*;

//List ------> ArrayList

public class ps7question1 
{
	public static void main(String[] args)
	{
		//A List is a collection.
		//A list is like an array, but it can grow and shrink as needed
		//A collection has no software limit to the number of elements it can store
		
		List<Integer> my_collection = new ArrayList<Integer>();
		
		Scanner keyboard = new Scanner(System.in);		
		int user_input;
		
		do
		{
			System.out.println("Enter an integer (0 to exit)");
			user_input = keyboard.nextInt();
			
			my_collection.add(user_input);
		}
		while (user_input != 0);
		
		if(user_input == 0)
		{
			System.out.println("Got it.  You entered:");
			
			for (int x = 0; x < my_collection.size(); x++)
			{
				if (my_collection.get(x) != 0)
				{
					System.out.println(my_collection.get(x));
				}
			}
		}
	}
}
