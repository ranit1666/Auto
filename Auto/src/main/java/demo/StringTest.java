package demo;

import org.testng.annotations.Test;

public class StringTest 
{

	//@Test
	
	/*public void test()
	{
		String sourcecol = "if a=1 and b=1 then \"N\" else \"Y\" ";
		String sourcecoltrimspace= sourcecol.replaceAll(" ", "").replaceAll("\"", "");
		System.out.println(sourcecoltrimspace);
		String []array1=sourcecoltrimspace.split("then");
		System.out.println("array index 0="+ array1[0]);
		System.out.println("array index 1="+ array1[1]);
		String allcolname= array1[0];
		String array2[]= allcolname.split("and");
		String colnameWithValue1=array2[0].trim().replaceAll("if", "");
		String array3[]=colnameWithValue1.split("=");
		String colName1=array3[0];
		String colValue1=array3[1];
		//String colnameWithValue2=array2[1].trim();
		String array4[]=array2[1].split("=");
		String colName2=array4[0];
		String colValue2=array4[1];
		System.out.println("colname1="+colName1 +"colvalue1="+colValue1 +"colname2="+colName2 +"colvalue2="+colValue2);
		String []array5=array1[1].split("else");
		String desiredValue= array5[0];
		String modifiedValue= array5[1];
		System.out.println("desiredValue="+ desiredValue +" ;modifiedValue="+modifiedValue);
	}*/
	
	@Test
	public void test()
	{   char c[];
	int i;
	String str1 = "Hello"; 
	StringBuffer s = new StringBuffer(); 
	String str2 = "Javatpoint";
	String str3=str1.concat(str2);
	//System.out.println(str3);
	String a= "my name is ranit";
	char ch[]=a.toCharArray();
	for( i=0;i<a.length();i++)
	{
		if(ch[i]==' ')
		s.append(Character.toUpperCase(a.charAt(i)));
		else
		{
			s.append(a.charAt(i));
		}
	}
	System.out.println(s);

	//System.out.println(c[]);


	}

	
}
