import java.util.Random;


public class DateDemo 
{
	public static void main(String[] args)
	{
		System.out.println("-- Number Tests --");
		Random r = new Random(0);
		for (int x = 0; x < 50; x++)
		{
			Date d = new Date(Math.abs(r.nextInt() % 12) + 1, //month
							  Math.abs(r.nextInt()) % 28, //day
							  1900 + r.nextInt() % 100); //year
			System.out.println(d);
		}
 
		System.out.println("-- Month Name Tests --");
		System.out.println(new Date("January", 1, 1970));
		System.out.println(new Date("February", 1, 1970));
		System.out.println(new Date("March", 1, 1970));
		System.out.println(new Date("April", 1, 1970));
		System.out.println(new Date("May", 1, 1970));
		System.out.println(new Date("June", 1, 1970));
		System.out.println(new Date("July", 1, 1970));
		System.out.println(new Date("August", 1, 1970));
		System.out.println(new Date("September", 1, 1970));
		System.out.println(new Date("October", 1, 1970));
		System.out.println(new Date("November", 1, 1970));
		System.out.println(new Date("December", 1, 1970));
 
	}
}
