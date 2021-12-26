package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.testng.annotations.Test;



public class Sherlock
{


     @Test
	public static void main(String args[]) 
	{
	
		String s= "aaaabbcc";
		char []a=s.toCharArray();
		int []f=new int[a.length];
		for(int i=0;i<a.length;i++)	
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)	
			{	
				if(a[i]!='1' && a[i]==a[j])
				{
					count++;
					a[j]=1;
				}

			}
			
			if(a[i]!='1')
			{	
			f[i]=count;
			}
			
		}
		List<Integer> list2 = new ArrayList<Integer>();
	      for(Integer text:f) 
	      {
	         list2.add(text);
	      } 
int max= Collections.max(list2);
System.out.println("max="+max);
int min= Collections.min(list2);
System.out.println("min="+min);
if(max==min ||(max-min)==1)
{
	System.out.println("YES");
//return "YES";	
 
}
else
{
System.out.println("NO"); 
}
//return "NO";	

	}



}
