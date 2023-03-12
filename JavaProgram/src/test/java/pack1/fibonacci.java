package pack1;

import org.testng.annotations.Test;

public class fibonacci 
{

	
	@Test
	public void test()
	{
		int a=0,b=1;
		
		for(int i=0;i<10;i++)
		{
			System.out.println(a);
			int c=a+b;
			a=b;
			b=c;
			
		}
		
		
	}
	
	
	
}
