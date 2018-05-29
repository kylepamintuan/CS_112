
public class Date 
{
	public String month_name;
	public int day;
	public int year;
	public int month_number;
	public boolean isleapyear = false;
	
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
			month_name = "Invalid date";
		}
	}
	
	public String toString()
	{
		float result = year % 4;
		float result2 = year % 100;
		float result3 = year % 400;
		
		if (result == 0 && result2 != 0)
		{	
			isleapyear = true;
		}
		else if (result3 == 0)
		{
			isleapyear = true;
		}
		else
		{
			isleapyear = false;
		}
		
		String valid_date = month_name + " " + day + ", " + year;
		String invalid_date = month_name + " " + day + ", " + year + " is an invalid date.";
		
		if(month_number >= 1 && month_number <= 12)
		{
			if (month_number == 2)
			{
				if (day >= 1 && day <= 28 && isleapyear == false)
				{
					return valid_date;
				}
				else if (day >= 1 && day <= 29 && isleapyear == true)
				{
					return valid_date;
				}
			}
			else if(month_number == 4 || month_number == 6 || month_number == 9 || month_number == 11)
			{
				if (day >= 1 && day <= 30)
				{
					return valid_date;
				}
			}
			else if (month_number != 4 || month_number != 6 || month_number != 9 || month_number != 11 ||  month_number != 2)
			{
				if (day >= 1 && day <= 31)
				{
					return valid_date;
				}
			}
		}
		else
		{
			return invalid_date;
		}
		
		return invalid_date;
		
	}
}
