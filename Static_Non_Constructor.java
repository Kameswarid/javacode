package basics;

public class Static_Non_Constructor {
	//static methods parameterized
	
	static void add(int a, int b)
	{
		int add=a+b;
		
		System.out.println("static method1\t"+add);
	}
	
	static void sub(int a,int b)
	{
		
		int sub=a-b;
		System.out.println("static method2\t"+sub);
	}
    static void mul(int a, int b)
    {
    	
    	int mul=a*b;
    	System.out.println("static method3\t"+mul);
    }
    // non-static methods parameterized
    
    void compare(int x,int y)
    {
    	if((x==y)||(x>=y)||(x!=y))
    		System.out.println("static");
    	else
    		System.out.println("non-static");
    }
    
    void condition(int x)
    {
    	if(x<100)
    		System.out.println("Negative ");
    	else
    		System.out.println("positive");
    }
    void check(int c, int d)
    {
    	if(!(c==d))
    	
    		System.out.println("Anil is good boy");
    }
    
    //constructor methods 
  //  Static_Non_Constructor()
   // {
    	
   //}

    Static_Non_Constructor(int a,int b)
    {
    	System.out.println("contructor 1");
    }
    Static_Non_Constructor(String Name, int age,char gender)
    {
    	System.out.println("constructor 2");
    }
    Static_Non_Constructor(char p, int q)
    {
    	System.out.println("constructor 3");
    }
    public static void main(String[] args) 
    {
    	add(10,5);
    	sub(2,100);
    	mul(5000,1);
    	
    	Static_Non_Constructor s1= new Static_Non_Constructor("Anil",5,'M');
    	
    	Static_Non_Constructor s2= new Static_Non_Constructor(474695,6547896);
    	s1.compare(5, 5);
    	s2.condition(100);
    	
    	s1.check(4, 9);
    	
    	new Static_Non_Constructor('l', 456874122);
    	
		
	}
}

