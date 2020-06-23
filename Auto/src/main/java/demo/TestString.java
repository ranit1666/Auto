package demo;

import org.testng.annotations.Test;


public class TestString 
{
	@Test
	public void test()
	{
	String a="my name is ranit";
	String c[]=a.split(" ");
	String b="ranit";
	String rev="";
	System.out.println(a.hashCode());
	System.out.println(b.hashCode());
	for(int i=0;i<c.length;i++)
	{
		rev=rev+c[i];
		
	}
	System.out.println("total word length:"+c.length);
	System.out.println(rev);
	}
	
	
}
