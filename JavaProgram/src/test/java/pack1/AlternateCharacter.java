package pack1;

import org.testng.annotations.Test;

import java.io.IOException;

public class AlternateCharacter
{

	@Test
	public void test() throws IOException
	{
      
		String[] a=new String[] {"Ani", "Sam", "Joe","Ani"};
        
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==(a[j]) && a[i]!=" ")
				{
					System.out.println(a[i]);
					
				}
				
				
			}
			
		}
			
			
			
		
   }
	
	
	
}
