package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxStringLength 
{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();

		while(t>0)
		{
			int a= sc.nextInt();
			int []b = new int[a];
			
			ArrayList<Integer>x= new ArrayList<Integer>();
			for(int i=0;i<a;i++)
			{
				b[i] = sc.nextInt();   
			}
			int no=sc.nextInt();
			for(int i=0;i<b.length;i++)
			{

				if(b[i]<=no)
				{
					x.add(b[i]);

				}
			}

			System.out.println(x.size());

			t--;
		}



	}

}
