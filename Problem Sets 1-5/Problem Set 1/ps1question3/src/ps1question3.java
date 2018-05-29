import java.util.Scanner;


public class ps1question3 
{
	public static void main(String[] args)
	{
		float product;
		float num1 = 0;
		float num2 = 0;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		num1 = keyboard.nextFloat();
		System.out.println("Enter the second number:");
		num2 = keyboard.nextFloat();
		
		product = num1 * num2;
		
		System.out.println("Product: " + product);
		
	}
}
