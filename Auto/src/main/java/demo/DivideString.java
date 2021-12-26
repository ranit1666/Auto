package demo;

public class DivideString 
{

	public static void main(String []argh)
	{
	      String a= "aaaabbbbccccddd";
	      int j=0;
	            int len=a.length();
	            String []arr=new String[len];
	            int part =3;
	            int div= len/part;
	            System.out.println("div= "+div);
	            if(len%part!=0)
	            {
	            	System.out.println("Error ");
	            }
	            
	            
	            for(int i=0;i<a.length();i=i+div)
	            {
	                arr[j]=a.substring(i,i+div);											
	                System.out.println(arr[j]);
	                j++;
	            }
	            
	  }
	        
	
	
	
	
	
	
}
