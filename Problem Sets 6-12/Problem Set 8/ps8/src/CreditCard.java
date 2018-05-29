import java.util.ArrayList;
import java.util.List;


public class CreditCard 
{
	private String cardnumber; 
	private String digits = "";
	private String Issuer; 
	
	public CreditCard(String cardnumber)
	{	
		this.cardnumber = cardnumber;
		
		for(int x = 0; x < cardnumber.length(); x++)
		{
			if(Character.isDigit(cardnumber.charAt(x)))
			{
				//Concatenates(links) two or more strings using the the + it converts the character to string
				digits = digits.concat(this.cardnumber.charAt(x) + "");
			}
		}
	}
	
	public String getIssuer()
	{
		if (digits.charAt(0) == '3' && digits.charAt(1) == '0' && digits.charAt(2) == '0' && digits.length() == 14)
		{
			Issuer = "Diner's Club";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '0' && digits.charAt(2) == '1' && digits.length() == 14)
		{
			Issuer = "Diner's Club";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '0' && digits.charAt(2) == '2' && digits.length() == 14)
		{
			Issuer = "Diner's Club";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '0' && digits.charAt(2) == '3' && digits.length() == 14)
		{
			Issuer = "Diner's Club";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '0' && digits.charAt(2) == '4' && digits.length() == 14)
		{
			Issuer = "Diner's Club";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '0' && digits.charAt(2) == '5' && digits.length() == 14)
		{
			Issuer = "Diner's Club";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '6' && digits.length() == 14)
		{
			Issuer = "Diner's Club";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '8' && digits.length() == 14)
		{
			Issuer = "Diner's Club";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '4' && digits.length() == 15)
		{
			Issuer = "American Express";
		}
		else if (digits.charAt(0) == '3' && digits.charAt(1) == '7' && digits.length() == 15)
		{
			Issuer = "American Express";
		}
		else if (digits.charAt(0) == '4'  && digits.length() == 13)
		{
			Issuer = "VISA";
		}
		else if (digits.charAt(0) == '4'  && digits.length() == 16)
		{
			Issuer = "VISA";
		}
		else if (digits.charAt(0) == '5'  && digits.charAt(1) == '1'  && digits.length() == 16)
		{
			Issuer = "MasterCard";
		}
		else if (digits.charAt(0) == '5'  && digits.charAt(1) == '2' && digits.length() == 16)
		{
			Issuer = "MasterCard";
		}
		else if (digits.charAt(0) == '5'  && digits.charAt(1) == '3'  && digits.length() == 16)
		{
			Issuer = "MasterCard";
		}
		else if (digits.charAt(0) == '5'  && digits.charAt(1) == '4'  && digits.length() == 16)
		{
			Issuer = "MasterCard";
		}
		else if (digits.charAt(0) == '5'  && digits.charAt(1) == '5'  && digits.length() == 16)
		{
			Issuer = "MasterCard";
		}
		else if (digits.charAt(0) == '6' && digits.charAt(1) == '0' && digits.charAt(2) == '1' && digits.charAt(3) == '1' && digits.length() == 16)
		{
			Issuer = "Discover";
		}
		else
		{
			Issuer = "Unknown";
		}
		
		
		return Issuer;
	}
	
	private boolean isOdd(int x)
	{
		return (x) % 2 == 1;
	}
	
	public boolean isValid()
	{
		int doubleDigit;
		int sum = 0;
		//if the digit length is even
		//execute below
		if(digits.length() % 2 == 0)
		{
			//loop each individual digits
			for(int x = 0; x < digits.length(); x++)
			{
				//checks if its an odd digit
				//and in the odd position (x + 1)
				if(isOdd(x + 1))
				{
					//double the digits
					 doubleDigit = 2 * (digits.charAt(x) - '0');
					 //if the double digit is greater than 9
					 if(doubleDigit > 9)
					 {
						 //subtract 9
						 sum += doubleDigit - 9;
					 }
					 else
					 {
						 sum += doubleDigit;
					 }
				}
				else
				{
					sum += (digits.charAt(x) - '0');
				}
			}
			//checks if its divisible by 10
			if(sum % 10 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else//does same thing with odd numbered digits
		{
			
			for(int x = 0; x < digits.length(); x++)
			{
				//instead of odd check if its even
				if(!(isOdd(x + 1)))
				{
					 doubleDigit = 2 * (digits.charAt(x) - '0');
					 if(doubleDigit > 9)
					 {
						 sum += doubleDigit - 9;
					 }
					 else
					 {
						 sum += doubleDigit;
					 }
				}
				else
				{
					sum += (digits.charAt(x) - '0');
				}
			}
			if(sum % 10 == 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
	}
	
	public String toString()
	{
		String result;
		
		if (isValid())
		{
			result = digits + " was issued by " + getIssuer() + " and is valid.";
		}
		else
		{
			result = digits + " was issued by " + getIssuer() + " and is not valid.";
		}
				
		return result;
	}
}
