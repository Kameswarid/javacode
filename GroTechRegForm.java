package basics;

import java.util.Scanner;

public class GroTechRegForm {

	public static void main(String[] args)
	{
		System.out.println("GroTech Registration form");
		Scanner g1=new Scanner(System.in);
		System.out.println("First Name");
		String FirstName =g1. next();
		System.out.println(FirstName);
		
		System.out.println("Last Name");
		String LastName =g1. next();
		System.out.println(LastName);
		
		System.out.println("Email");
		String Email =g1. next();
		System.out.println(Email);
		
		System.out.println("Password");
		String Password =g1. next();
		System.out.println(Password);
		
		System.out.println("Male");
		String Male =g1. next();
		System.out.println(Male);
		
		System.out.println("Female");
		String Female =g1. next();
		System.out.println(Female);
		
		System.out.println("Present Address");
		String PresentAddress =g1. next();
		System.out.println(PresentAddress);
		
		System.out.println("Permanent Address");
		String PermanentAddress =g1. next();
		System.out.println(PermanentAddress);
		
		System.out.println("Pincode");
		long Pincode =g1. nextLong();
		
		System.out.println(Pincode);
		
	}
}
