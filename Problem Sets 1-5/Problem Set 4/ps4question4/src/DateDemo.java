
public class DateDemo 
{
	public static void test(Date d1, Date d2)
	{
		if (d1.equals(d2))
		{
			System.out.println("\"" + d1 + "\" matches \"" + d2 + "\"");
		}
		else
		{
			System.out.println("\"" + d1 + "\" doesn't matche \"" + d2 + "\"");
		}
	}
 
	public static void main(String[] args)
	{
		test(new Date("January", 1, 1970), new Date(1, 1, 1970));
		test(new Date("December", 20, 1970), new Date(12, 20, 1971));
		test(new Date("July", 15, 1970), new Date(7, 14, 1970));
		test(new Date("July", 15, 1970), new Date(7, 15, 1970));
		test(new Date("November", 1, 1970), new Date(11, 1, 1970));
		test(new Date("April", 1, 1492), new Date(4, 1, 1492));
		test(new Date("March", 1, 1970), new Date(1, 1, 1970));		
 
		Date d = new Date("January", 1, 1970);
		if (d.equals(new String("Blah")))
		{
			System.out.println("Should not see me");
		}
		else
		{
			System.out.println("Date can only possibly match another Date");
		}
	}
}
