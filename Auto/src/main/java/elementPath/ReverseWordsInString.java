package elementPath;

import java.util.ArrayList;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String c="";
		String f="";
		String a="I am going to market";
		
		for(int i=a.length()-1;i>=0;i--)
		{
			f=f+a.charAt(i);
		}
		System.out.println("String 1 is:  "+f);
		String e[]=f.split(" ");
		for(int i=0;i<e.length;i++)
		{
			StringBuffer sb=new StringBuffer(e[i]);
			c=c+sb.substring(0,1).toUpperCase()+sb.substring(1).toLowerCase()+" ";
		}
		System.out.println("String is:  "+c);
		}

	}


