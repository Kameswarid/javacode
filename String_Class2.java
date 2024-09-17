package strings;

 /* equals
 * equalsall
 * replace
 * replaceall
 * contains
 * containsall
 * matches
 * charAt(index)  */
public class String_Class2
{
	public static void main(String[] args) 
	{
		String s1="Duvvuri";
		String s2="Kameswari";
		String s3="Pani";
		
	/*	boolean b=s1.equals(s2);
		System.out.println(b);*/
	
	/*	boolean b1=s1.equalsIgnoreCase(s2);
		System.out.println(b1); */
		
		//System.out.println(s3.concat(s2));
	//	System.out.println(s3.concat(s2).concat(s1));
		
		String s4="Anil Nitala";
		//s4=s1.replace('D', 'i');
	//	System.out.println(s4);
		
	//	String s5=s4.replaceAll("Anil","Surya");

	//	System.out.println(s5);
		
	/*	String s6="Pragathi nagar 500090";
		String s7= s6.replaceAll("[a-z]","");
		System.out.println(s7);   */
		
		/*String s8=s6.replaceAll("[0-9]", "");
		System.out.println(s8);
		
		String s8=s6.replaceAll("[  ]", "");
		System.out.println(s8);  */
		
	/*	String s9="Akshara is good girl";
		boolean s10=s9.contains("bad");
		System.out.println(s10);  */
		
	/*	boolean b2= s2.matches("(.*)i");
		System.out.println(b2);  */
		
		
	/*	boolean b3= s2.matches("i(.*)");
		System.out.println(b3);  */
		
	/*	boolean b4= s4.matches("(.*)z(.*)");
		System.out.println(b4);  */
		
		String s11="Anil";
	/*	boolean a=s11.matches("....");
		System.out.println(a); 
		
		char c1=s11.charAt(2);
		System.out.println(c1);  */
		
		int i=s11.indexOf('l');
		System.out.println(i);
		}

}
