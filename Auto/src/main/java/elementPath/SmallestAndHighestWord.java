package elementPath;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class SmallestAndHighestWord 
{

	@Test
	public void test()
	{
//		String a="(SYS_I,3,'0')";
//	String b=a.substring(a.indexOf("(")+1, a.indexOf(","));	
//		System.out.println(b);
//		String c[]=a.split(",");
//		String value1=c[1];
//		String value2=c[2].replaceAll("'", "").replace(")", "");
//		System.out.println(value1);
//		System.out.println(value2);
//		int value3=Integer.parseInt(value1);
//		int value4=Integer.parseInt(value2);
//		int max=Math.max(value3, value4);
//		int min=Math.min(value3, value4);
//		System.out.println("max="+max+"min="+min);
		
        int len;
		ArrayList<String> d =new ArrayList<String>();
		String a="Sachin is a nice indian person";
		String b[]=a.split(" ");
		int max=b[0].length();
		int min=b[0].length();
		String c=b[0];
		for(int i=1;i<b.length;i++)
		{
			len=b[i].length();
			if(len>max)
			{
				max=len;
				c=b[i];
				d.add(b[i]);
			}
			
		}
		
		System.out.println("max= "+max+"; String= "+c);
		
		for(int i=0;i<b.length;i++)
		{
			len=b[i].length();
			if(len<min)
			{
				min=len;
				c=b[i];
			}
			
		}
		
		System.out.println("min= "+min+"; String= "+c);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
