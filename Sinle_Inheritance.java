package inherit;
class SuperMost_Class
{
	SuperMost_Class()
	{
		this(101,"Ramya",124355533.5);
		System.out.println("SuperMost constructor");
	}
	SuperMost_Class(int b, int a)
	{
		//this();
		System.out.println("with parameters constructor");
	}
	SuperMost_Class(int id, String name, double sal)
	{
		this("Day shift");
		System.out.println("Employee detail");
	}
	SuperMost_Class(String shift_time)
	{
		this(43,65);
		System.out.println("Empl timings");
	}
	
}
class Super_Class extends SuperMost_Class
{
	Super_Class(int q)
	{
		
		System.out.println("Super constructor with parameter ");
	
	}
	Super_Class()
	{
		
		System.out.println("Super constructor");
	
	}
	
	 void add()

	{
		System.out.println("12");
		
	}
	
}
public class Sinle_Inheritance extends Super_Class
{
	public static void main(String[] args) {
		Sinle_Inheritance in=new Sinle_Inheritance();
		in.add();
		System.out.println("Single Inherit");
	}
}
