
public class EmployeeDemo 
{
	public static void showEmployee(Employee e)
	{
		System.out.println("Employee: (" + e.getName() + ") (" + e.getID() + ") (" + e.getDepartment() + ") (" + e.getPosition() + ")");
	}
	public static void main(String[] args)
	{
		/* test constructors */
		Employee e1 = new Employee();
		Employee e2 = new Employee("Billy Mitchell", 1050200);
		Employee e3 = new Employee("Steve Wieve", 1049100, "Marketing", "Tester");
		showEmployee(e1);
		showEmployee(e2);
		showEmployee(e3);
		/* test mutators */
		e1.setName("Walter Day");
		showEmployee(e1);
 
		e1.setDepartment("Twin Galaxies");
		showEmployee(e1);
 
		e1.setPosition("Referee");
		showEmployee(e1);
 
		e1.setID(1);
		showEmployee(e1);
 
		e2.setDepartment("Hot Sauce");
		e2.setPosition("Lead");
		showEmployee(e2);
 
		e3.setName("X");
		e3.setID(50);
		e3.setDepartment("Y");
		e3.setPosition("Z");
		showEmployee(e3);
	}
}
