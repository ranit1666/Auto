package pack1;

import java.util.ArrayList;

public class MaxRepeatedWord {

	public static void main(String[] args) 
	{
		String a = "Big black bug bit a big black dog on his big black nose";
		a=a.toLowerCase();
		int maxcount=0;
		ArrayList<String>x= new ArrayList<String>();
		ArrayList<Integer>y= new ArrayList<Integer>();
		String max="";
		String []b=a.split(" ");
		int len=b.length;
		for(int i=0;i<len;i++)
		{
			int count=1;
			for(int j=i+1;j<len;j++)
			{
				if(b[i].equals(b[j])&& !b[i].equals("0"))
				{
					count++;
					b[j]="0";

				}
			}

			if(count>=maxcount)
			{
				maxcount=count;
				max=b[i];
				x.add(max);
				y.add(maxcount);
			}

		}

		for(int i=0;i<x.size();i++)
		{
			System.out.println(x.get(i)+" :is the string and it is repeated this times :"+y.get(i));
		}

	}


}