package pack1;

public class DeleteDuplicateElements 
{

	public static void main(String[] args) 
	{
		int count=0,k=0,j=0;
		int []a= new int[] {10,30,40,40,30,80};
int []temp= new int[a.length];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])	
			{
				temp[j]=a[i];
				j++;
				
			}

		}
		temp[j]=a[a.length-1];
		
		for(int i=0;i<temp.length-1;i++)
		{
			System.out.println(temp[i]);
			
		}

	}







}
