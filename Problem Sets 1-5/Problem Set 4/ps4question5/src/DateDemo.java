import java.util.Random;


public class DateDemo 
{
	public static void test(Date d)
	{
		System.out.print(d);
		if (d.isLeapYear())
			System.out.println(" is in a leap year.");
		else
			System.out.println(" is not in a leap year.");
	}
 
	public static void main(String[] args)
	{
		Random r = new Random(0);
		for (int x = 1; x <= 300; x++)
		{
			test(new Date(Math.abs(r.nextInt()) % 12 + 1,
										Math.abs(r.nextInt()) % 29 + 1,
									Math.abs(r.nextInt()) % 501 + 1500));
		}
 
	}
}
