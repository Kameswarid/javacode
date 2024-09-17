package basics;
public class BusTickets 
{
public static void main(String[] args)
	{
		char gender1='M';
		//char gender2='F';
		int age = 75;
		
		if(gender1=='M')
		{
			if(age<=2)
			{
			    System.out.println("No Ticket");
			}
			else 
			{
				if(age>2 && age<=12)
				{
			    System.out.println("Half ticket");
			    }
			    else 
			    {
				    if(age>12 && age<=59)
				    {
			        System.out.println("Full ticket");
			        }
			        else 
			        {
				    //    if(age>=60)
				     //   {
				        System.out.println("SemiHalf ticket");
			         //   }
			         }
			     }
		     }
		}
		else
		{
			System.out.println("Ticket free for female");
		}
			}
			}
		
	
		
		
			
		
	
	

