package strings;

import java.util.Arrays;

public class Array_Sort {
public static void main(String[] args) {
	String name="KAMESWARI";
	char c[]=name.toCharArray();
	System.out.println(Arrays.toString(c));
	Arrays.sort(c);
	System.out.println(Arrays.toString(c));
}
}
