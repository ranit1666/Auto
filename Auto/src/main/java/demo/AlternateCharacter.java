package demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.testng.annotations.Test;

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