package pack1;

import org.testng.annotations.Test;

public class SecondLargestInArray 
{
    @Test
	public void arraytest()
	{
	int a[]= {10,20,5,8,12,30,4};

for(int i=0;i<a.length;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]<a[j])
		{
			int m=a[i];
			a[i]=a[j];
			a[j]=m;
			//System.out.println(a[i]);
		}
		
	}
}
System.out.println("second largest :"+a[1]);
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}	
	}	
	
}
