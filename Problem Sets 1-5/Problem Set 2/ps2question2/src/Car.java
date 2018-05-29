
public class Car 
{
	private int yearModel;
	private String make;
	private int speed;
	
	public Car()
	{
		yearModel = 0;
		make = "";
		speed = 0;
	}
	
	public Car(int yearModel, String make)
	{
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	
	public Car(int yearModel, String make, int speed)
	{
		this.yearModel = yearModel;
		this.make = make;
		this.speed = speed;
	}
	
	public int getYearModel()
	{
		return yearModel;
	}
	
	public String getMake()
	{
		return make;
	}
	
	public int getSpeed()
	{
		return speed;
	}
	
	public void accelerate()
	{
		speed += 5;
	}
	
	public void brake()
	{
		speed -= 5;
	}
}
