package demo;

import org.testng.annotations.Test;

public class Break12 
{
	
	@Test
	public void method1()
	{
	String a = "bcadefaghi";	
		String []b = a.split("a");
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

	
	
	
	
	
	
}
