
public class CarDemo 
{
	public static void printCar(Car c)
	{
		System.out.println("The " + c.getYearModel() + " " + c.getMake() + " is going " + c.getSpeed() + " MPH.");
	}
 
	public static void main(String[] args)
	{
		/* test the constructor */
		Car my_car = new Car(1982, "DeLorean");
		/* test accessors */
		printCar(my_car);
		/* set accelerate */
		for (int counter = 0; counter < 18; counter++)
		{
			my_car.accelerate();
			printCar(my_car);
		}
		if (my_car.getSpeed() >= 88)
        {
            System.out.println("Pew pew crxxxzsash!  Great Scott!");
        }
		/* test brake */
		for (int counter = 15; counter > 0; counter--)
		{
			my_car.brake();
			printCar(my_car);
		}
	}
}
