package demo;

import org.testng.annotations.Test;

public class CapitalWord 
{

	 @Test
		public void reverse()
		{
			String a="this is javatpoint";
			String b[]=a.split(" ");
			String rev="";
			for(int i=0;i<b.length;i++)
			{
				StringBuffer s= new StringBuffer(b[i]);	
				rev=rev+s.substring(0,1).toString().toUpperCase()+s.substring(1)+" ";
			}
			
			System.out.println(rev);
			System.out.println("test1"); //delete it
			System.out.println("test2"); //delete it
		}
	
	 
}
