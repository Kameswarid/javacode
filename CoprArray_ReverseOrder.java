package strings;

import java.util.Arrays;

public class CoprArray_ReverseOrder {
public static void main(String[] args) {
	int rollno1[]=new int[5];
	rollno1[0]=21;
	rollno1[1]=22;
	rollno1[2]=23;
	rollno1[3]=24;
	rollno1[4]=25;
	
	int rollno2[]=new int[5];
	
	for(int i=0,k=4;i<rollno1.length;i++)
	{
		rollno2[k]=rollno1[i];
		k--;
	}
	System.out.println(Arrays.toString(rollno1));
	System.out.println(Arrays.toString(rollno2));
}
}
