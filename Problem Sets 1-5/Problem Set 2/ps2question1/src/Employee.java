
public class Employee 
{
	//most variables in OO programming are private
	//this means they can't be accessed by other files directly
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	//this is a constructor
	//a constructor is a method that runs when the keyword NEW is used
	//constructors have no return type and they have the same name as the class
	//Lastly, constructors are used to initialize variables
	public Employee()
	{
		name = "";
		idNumber = 0;
		department = "";
		position = "";
	}
	
	//This is an overload constructor
	//overloaded means same name, different parameters
	public Employee(String name, int idNumber)
	{
		this.name = name;
		this.idNumber = idNumber;
		this.department = "";
		this.position = "";
	}
	
	//This is an overload constructor
	//overloaded means same name, different parameters
	public Employee(String name, int idNumber, String department, String position)
	{
		this.name = name;
		this.idNumber = idNumber;
		this.department = department;
		this.position = position;
	}
	
	//this is a setter
	//setters change the values of private variables
	public void setName(String name)
	{
		this.name = name;
	}
	
	//this is a getter
	//getters return private variables
	public String getName()
	{
		return name;
	}
	
	public void setID(int idNumber)
	{
		this.idNumber = idNumber;
	}
	
	public int getID()
	{
		return idNumber;
	}
		
	public void setDepartment(String department)
	{
		this.department = department;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void setPosition(String position)
	{
		this.position = position;
	}
	
	public String getPosition()
	{
		return position;
	}

}
