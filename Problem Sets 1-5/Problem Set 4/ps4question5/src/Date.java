
public class Date 
{
	public String month_name;
	public int day;
	public int year;
	
	public Date(int month_number, int day, int year)
	{	
		this.day = day;
		this.year= year;

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
			month_name = "Invalid date";
		}
	}
	
	public String toString()
	{
		if (day == 0 || year == 0 || month_name == "Invalid date")
		{
			return "Invalid date";
		}
		else
		{
			String result = month_name + " " + day + ", " + year;
			
			return result;
		}
	}
	
	public boolean isLeapYear()
	{
		float result = year % 4;
		float result2 = year % 100;
		float result3 = year % 400;
		
		if (result == 0 && result2 != 0)
		{	
			return true;
		}
		else if (result3 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
