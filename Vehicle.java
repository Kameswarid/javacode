package basics;

class Car
{

	static void maruti()
	{
		System.out.println(1);
	}
	static void honda()
	{
		System.out.println(2);
	}
}

class Bike extends Car
{
     static	void pulsar()
	{
		System.out.println(3);
	}
	static void RE()
	{
		System.out.println(4);
	}
}
public class Vehicle extends Bike
{
public static void main(String[] args)
{
	RE();
	pulsar();
	maruti();	
	honda();
	//aeroplane();
}
}
