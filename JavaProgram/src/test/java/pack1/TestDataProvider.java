package pack1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TestDataProvider 
{

	@Test(dataProvider="ranit")
	public void test(String username,String password,String email)
	{
		System.out.println("Username is : "+username);
		System.out.println("password is : "+password);
		System.out.println("email is : "+email);
	}
	
	@DataProvider(name="ranit")
	public Object[][] testData()
	{
		Object[][] data=new Object[3][3];
		
		data[0][0]="ranit";
		data[0][1]="abcd123";
		data[0][2]="ranit@yopmail.com";
		
		data[1][0]="arpit";
		data[1][1]="arpit123";
		data[1][2]="arpit@yopmail.com";
		
		data[2][0]="mimi";
		data[2][1]="mimi123";
		data[2][2]="mimi@yopmail.com";
		return data ;
	}
	
	
}
