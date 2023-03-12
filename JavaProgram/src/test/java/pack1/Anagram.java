package pack1;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram 
{

	@Test
	public void test() throws IOException
	{
		List<Integer> height= new ArrayList<Integer>();
		height.add(4);
		height.add(3);
		height.add(2);
		//height.add(3);
		height.add(1);
		//height.add(1);
		int count=0;
		Integer [] a =new Integer[height.size()];
		a=height.toArray(a);
		int b[] =new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
			
		}
		Arrays.sort(b);
		for(int i=0;i<a.length;i++)
		{
			
			if(b[i]!=a[i])
			{
				count++;
			}
		}
		
		System.out.println(count);
		
   }
	
	
	
	
	
	
	
	
}
