
public class DateDemo 
{
	public static void test(Date d1, Date d2)
	{
		if (d1.comesBefore(d2))
		{
			System.out.println(d1 + " comes before " + d2);
		}
		else
		{
			System.out.println(d1 + " doesn't come before " + d2);
		}
	}
 
	public static void main(String[] args)
	{
		test(new Date(3, 23, 1900), new Date(3, 23, 1900));
 
		test(new Date(3, 23, 1899), new Date(3, 23, 1900));
		test(new Date(2, 23, 1900), new Date(3, 23, 1900));
		test(new Date(3, 22, 1900), new Date(3, 23, 1900));
 
		test(new Date(3, 27, 1900), new Date(3, 23, 1900));
		test(new Date(5, 23, 1900), new Date(3, 23, 1900));
		test(new Date(3, 22, 1901), new Date(3, 23, 1900));
	}
}
