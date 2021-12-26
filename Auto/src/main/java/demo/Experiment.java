package demo;


import org.testng.annotations.Test;

public class Experiment 
{
     @Test
	public void value() 
	{
		
		demo(4);
		
	}


	
	public void demo(int a) 
	{
		if(a>5)
		{
			try {
			int x=	a/0;
				System.out.println("abc is displayed");
			} 
			catch (Exception e) 
			{
				System.out.println("Exception by ranit");
				}
		}
		
		else
		{
			System.out.println("others is displayed");
		}
		
	}
	
	
	
	
	
	
	
	
}
