package demo;



public class tOGGLE 
{

	//@Test
	public void toggle()
	{
		String a="this is javatpoint";
		String b[]=a.split(" ");
		String rev="";
		for(int i=0;i<b.length;i++)
		{
			StringBuffer s= new StringBuffer(b[i]);	
			rev=rev+s.substring(0,1).toString().toLowerCase()+s.substring(1).toUpperCase()+" ";
		}
		
		System.out.println(rev);
	}

	
	public static void main(String args[])
	{
		tOGGLE obj =new tOGGLE();
		obj.toggle();
	}
	
	
	
}
