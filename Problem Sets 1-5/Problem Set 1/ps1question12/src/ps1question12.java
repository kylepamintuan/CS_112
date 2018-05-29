import java.text.DecimalFormat;
import java.util.Scanner;


public class ps1question12 
{
	public static void main(String[] args)
	{
		float height_feet = 0;
		float height_inches = 0;
		float height = 0;
		float weight = 0;
		float BMI = 0;
		DecimalFormat form = new DecimalFormat("#0.0");
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("== BMI Calculator ==");
		System.out.println("Step 1: Enter height");
		System.out.println("Feet:");
		height_feet = keyboard.nextFloat();
		System.out.println("Inches:");
		height_inches = keyboard.nextFloat();
		System.out.println("Step 2: Enter weight");
		System.out.println("Pounds:");
		weight = keyboard.nextFloat();
		
		height = height_inches + (height_feet * 12);
				
		BMI = (weight * 703)/(height * height);
		
		String result = form.format(BMI);
		
		System.out.println("BMI: " + result);
		
		if (BMI > 29.9)
		{
			System.out.println("you are obese.");
		}
		else if (BMI >= 25.0 && BMI <= 29.9)
		{
			System.out.println("you are overweight.");
		}
		else if (BMI >= 18.5 && BMI <= 24.9)
		{
			System.out.println("you are normal.");
		}
		else if (BMI < 18.5)
		{
			System.out.println("you are underweight.");
		}
		
	}
}
