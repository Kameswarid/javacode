package strings;

import java.util.Arrays;

public class CopyOneArray_AnotherArray {
public static void main(String[] args) {
	int rollno1[]=new int[4];
	rollno1[0]=21;
	rollno1[1]=22;
	rollno1[2]=23;
	rollno1[3]=24;
	
	int rollno2[]=new int[4];
	for (int i=0;i<4;i++)
	{
		rollno2[i]=rollno1[i];
	}
	System.out.println(Arrays.toString(rollno1));
	System.out.println(Arrays.toString(rollno2));
	
}
}
