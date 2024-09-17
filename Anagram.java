package strings;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
	String s1="ram";
	String s2="arm";
	
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	
	Arrays.sort(c1);
	Arrays.sort(c2);
	System.out.println(Arrays.toString(c1));
	System.out.println(Arrays.toString(c2));
	boolean b=Arrays.equals(c1,c2);
	System.out.println(b);  
	if(b==true)
	{
		System.out.println("It is an Anagram");
	}
		else
			System.out.println("It is not Anagram");
	}
	

}

