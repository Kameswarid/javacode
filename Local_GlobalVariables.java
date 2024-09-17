package basics;

public class Local_GlobalVariables {

	 int a=2,b=5;
	
	static void add(int a, int b,int c)
	{
		c= a+b;
		System.out.println(c);
	}
	void mul(int x)
	{
		x=a*b;
		System.out.println(x);
	}
	public static void main(String[] args) {
		add(1,5,0);
		
		Local_GlobalVariables q= new Local_GlobalVariables();
		q.mul(0);
		
	}
}
