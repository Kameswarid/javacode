package basics;

public class ArthimaticOperators {
static void  Add()
{
	int a=10;
	int b=30;
	int c=a+b;
	
	System.out.println(c);
}
static void sub()
{
	int d,a=20,b=40;
	d=a-b;
	System.out.println(d);
}
static void mul()
{
	int e,a=2,b=5;
	e=a*b;
	System.out.println(e);
}
static void div()
{
	int f,h=32,g=3;
	f=h/g;
	System.out.println(f);
}
static void mod()
{
	int i,j=47,k=7;
	i=j%k;
	System.out.println(i);
}
public static void main(String[] args)
{
	System.out.println("The arthimatic operator gives as:");
	Add();
	mul();
	sub();
	div();
	mod();
}
}
