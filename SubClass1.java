package inherit;

class MethodOveridden {
	
	void add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
		
	}
	void sub(int p, int q)
	{
		int sub=p-q;
		System.out.println(sub);
	}
}
	
class SubClass1 extends MethodOveridden
{
	
	void add(int a, int b)
	{
		super.add(1,2);
		int add=(a+b)*2;
		System.out.println(add);
	}

public static void main(String[] args)
{
	SubClass1 m1=new SubClass1();
	
	m1.add(5,7);
	m1.sub(10, 8);
		
}
}


