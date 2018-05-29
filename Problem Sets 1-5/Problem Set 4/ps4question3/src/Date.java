
public class Date 
{
	private String month_name;
	private int month_number;
	private int day;
	private int year;
	
	public Date(int month_number, int day, int year)
	{	
		this.day = day;
		this.year= year;
		this.month_number = month_number;

		if (month_number == 1)
		{
			month_name = "January";
		}
		else if (month_number == 2)
		{
			month_name = "February";
		}
		else if (month_number == 3)
		{
			month_name = "March";
		}
		else if (month_number == 4)
		{
			month_name = "April";
		}
		else if (month_number == 5)
		{
			month_name = "May";
		}
		else if (month_number == 6)
		{
			month_name = "June";
		}
		else if (month_number == 7)
		{
			month_name = "July";
		}
		else if (month_number == 8)
		{
			month_name = "August";
		}
		else if (month_number == 9)
		{
			month_name = "September";
		}
		else if (month_number == 10)
		{
			month_name = "October";
		}
		else if (month_number == 11)
		{
			month_name = "November";
		}
		else if (month_number == 12)
		{
			month_name = "December";
		}
		else
		{
			month_name = "Invalid month";
		}
	}
	
	public String toString()
	{
		if (day == 0 || year == 0 || month_name == "Invalid month")
		{
			return "Invalid date";
		}
		else
		{
			String result = month_name + " " + day + ", " + year;
			
			return result;
		}
	}
	
	public boolean comesBefore(Object other)
	{
		Date mask = (Date)other;
		
		if (year < mask.year)
		{
			return true;
		}
		else if (year == mask.year && month_number < mask.month_number)
		{
			return true;
		}
		else if (year == mask.year && month_number == mask.month_number && day < mask.day)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
