package demo;

public class RepeatedString 
{

	public static void main(String args[])
	{
		String a= "aabdcbaa";
		
		int len=a.length();
		long n=106;
		long sum,allcount,totalcount=0;
		int count=0,r,x=0;
		char d='a';
		if(a.contains("a"))
		{
			System.out.println("Pass");

			for(int i=0;i<len;i++)
			{
				if(a.charAt(i)==d)	
				{
					count++;

				}
			}

			sum=n/len;
			allcount=sum*count;
			r=(int) (n%len);
			String c=a.substring(0,r);
			
			System.out.println(c);
			for(int i=0;i<c.length();i++)
			{
				if(c.charAt(i)==d)	
				{
					x++;
                }
			}
			totalcount=allcount+x;
			System.out.println("total count is"+totalcount);
		}

		else
		{
			System.out.println("Fail");
		}




















		/*long n=817723;
		int x=(int)n;
		long count=0;
		char d='a';
		int index=a.length();
		String b="";
		int sum=0;
		while(b.length()<n)
		{
			b=b+a;
		}

		if(b.length()>n)
		{
			b=b.substring(0,x);
		}

		b= b.toLowerCase();

		for(int i=0;i<b.length();i++)
		{
			if(b.charAt(i)==d)
			{
				count++;
			}

		}
		System.out.println("No of count is :"+count);*/

	}




}
