package demo;

import org.testng.annotations.Test;


public class TestNgPractice 
{

	@Test (priority=-5000) 
	public void mango()  
	{  
	System.out.println("I am -1"); 
	int []b=new int[4];
	b[0]=1;
	b[1]=2;
	String a ="ranit";
	System.out.println("a= "+a.length());
	System.out.println("b= "+b.length);
	}  
	@Test(priority=0)  
	public void apple()  
	{  
	System.out.println("I am 0");  
	}  
	@Test(priority=15)  
	public void watermelon()  
	{  
	System.out.println("I am 1");  
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
