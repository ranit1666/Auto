package pack1;

public class DuplicateWords {

	public static void main(String[] args) 
	{
		String a = "Big black bug bit a big black dog on his big black nose";
		a=a.toLowerCase();
		String []b=a.split(" ");
		int len=b.length;
			System.out.println(b);	
			System.out.println(b.length);	
			for(int i=0;i<len;i++)
			{
				int count=1;
			for(int j=i+1;j<len;j++)	
			{
				//System.out.println(b[j]);
				if(b[i].equals(b[j]) && !b[i].equals(" "))
				{
					b[j]=" ";
					count++;
				}
				
			}
				if(count>1)
				{
					System.out.println("Duplicate elements are :"+b[i]);
				}
				
			}
				
				
				
				
	}

}
