package strings;

import java.util.Scanner;

public class Palindrom_String 
{
public static void main(String[] args) 
{
	System.out.println("Enter a string");
	Scanner s=new Scanner(System.in);
	String input=s.next();
	String output="";
	boolean a=input.equalsIgnoreCase(output);
	
	for(int i=input.length()-1;i>=0;i--)
	{
		char c=input.charAt(i);
		output=output+c;
		
	}
	System.out.println(output);

if(input.equals(output)==true)
{
	System.out.println("It is a Palindrom");
}
else
{
	System.out.println("It is not a palindrom");
}

}

}