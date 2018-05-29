import java.text.DecimalFormat;


public class MenuItem 
{
	private String name;
	private double price;
	
	public MenuItem(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String toString()
	{
		DecimalFormat df = new DecimalFormat(".00");
		String result = name + " $" + df.format(price);
		return result;
	}
}
