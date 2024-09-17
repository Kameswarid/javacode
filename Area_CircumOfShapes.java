package basics;

import java.util.Scanner;

public class Area_CircumOfShapes {
	double pi=3.14;
	int r;
	void AreaOfcircle()
	{
		System.out.println("Area of Circle:");
		
		System.out.println("Enter radius r");
		Scanner a1=new Scanner(System.in);
		int r = a1.nextInt();
		double area=pi*r*r;
		System.out.println("The area of circle is:"+area);
		
		//System.out.println("Circumference of circle is:");
    	double circumference=2*pi*r;
    	System.out.println("Circle circumference is"+circumference);
	}
	
    void AreaOfRectangle()
	{
        System.out.println("Area of Rectangle:");
		
		System.out.println("Enter length l:");
		System.out.println("Enter breadth b:");
		Scanner a1=new Scanner(System.in);
		int l = a1.nextInt();
		int b= a1.nextInt();
		int area=l*b;
		System.out.println("The area of Rectangle is:"+area);
		
		//System.out.println("Circumference of Rectangle is:");
    	double circumference=2*(l+b);
    	System.out.println("Rectanle circumference is"+circumference);
	}
    
    void AreaOfSquare(int a)
    {
    	System.out.println("Area of square:");
    	
    	System.out.println("Enter area:");
    	Scanner a1=new Scanner(System.in);
		a = a1.nextInt();
		int area=a*a;
		System.out.println("The area of square is:"+area);
		
		//System.out.println("Circumference of Square is:");
		int circumference =4*a;
		System.out.println("Square circumference is:"+circumference);
    	
		
    }
   static void AreaOfTriangle(int h,int b)
   {
	   System.out.println("The  height, breadth of Triangle are "+h  +b);
	  // Scanner a1=new Scanner(System.in);
	//	h = a1.nextInt();
	//	b=a1.nextInt();
		double area=0.5*(b*h);
		System.out.println("The area of Triangle is:"+area);
   }
		
   static void AreaOfTrapezium()
   {
	   System.out.println("The are of Trapezium is:");
	   System.out.println("Enter lenght l1,l2 :");
   	Scanner a1=new Scanner(System.in);
		int l1 = a1.nextInt();
		int l2=a1.nextInt();
		int h=a1.nextInt();
		double area= 0.5*(l1+l2)*h;
		
		System.out.println("The area of Trapezium is"+area);
   }
	public static void main(String[]args)
	{
		Area_CircumOfShapes as=new Area_CircumOfShapes();
		as.AreaOfcircle();
		as.AreaOfRectangle();
		as.AreaOfSquare(23);
		
		AreaOfTriangle(8,12);
		AreaOfTrapezium();
	}
}
