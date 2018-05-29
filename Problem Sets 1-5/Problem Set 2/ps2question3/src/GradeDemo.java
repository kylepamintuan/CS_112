
public class GradeDemo 
{
	public static void printGrade(Grade win)
	{
		System.out.println("Grade: " + win.getPercentage() + " = "+ win.getLetterGrade());
	}
 
	public static void main(String[] args)
	{
		printGrade(new Grade(100.0));
		printGrade(new Grade(90.0));
		printGrade(new Grade(89.9));
		printGrade(new Grade(80.0));
		printGrade(new Grade(79.9));
		printGrade(new Grade(70.0));
		printGrade(new Grade(69.9));
		printGrade(new Grade(60.0));
		printGrade(new Grade(59.9));
		printGrade(new Grade(0));
	}
}
