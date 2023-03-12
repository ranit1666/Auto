package pack1;

public class HighestAndSmallestWord {

	public static void main(String[] args) 
	{
	    String max="";
	    String min="";
		String a = "Hardships often prepare ordinary people for an extraordinary destiny a";  
		String []b=a.split(" ");
		int count=0,maxcount=0,mincount=0;
		int smallcount=b[0].length();
		int len=b.length;	
		for(int i=0;i<len;i++)
		{
		count=b[i].length();
					
		if(count>maxcount)
		{
			maxcount=count;
			max=b[i];
		}
			
		}
		
		System.out.println(max+" :is the string and its length :"+maxcount);
		for(int i=1;i<len;i++)
		{
			mincount=b[i].length();
					
		if(mincount<smallcount)
		{
			smallcount=mincount;
			min=b[i];
		}
			
		}
		System.out.println(min+" :is the string and its length :"+smallcount);
	}

}
