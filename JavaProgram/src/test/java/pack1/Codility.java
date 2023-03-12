package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class Codility 
{

	
	 
	
	 public static void main(String[] args) 
		{
		 ArrayList<Integer>x= new ArrayList<Integer>();
		 String a="505526";
		 for(int i=0;i<a.length()-1;i++)
		 {
			 x.add(Integer.parseInt(a.substring(i,i+2)));
		 }
		 int max = Collections.max(x);	 
		 System.out.println("ArrayList values : " + x);
		  System.out.println("ArrayList max value : " + max);
		}
}
