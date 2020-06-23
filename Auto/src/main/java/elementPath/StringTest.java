package elementPath;

import org.testng.annotations.Test;

public class StringTest 
{

	@Test
	public void test()
	{
		String a="(SYS_I,3,'0')";
	String b=a.substring(a.indexOf("(")+1, a.indexOf(","));	
		System.out.println(b);
		String c[]=a.split(",");
		String value1=c[1];
		String value2=c[2].replaceAll("'", "").replace(")", "");
		System.out.println(value1);
		System.out.println(value2);
		int value3=Integer.parseInt(value1);
		int value4=Integer.parseInt(value2);
		int max=Math.max(value3, value4);
		int min=Math.min(value3, value4);
		System.out.println("max="+max+"min="+min);
	}
	
	
	
	
	
	
	
	
	
	
	
}
