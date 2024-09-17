package basics;

public class Method_overloading {

	static int a=1,b=2;
	void ope(int c)
	{
		c=a+b;
		
	}
	void ope(int a, int b, int c)
	{
		c=a*b;
		
	}
	public static void main(String[] args) {
		Method_overloading m1=new Method_overloading();
		m1.ope(0);
		m1.ope(2, 3, 0);
	}
}
