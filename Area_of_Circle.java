package basics;

public class Area_of_Circle {
	
	double pi=3.14;
	
	void area1()
	{
		int r=2;
		double c=pi*r*r;
		System.out.println(c);
		
	}
	void area2()
	{
		int r=8;
		double c=pi*r*r;
		System.out.println(c);
	}
	void area3()
	{
		int r=97;
		double c=pi*r*r;
		System.out.println(c);
	}
	
	public static void main(String[] args)
	{
		Area_of_Circle ac=new Area_of_Circle();
		ac.area1();
		ac.area2();
		ac.area3();
	}

}
