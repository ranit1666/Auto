package elementPath;

import org.testng.annotations.Test;

public class Split 
{

	@Test
	public void method1()
	{
	  String a="xpath://xyztt";
	  System.out.println(a.split(":",2)[1]);
	}
	
	
}
