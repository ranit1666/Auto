package pack1;

import org.testng.annotations.Test;

public class DuplicateElement 
{
	@Test
	public void arraytest()
	{
	int a[]= {10,20,5,8,5,10,20,30,5,6,7,6};

for(int i=0;i<a.length;i++)
{
	int count=1;
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]==a[j] && a[i]!='0')
		{
			count++;
			a[j]='0';
			//System.out.println(a[j]);
			//break;
		}
		
	}
	
	
	if(count>1 && a[i]!='0')
	{
		System.out.println(a[i]);
	}
	
}
	
	}	
	
	
	
	
	
	
}
