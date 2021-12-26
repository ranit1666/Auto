package demo;

public class Cloud 
{

	public static void main(String args[])
	{
		int a[]= {0,0,0,1,0,0};
	
		int index=a.length-1;
		int sum=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(i+2<index && a[i+2]!=1 )
			{
				if(i+2<index)
				{	
				i++;
				}
				sum=sum+1;
			}
			else if(a[i+1]!=1)
			{
				sum=sum+1;
			}
			
		}

		System.out.println("No of jumps in cloud :"+sum);

	}	
	
	
	
}
