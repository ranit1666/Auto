package demo;

import java.io.IOException;

import elementPath.A;

public class C extends A{

	int a=6,b=0; 
	public void ranit()
	{
		try {
		int c=a/b;
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("this is for testing");
		}
		
	}
	
	void m() throws InterruptedException{
	    Thread.sleep(1000);
	  }
	  void n() throws InterruptedException{
	    m();
	  }
	  void p() throws InterruptedException{
	  // try{
	    n();
	  //    }
	  // catch(Exception e){System.out.println("exception handeled");}
	          }
	
	
	public void ranit2() throws IOException 
	{
		throw new ArithmeticException("aaaa");
		//throw new IOException("testing");
		//System.out.println("testing");
		
	}
	
	
	
	public static void main(String args[]) throws InterruptedException 
	{
		C obj= new C();
		obj.p();
		obj.ranit();
		//obj.ranit2();
		
		
		//obj.fun();
		
	}
	
	
}

