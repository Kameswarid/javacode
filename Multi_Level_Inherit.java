package inherit;



class Super_Most
{
	int roll_no;
	double salary;
	Super_Most()
	{
		System.out.println("Iam grand parent");

	}	
}
class Parent extends Super_Most
{
	Parent()
	{
 System.out.println("Iam the parent");
	}
	void reg(int roll_no, double salary)
	{
		this.roll_no=roll_no;
		this.salary=salary;
	}
}

public class Multi_Level_Inherit extends Parent
{

	public static void main(String[] args)
	{
		Multi_Level_Inherit m=new Multi_Level_Inherit();
		m.reg(101,234567898);
		System.out.println(m.roll_no);
		System.out.println(m.salary);
	}
}
