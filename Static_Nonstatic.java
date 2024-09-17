package basics;

public class Static_Nonstatic {

	static void Login(String Uname, String Pwd)
	{
		System.out.println("Enter Uname and Pwd");
	}
	
	void add(int a1, int a2)
	{
	if(!(a1<a2)||(a1==a2))
	{
		int sum=a1+a2;
		System.out.println(sum);
	}
	else
	{
		int sub=a1-a2;
		System.out.println(sub);
	}
	}
	public static void main(String[] args) 
	{
		Login("Anil@gmail.com","AnilNitala");
		
		Static_Nonstatic a=new Static_Nonstatic();
		a.add(1,2);
	}
}
