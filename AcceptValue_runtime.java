package strings;

import java.util.Arrays;
import java.util.Scanner;

public class AcceptValue_runtime {
	public static void main(String[] args) {
		int stu_id[]=new int[4];
		System.out.println("Enter 4 id's");
		Scanner s=new Scanner(System.in);
		for (int i=0;i<4;i++)
		{
			stu_id[i]=s.nextInt();
	    }
		System.out.println(Arrays.toString(stu_id));
	}
}
