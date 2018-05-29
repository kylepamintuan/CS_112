
public class Circle 
{
	private double radius;
	private double PI = 3.14159;
	private double area;
	private double diameter;
	private double circumference;
	
	public Circle()
	{
		radius = 0.0;
	}
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		area = PI * radius * radius;
		
		return area;
	}
	
	public double getDiameter()
	{
		diameter = radius * 2;
		
		return diameter;
	}
	
	public double getCircumference()
	{
		circumference = 2 * PI * radius;
		
		return circumference;
	}
}
