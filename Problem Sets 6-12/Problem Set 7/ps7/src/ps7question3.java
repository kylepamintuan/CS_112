import java.io.*;
import java.util.*;


//Map ------> TreeMap

public class ps7question3 
{
	private static int highest_frequency = 0;
	private static String most_common_word;
	
	public static void main(String[] args) 
	{
		HashMap<String, Integer> word_frequency = new HashMap<String, Integer>();
		
		Scanner keyboard = new Scanner(System.in);
		
		//Get a file name from user.
		System.out.println("Enter a file name");
		String filename = keyboard.next();
		
		//Open file.
		System.out.println("Opening " + filename);
		File file = new File(filename);
		
		try
		{
			Scanner data_store = new Scanner(file);
			
			//Read the file.
			while (data_store.hasNext())
			{
				//Get the word.
				String current = data_store.next();
				
				if(word_frequency.containsKey(current)) //if we've already seen this word...
				{
					//Get the count.
					int count = word_frequency.get(current);
					
					//put the word and the count back into the map
					word_frequency.put(current, count + 1);
					
				}
				else //if we haven't seen this word
				{
					//put this word in the map
					word_frequency.put(current, 1);
				}
			}
			
			//Take the keys and return it as a set to be looped in an enhanced for loop
			Set<String> words = word_frequency.keySet();
			
			//Get the most common word and its frequency.
			for(String word : words)
			{
				if(highest_frequency < word_frequency.get(word) && word.length() > 5)
				{
					//gets the value
					highest_frequency = word_frequency.get(word);
					
					//gets the key
					most_common_word = word;
				}
				
			}
			
			//Return most common word and its frequency.
			System.out.println("Most common word");
			System.out.println(most_common_word + " -> " + highest_frequency);
			
			data_store.close();		
		}
		catch (FileNotFoundException e) //Catch the error.
		{
			System.out.println("File not found\n");
		}
	
	}
}
