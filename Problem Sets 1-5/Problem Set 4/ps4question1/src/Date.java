
public class Date 
{
	public static String month_name;
	
	
	public static String getMonthName(int month_number)
	{	
		if (month_number == 1)
		{
			month_name = "January";
			return month_name;
		}
		else if (month_number == 2)
		{
			month_name = "February";
			return month_name;
		}
		else if (month_number == 3)
		{
			month_name = "March";
			return month_name;
		}
		else if (month_number == 4)
		{
			month_name = "April";
			return month_name;
		}
		else if (month_number == 5)
		{
			month_name = "May";
			return month_name;
		}
		else if (month_number == 6)
		{
			month_name = "June";
			return month_name;
		}
		else if (month_number == 7)
		{
			month_name = "July";
			return month_name;
		}
		else if (month_number == 8)
		{
			month_name = "August";
			return month_name;
		}
		else if (month_number == 9)
		{
			month_name = "September";
			return month_name;
		}
		else if (month_number == 10)
		{
			month_name = "October";
			return month_name;
		}
		else if (month_number == 11)
		{
			month_name = "November";
			return month_name;	
		}
		else if (month_number == 12)
		{
			month_name = "December";
			return month_name;
		}
		else
		{
			month_name = "Invalid month";
			return month_name;
		}
	}
}
