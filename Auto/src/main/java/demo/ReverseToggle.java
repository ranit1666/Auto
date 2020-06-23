package demo;

import org.testng.annotations.Test;

public class ReverseToggle 
{

	@Test
	public void toggle()
	{
		String a="this is javatpoint";
		String b[]=a.split(" ");
		String rev="";
		for(int i=0;i<b.length;i++)
		{
			StringBuffer s= new StringBuffer(b[i]);	
			rev=rev+s.reverse().substring(0,1).toString().toLowerCase()+s.substring(1).toUpperCase()+" ";
		}
		
		System.out.println(rev);
	}
	
	
}
