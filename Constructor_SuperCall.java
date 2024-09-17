package basics;

 class Const 
{
	
	Const(int i)
	{
		System.out.println("Hi-1");
	}
}
class Child1 extends Const
	{
		Child1(String a)
		{
		super(1);
		System.out.println("Hiiiiii");
	    }
	
	public class Child2 extends Child1
	{
	Child2()
		{
		   super("DK");
		
			System.out.println("Hello");
		}
	
	
	
		public static void main(String[] args) 
	     {
			Const c1=new Const(10);
	        new Child1("kj");
	     }
	}	
}
		//new Child1();
		//new Child1(5);
		//new Child2("MKT");
	
	      
    

