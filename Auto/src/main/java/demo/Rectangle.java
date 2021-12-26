package demo;

public class Rectangle {

	 int length;

	public static void main(String[] args) 
	{
		
		Rectangle r1 = new Rectangle();
		r1.length=10;
		modify(r1);
		System.out.println("r1="+r1.length);
		
	}
	
	public static void modify(Rectangle r2)
	{
		//r2.length=20;
		System.out.println("r2="+r2.length);
	}
	

}
