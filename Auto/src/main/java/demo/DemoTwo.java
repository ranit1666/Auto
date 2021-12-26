package demo;

import org.testng.annotations.Test;

public class DemoTwo 
{

	 @Test
		public void reverse()
		{
			String a="this is javatpoint";
			String b="";
			
			for(int i=a.length()-1;i>=0;i--)
			{
				b=b+a.charAt(i);
			}
			System.out.println(b);
			
		}
	
}
