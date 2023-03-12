package abc;

import org.testng.annotations.*;

public class TestngTest 
{

	@Test
	public void test1()
	{
		System.out.println("This is for testing 1");
	}
	
	@Test
	public void test4()
	{
		System.out.println("This is for testing 4");
	}
	
	@BeforeMethod
	public void test2()
	{
		System.out.println("This is for before method");
	}
	
	@AfterMethod
	public void test3()
	{
		System.out.println("This is for after method");
	}
	
	@BeforeTest
	public void test5()
	{
		System.out.println("This is for before test");
	}
	
	@AfterTest
	public void test6()
	{
		System.out.println("This is for after test");
	}
	
	
	
	
}
