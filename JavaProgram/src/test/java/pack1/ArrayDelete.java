package pack1;

public class ArrayDelete {

	public static void main(String[] args) 
	{
int count=0,k=0;
		int []a= new int[] {10,20,60,40,30,80};

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==30)	
			{
				k=i;
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				count++;
				break;
			}

		}
if(count==0)
{
	System.out.println("Element not found");
}
	
else
{
	System.out.println("Element deleted at position - "+k);
}

		for(int i=0;i<a.length-1;i++)
		{
			System.out.println(a[i]);
		}

	}

}
