
public class CircleDemo 
{
	public static void printCircle(Circle cir)
	{
		System.out.println("--");
		System.out.println("Circle area: " + cir.getArea());
		System.out.println("Circle diameter: " + cir.getDiameter());
		System.out.println("Circle circumference: " + cir.getCircumference());
		System.out.println("Circle radius: " + cir.getRadius());
	}
 
	public static void main(String[] args)
	{
		Circle c1 = new Circle(5.25);
		Circle c2 = new Circle();
 
		printCircle(c1);
		printCircle(c2);
 
		c1.setRadius(42.4);
		c2.setRadius(72.9);
		printCircle(c1);
		printCircle(c2);
	}
}
