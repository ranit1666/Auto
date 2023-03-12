package abc;

public class Splitkey {
	
	private Splitkey()
	{
		System.out.println("testing");
	}

	public static void main(String[] args) {
		int index=0;
		String a="this is january month ";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)==' ')
			{
				System.out.println(a.substring(index,i));
				index=i+1;
			}
			
		}
		
		
		
		

	}

}
