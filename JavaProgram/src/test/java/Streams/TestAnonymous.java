package Streams;

public class TestAnonymous
{

	public static void main(String[] args) 
	{
		TestingAnonymous obj=new TestingAnonymous() {

			public void test()
			{
				System.out.println("This is for testing inside TestAnonymous");
			}

		};
		obj.test();

	}

}

class TestingAnonymous 
 {
	
	public void test()
	{
		System.out.println("This is for testing");
	}
	
	
 }




