
public class Grade 
{
	private double percentage;
	private char lettergrade;
	
	public Grade(double percentage)
	{
		this.percentage = percentage;
	}
	
	public double getPercentage()
	{
		return percentage;
	}
	
	public char getLetterGrade()
	{
		if (percentage <= 100.0 && percentage > 89.9)
		{
			lettergrade = 'A';
		}
		else if (percentage <= 89.9 && percentage > 79.9)
		{
			lettergrade = 'B';
		}
		else if (percentage <= 79.9 && percentage > 69.9)
		{
			lettergrade = 'C';
		}
		else if (percentage <= 69.9 && percentage > 59.9)
		{
			lettergrade = 'D';
		}
		else if (percentage <= 59.9 && percentage >= 0.0)
		{
			lettergrade = 'F';
		}
		
		return lettergrade;
	}
}
