import java.util.Random;


public class DateDemo 
{
	public static void main(String[] args)
	{
		Random r = new Random(0);
		for (int month = 1; month <= 12; month++)
		{
			for (int day = 1; day <= 32; day++)
			{
				System.out.println(new Date(month, day, Math.abs(r.nextInt()) % 501 + 1500));
			}
		}
		System.out.println(new Date(2, 28, 1776));
		System.out.println(new Date(2, 29, 1776));
		System.out.println(new Date(2, 28, 1800));
		System.out.println(new Date(2, 29, 1800));
		System.out.println(new Date(2, 28, 2000));
		System.out.println(new Date(2, 29, 2000));
 
	}
}
