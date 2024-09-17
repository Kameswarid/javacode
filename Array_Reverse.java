package strings;

import java.util.Arrays;

public class Array_Reverse {
	public static void main(String[] args) {
		int id1[]=new int[5];
		id1[0]=2;
		id1[1]=4;
		id1[2]=6;
		id1[3]=8;
		id1[4]=10;
		
		int id2[]=new int[5];
		
		 for (int i=0,k=4;i<id1.length;i++)
		 {
			 id2[k]=id1[i];
			 k--;
		 }
		 System.out.println(Arrays.toString(id1));
		 System.out.println(Arrays.toString(id2));
	}

}
