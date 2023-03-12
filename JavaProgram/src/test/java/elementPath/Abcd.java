package elementPath;

public class Abcd {

	public static void main(String[] args) {
		
		String input = "Automation";
//		input=input.toLowerCase();
//		char[]a=input.toCharArray();
//		for(int i=0;i<a.length;i++)
//		{
//			int temp=1;
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]==a[j] && a[i]!='0')
//				{
//					temp++;
//					a[j]=0;
//					break;
//				}
//				
//			}
//				if(temp<2 && a[i]!=0)
//				{
//					System.out.println(a[i]);
//				}
//				
//		}
//		

		String a = "Automation";
		String b=a.substring(5,7);
		char c=a.charAt(4);
		a=b+c;
		System.out.println(a);
		
		
	}

}
