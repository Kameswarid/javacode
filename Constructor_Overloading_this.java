package basics;

public class Constructor_Overloading_this{
	Constructor_Overloading_this()
	{
		this(3,"MKT");
		System.out.println(1);
	}
	Constructor_Overloading_this(int a)
	{
		this();
		System.out.println(2);
	}
	Constructor_Overloading_this(int a, String n)
	{
		System.out.println(3);
	}
	
	public static void main(String[] args) {
		new Constructor_Overloading_this(10);
		
	}
}


