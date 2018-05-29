import java.util.Scanner;


public class ps9question5__alternative 
{
	private static String phonenumber;
	private static int optioncounter = 0;
	private static String Letters[] = {"0", "1", "ABC", "DEF","GHI", "JKL", "MNO","PQRS", 
										"TUV", "WXYZ", "exit"};
	
	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);
		
		//ask for number
		System.out.println("Enter a phone number (numbers only). Type \"exit\" to end.");
		phonenumber = userinput.next();
		//output combinations
		//while phone number is not equal to exit
		while((!phonenumber.equals("exit")))
		{
			//do the combinations
			combos();
			//output the options available
			System.out.println(optioncounter + " option(s) are available");
			//ask for number again until exit is typed
			System.out.println("Enter a phone number (numbers only). Type \"exit\" to end.");
			phonenumber = userinput.next();
			//reset counter
			optioncounter = 0;
		}
		//when exit is typed
		//output bye!
		System.out.println("Bye!");
		
		
	}
	
	public static void combos()
	{
		combos("", 0);
	}
	
	//method takes in two parameters that takes the numbers that user inputs 
	//and position of the length of phone number
	private static void combos(String permutation, int position)
	{
		if(permutation.length() == phonenumber.length())
		{
			//output the permutations
			System.out.println(permutation);
			//update the counter
			optioncounter++;
		}
		else
		{
			//loop the digits corresponding to letters
			String digitletters = Letters[phonenumber.charAt(position) - '0'];
			for (int x = 0; x < digitletters.length(); x++)
			{
				//output the recursive 
				combos(permutation + digitletters.charAt(x), position + 1);
				
			}
		}
	}
}
