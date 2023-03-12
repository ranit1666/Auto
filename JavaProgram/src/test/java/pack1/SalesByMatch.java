package pack1;

public class SalesByMatch 
{

	public static void main(String args[])
	{
		int a[]= {1,2,1,2,1,3,2};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && a[i]!=0)
				{
					count++;  
					a[j]=0;
				}

			}
			if(count>1)
			{
				sum=sum+(count/2);	

			}
		}

		System.out.println("Pair of socks :"+sum);

	}





}







