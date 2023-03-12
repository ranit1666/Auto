package demo;

import org.testng.annotations.*;

public class ReverseString
{

	@Test
	public void stringReverse()
	{
		//StringBuffer s= new StringBuffer();
		String a="nitin";
		String rev="";
		char ch[]=a.toCharArray();
		int len=ch.length;
		for(int i=len-1;i>=0;i--)
		{
			//s.append(ch[i]);
			rev=rev+ch[i];
		}
		//System.out.println(s);
		System.out.println(rev);
		//if(a.equals(s.toString()))
			if(a.equals(rev))
		{
			System.out.println("This is palindrome string");
		}

		else
		{
			System.out.println("This is not palindrome string");
		}
	}


}
