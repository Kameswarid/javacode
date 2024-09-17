package basics;

import java.util.Scanner;

public class SwitchCase 
{
static void shapes()
{
	System.out.println("Enter the input you want to choose");
	Scanner s1=new Scanner (System.in);
	int sh= s1.nextInt();
	switch(sh)
	{
	case 1: System.out.println("Circle"); break;
	case 2: System.out.println("Rectangle"); break;
	case 3: System.out.println("Square"); break;
	case 4: System.out.println("Triangle"); break;
	default: System.out.println("Choose only solid shapes"); break;
	}
}
public static void main(String[] args) {
	shapes();
}

}