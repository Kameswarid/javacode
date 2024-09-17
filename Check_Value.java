package strings;

import java.util.Arrays;
import java.util.Scanner;

public class Check_Value 
{

public static void main(String[] args) 
{
	int i;
	int rollno[]=new int[4];
	rollno[0]=78;
	rollno[1]=88;
	rollno[2]=98;
	rollno[3]=34;
	System.out.println("Enter no to check");
	Scanner s=new Scanner(System.in);
	int notocheck=s.nextInt();
	
	for(i=0;i<4;i++)
	{
	if(notocheck==rollno[i])
	{
		System.out.println("The Given no->"+notocheck +" is the part of Array");
		System.out.println("The Given no->"+notocheck +" and its index is -> "+i);
	}
	}
	//if(notocheck!=rollno[i])
	else
	
		System.out.println("The Given no->"+notocheck+" is not part of Array");
	
	
}

}
