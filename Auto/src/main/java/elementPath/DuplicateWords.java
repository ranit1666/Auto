package elementPath;

import java.util.ArrayList;

public class DuplicateWords 
{

	public static void main(String[] args) 
	{
		ArrayList<String> d =new ArrayList<String>();
		ArrayList<Integer> e =new ArrayList<Integer>();
		String a="Big black bug bit a big black dog on his big black nose";
		a=a.toLowerCase();
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++)
		{
			int count=1;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i].equals(b[j]))
				{
					count++;
					b[j]="0";
			    }
			}
			if(count>1 && b[i]!="0")
			{
				System.out.println("Duplicate words :  "+b[i]);
				d.add(b[i]);
				e.add(count);
			}
				
			}
		System.out.println("Duplicate words are:  "+d+" and frequency= "+e);
		}

		
	}
	

