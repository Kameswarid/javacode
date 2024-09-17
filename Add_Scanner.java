package basics;

import java.util.Scanner;

public class Add_Scanner {

	static void add()
	{
		
		Scanner ad =new Scanner(System.in);
		System.out.println("Enter a->");
		int a= ad.nextInt();
		System.out.println("Enter b->");
		int b=ad.nextInt();
		int sum=a+b;
		System.out.println(sum);
		
	}

public static void main(String[] args) {
	add();
}

	}

