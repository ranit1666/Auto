package abc;

import org.testng.annotations.Test;

import java.util.*;

public class Practice {

	//1.find smallest number
	@Test(enabled=true)
	public void sort() {

		int []a=new int[] {200,10,50,70,100};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
		}

		System.out.println(a[a.length-1]);
	}

	//2.pattern programming
	@Test(enabled=false)
	public void pattern() {

		int a=1;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(a+" ");
				a++;
			}

			System.out.println("");
		}

	}

	//3.add individual number in a number
	@Test(enabled=false)
	public void addNumber() 
	{
		int a=15412;
		int sum=0;
		while(a>0)
		{
			int r=a%10;
			sum=sum+r;
			a=a/10;
		}

		System.out.println(sum);	
	}

	//4.check continue statement
	@Test(enabled=false)
	public void verifyContinue() 
	{
		for(int i=0;i<5;i++)
		{
			if(i==2)
			{
				System.out.println("continue");
				continue;
			}
			System.out.println(i);
		}
	}

	//5.check alphabet,numbers count
	@Test(enabled=false)
	public void verifyNumbers() 
	{
		int alpha=0,num=0,spchar=0;
		String a="abc123!@#qas123";
		char []b=a.toLowerCase().toCharArray();
		for(int i=0;i<b.length;i++)
		{
			int c=(b[i]);
			if(c>=97 && c<=122)
				alpha++;
			else if(c>=48 && c<=57)
				num++;
			else if(c>=33 && c<=47 ||c>=58 && c<=64)
				spchar++;
		}

		System.out.println("alphabet= "+alpha+" num= "+num+" spchar= "+spchar);
	}

	//6.
	@Test(enabled=false)
	public void reverseAndOddPosition() 
	{
		String b="";
		String a="abc123!@#qas123";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);

		}
		System.out.println(b);
		for(int i=0;i<b.length();i=i+2)
		{
			System.out.println(b.charAt(i));

		}
	}	

	//7.check largest of 3 numbers
	@Test(enabled=false)
	public void largest() 
	{
		int a=100,b=25,c=800;
		if(a>b && a>c)
			System.out.println("highest= "+a);
		else if(b>a && b>c)
			System.out.println("highest= "+b);
		else if(c>a && c>b)
			System.out.println("highest= "+c);
	}	

	//8.find count of duplicate numbers
	@Test(enabled=false)
	public void duplicate() 
	{
		String a="THIS IS FOR TESTING ";
		char []b=a.toLowerCase().toCharArray();
		int []c=new int[a.length()];
		for(int i=0;i<b.length;i++)
		{
			int count=1;
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==b[j] && b[i]!='0' && b[i]!=' ' )
				{
					count++;
					b[j]='0';
				}
			}

			c[i]=count;

		}	

		for(int i=0;i<b.length;i++)
		{
			if(b[i]!='0' && b[i]!=' ')
			{
				System.out.println("character= "+b[i]+" count= "+c[i]);
			}
		}

	}

	//9.make first letter of the word capital
	@Test(enabled=false)
	public void capital() 
	{
		String a="this is for testing";
		String []b=a.split(" ");
		String c="";
		for(int i=0;i<b.length;i++)
		{
			//StringBuffer s=new StringBuffer(b[i]);
			c=c+b[i].substring(0,1).toUpperCase()+b[i].substring(1).toLowerCase()+" ";
		}	
		System.out.println(c);
	}	

	//10.sorting of number in a string
	@Test(enabled=false)
	public void sorting() 
	{
		String a="010201010100222112";

		int []x=new int[a.length()];
		for(int i=0;i<a.length();i++)
		{
			int y=Integer.parseInt(String.valueOf(a.charAt(i)));
			x[i]=y;
		}	

		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					int temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}	
			}
		}

		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]);
		}
	}		


	//11.find frequency of alphabets
	@Test(enabled=false)
	public void alphabets() 
	{
		int count=0;
		String a="sub53od73thab";
		for(int i=0;i<a.length();i++)
		{
			int x=a.charAt(i);
			if(x>=97 && x<=122)
			{
				count++;
			}
		}
		System.out.print(count);
	}		

	//12.find frequency of 0 and 1
	@Test(enabled=false)
	public void alphabetss() 
	{
		int count=0;
		String a="10011101101";
		String b="",c="";

		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='0')
			{
				b=b+a.charAt(i);
			}
			else if(a.charAt(i)=='1')
				c=c+a.charAt(i);
		}
		System.out.println("0 is "+b+" is : "+b.length());
		System.out.println("1 is "+c+" is : "+c.length());
	}

	//13.find frequency of hello
	@Test(enabled=true)
	public void findSubString() 
	{
		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		int lastIndex = 0;
		int count = 0;

		while (lastIndex != -1) {

			lastIndex = str.indexOf(findStr, lastIndex);

			if (lastIndex != -1) {
				count++;
				lastIndex += findStr.length();
			}
		}
		System.out.println(count);
	}	

	//14.remove Duplicate element from string array
	@Test(enabled=false)
	public void removeDuplicate() 
	{
		String str = "This is for this is testing";
		str=str.toLowerCase();
		String []a=str.split(" ");
		LinkedHashSet<String>b =new LinkedHashSet<String>();
		for(int i=0;i<a.length;i++)
		{
			b.add(a[i]);
		}
		System.out.println(b);

	}		


	//15.print the words from the end
	@Test(enabled=false)
	public void reverseSentence() 
	{
		String a="My name is ranit";
		String []b=a.split(" ");

		for(int i=b.length-1;i>=0;i--)
		{
			System.out.println("reverse string= "+b[i]);
		}

	}		

	//16.string concatenation
	@Test(enabled=false)
	public void ranit() 
	{
		int a=50;
		int b=10;
		String c="EY";
		System.out.print(a+b+c+" ");
		System.out.println(c+a+b);
	}

	//17.string length without strlen
	@Test(enabled=false)
	public void strlen() 
	{
		int count=0;
		String a="my name is ranit ray";
		a=a.replaceAll(" ", "");
		char []b=a.toCharArray();
		for(char x:b)
		{
			count++;
		}
		System.out.print(" string length= "+count);
	}

	//18.find prime number
	@Test(enabled=false)
	public void prime() 
	{
		boolean x=false;
		int a=61;
		for(int i=2;i<a/2;i++)
		{
			if(a%i==0)
			{
				x=true;
				break;
			}

		}
		if(x==false)	
		{
			System.out.println("it is prime");
		}
		else
			System.out.println("it is not prime");

	}

	//19.find prime number
	@Test(priority=-1,enabled=false)
	public void primenumber() 
	{

		for(int i=1;i<=100;i++)
		{
			boolean x=false;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0) 
				{
					x=true;
					break;
				}

			}	
			if(x==false)	
			{
				System.out.println("prime= "+i);
			}

		}


	}

	//20.string manipulation and sorting
	@Test(priority=1,enabled=false)
	public void SubstringAndsortStringArray() 
	{
		int n = 6;
		String str = "javalanguage"	;
		ArrayList<String>z=new ArrayList<String>();
		String x[]=new String[7];
		System.out.println("input= "+str);
		System.out.println("output will be- ");
		for(int i=0;i<str.length()-5;i++)
		{
			String b=str.substring(i,i+6);
			b=b.substring(0,1).toUpperCase()+b.substring(1).toLowerCase();
			z.add(b);
			System.out.println(b);
			x[i]=b;
		}

		Collections.sort(z);

		System.out.println("smallest number= "+z.get(0));
		System.out.println("biggest number= "+z.get(z.size()-1));

		// using array
		for(int i=0;i<str.length()-5;i++)
		{
			System.out.println(x[i]);
		}
		for(int i=0;i<x.length-1;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i].compareTo(x[j])>0) 
				{
					String temp=x[i];	
					x[i]=x[j];
					x[j]=temp;
				}

			}	

		}

		System.out.println("smallest number= "+x[0]);
		System.out.println("biggest number= "+x[x.length-1]);


	}

	//21.find iteration of sets
	@Test(enabled=false)
	public void set() 
	{
		Set<String> a=new HashSet<String>();
		a.add("abc");
		a.add("xyz");
		a.add("sss");
		for(String x: a)
		{
			System.out.println(x);
		}
		Map<String,String> gfg = new HashMap<String,String>();

		// enter name/url pair
		gfg.put("GFG", "geeksforgeeks.org");
		gfg.put("Practice", "practice.geeksforgeeks.org");
		gfg.put("Code", "code.geeksforgeeks.org");
		gfg.put("Quiz", "quiz.geeksforgeeks.org");

		// using keySet() for iteration over keys
		for (String name : gfg.keySet())
			System.out.println("key: " + name);

		// using values() for iteration over values
		for (String url : gfg.values())
			System.out.println("value: " + url);

	}	

	//22.find left rotate of array
	@Test(enabled=false)
	public void leftrotate() {  
		//Initialize array  
		int [] arr = new int [] {1, 2, 3, 4, 5};  
		//n determine the number of times an array should be rotated  
		int n = 3;  
		//Displays original array  
		System.out.println("Original array: ");  
		for (int i = 0; i < arr.length; i++) {  
			System.out.print(arr[i] + " ");  
		}  
		//Rotate the given array by n times toward left  
		for(int i = 0; i < n; i++){  
			int j, first;  
			//Stores the first element of the array  
			first = arr[0];  
			for(j = 0; j < arr.length-1; j++){  
				//Shift element of array by one  
				arr[j] = arr[j+1];  
			}  
			//First element of array will be added to the end  
			arr[j] = first;  
		}  
		System.out.println();  
		//Displays resulting array after rotation  
		System.out.println("Array after left rotation: ");  
		for(int i = 0; i< arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}  
	} 

	//23.find right rotate of array
	@Test(enabled=false)
	public void rightrotate() {  
		//Initialize array  
		int [] arr = new int [] {1, 2, 3, 4, 5};  
		//n determine the number of times an array should be rotated  
		int n = 3;  
		//Displays original array  
		System.out.println("Original array: ");  
		for (int i = 0; i < arr.length; i++) {  
			System.out.print(arr[i] + " ");  
		}  
		//Rotate the given array by n times toward left  
		for(int i = 0; i < n; i++){  
			int j, last;  
			//Stores the first element of the array  
			last = arr[arr.length-1];  
			for(j = arr.length-1; j >0; j--){  
				//Shift element of array by one  
				arr[j] = arr[j-1];  
			}  
			//First element of array will be added to the end  
			arr[0] = last;  
		}  
		System.out.println();  
		//Displays resulting array after rotation  
		System.out.println("Array after right rotation: ");  
		for(int i = 0; i< arr.length; i++){  
			System.out.print(arr[i] + " ");  
		}  
	} 

	//24.Reverse a String in Java Word by Word
	@Test(enabled=false)
	public void reverseWordByWord() 
	{
		String a="My name is ranit ray";
		String []b=a.split(" ");
		String rev="";
		for(int i=0;i<b.length;i++)
		{
			StringBuffer sb=new StringBuffer(b[i]);
			rev=rev+sb.reverse()+" ";
		}
		System.out.println("Reversed word by word: "+rev); 

	}

	//25.Reverse a String with incremental for loop
	@Test(enabled=false)
	public void reverse() 
	{
		String text="Ranit";
		String reverse=" ";
		int length= text.length();
		for(int i=0;i<length;i++)
		{
			reverse =reverse+text.charAt(length-1-i);
		} 
		System.out.println(reverse);
	}

	//26.Swap 2 strings without 3rd variable
	@Test(enabled=false)
	public void swapString()
	{
		String a="ranit";
		String b="ray";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

	//27.sort a array with TreeSet
	@Test(enabled=false)
	public void testing()
	{
		Set<String>c= new TreeSet<String>();
		String [] a= {"xbc","bcd","acd","yac"};
		for(int i=0;i<a.length;i++)
		{
			c.add(a[i]);
		}
		for(String d:c)
			System.out.println("d="+d);
	}

	//28.sort a array with in built sort
	@Test(enabled=false)
	public void sortarray()
	{
		String [] a= {"Jan", "Apr","aug"};
		Arrays.sort(a);
		for(String d:a)
			System.out.println(d);
	}	

	//29.every alternate character of string will be in uppercase
	@Test(enabled=false)
	public void stringManipulation1()
	{
		String str="my name is ranit ray";
		str=str.replaceAll(" ", "");
		String str2="";

		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0)
			{
				str2=str2+str.substring(i,i+1);
			}
			else
				str2=str2+str.substring(i,i+1).toUpperCase();
		}

		System.out.println(str2);
	}		

	//30.first and last character of string will be in uppercase
	@Test(enabled=false)
	public void stringManipulation2()
	{
		String str="ranit";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			if(i==0 ||i==str.length()-1 ||i==str.length()/2)
			{
				str2=str2+str.substring(i,i+1).toUpperCase();

			}
			else
				str2=str2+str.substring(i,i+1);

		}

		System.out.println(str2);
	}	

	//31.print only numbers
	@Test(enabled=false)
	public void stringManipulation3()
	{
		String str="ranit1234";
		String str2="";
		for(int i=0;i<str.length();i++)
		{
			char a=str.charAt(i);
			int b=a;
			if(b>=47 && b<=57)
			{
				str2=str2+a;
			}
		}
		System.out.println(str2);
	}	

	//32.convert string array to integer array
	@Test(enabled=false)
	public void stringManipulation4()
	{
		String str = "1 23 456 7890";
		String []b=str.split(" ");
		int []arr=new int[b.length];
		for(int i=0;i<b.length;i++)
		{
			arr[i]=Integer.parseInt(b[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}

	//33.convert string array to integer array
		@Test(enabled=false)
		public void stringManipulation5()
		{
			String str = "1 23 456 7890";
			String []b=str.split(" ");
			int []arr=new int[b.length];
			for(int i=0;i<b.length;i++)
			{
				arr[i]=Integer.parseInt(b[i]);
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}

		}

		//34.Java Program to Print all Unique Words of a String
				@Test(enabled=false)
				public void stringManipulation6()
				{
					String str = "Welcome to Geeks for Geeks";
					String []b=str.split(" ");
					for(int i=0;i<b.length;i++)
					{
						int count=1;
						for(int j=i+1;j<b.length;j++)
						{
							if(b[i].equals(b[j]) && b[i]!="0")
							{
							count++;
							b[j]="0";
							}
							
							
						}
						if(count==1 && b[i]!="0")
						{
							System.out.println(b[i]);
						}
					}
					
				}

				
				//35.Java Program to Swap Corner Words and Reverse Middle Characters of a String
				@Test(enabled=false)
				public void stringManipulation7()
				{
					String str = "Hello this is the GFG user";
					String c="";
					String []b=str.split(" ");
					for(int i=b.length-1;i>=0;i--)
					{
						StringBuffer sb=new StringBuffer(b[i]);
						if(i==b.length-1||i==0)
						{
						c=c+" "+sb;	
						}
						else
							c=c+" "+sb.reverse();
						
					}
					System.out.println(c);
				}	
				
				//36.Java Program to Remove a Given Word From a String
				@Test(enabled=false)
				public void stringManipulation8()
				{
					String str = "Hello this is the GFG user";
					String remove="this";
					String c="";
					String []b=str.split(" ");
					for(int i=0;i<b.length;i++)
					{
						if(!b[i].equals(remove))
						{
							c=c+" "+b[i];
						}
					}
					System.out.println(c.trim());
				}	
				
				//37.Java Program to Move All Uppercase Characters to the End
				@Test(enabled=false)
				public void stringManipulation9()
				{
					String b = "HeLlo";
					String c="";
					String e="";
					for(int i=0;i<b.length();i++)
					{
						char d=b.charAt(i);
						int a=d;
						if(a>=65 && a<=90)
						{
							c=c+d;
						}
						else
							e=e+d;
						
					}
					System.out.println(e+c);
				}
				
				//38.Java Program to Convert String to Byte Array Using getBytes() Method
				@Test(enabled=false)
				public void stringManipulation10()
				{
					// Initializing String
			        String ss = "Hello GeeksforGeeks";
			  
			        // Display the string before conversion
			        System.out.println("String: " + ss);
			  
			        // Converting string to byte array
			        // Using getBytes() method
			        byte[] res = ss.getBytes();
			  
			        System.out.println("Byte Array:");
			  
			        // Display the string after conversion
			        for (int i = 0; i < res.length; i++) {
			            System.out.print(res[i]);
			        }
				}
				
				//39.Java Program to Count Number of Digits in a String
				@Test(enabled=false)
				public void stringManipulation11()
				{
			        String s = "G e 1 2 e k s f o r G e e k 1234";
			        int count=0;
			        for (int i = 0; i < s.length(); i++) 
			        {
			        	char d=s.charAt(i);
						int a=d;
						if(a>=47 && a<=57)
						{
							count++;
						}
					}
			        
			        System.out.println("count= "+count);
				}
				
				//40.Java Program to Count Number of Digits in a String
				@Test(enabled=false)
				public void stringManipulation12()
				{
			        String s = "Wow madam is driving racecar";
			        int count=0;
			        for (int i = 0; i < s.length(); i++) 
			        {
			        	char d=s.charAt(i);
						int a=d;
						if(a>=47 && a<=57)
						{
							count++;
						}
					}
			        
			        System.out.println("count= "+count);
				}
				
				//41.Convert ArrayList to Comma Separated String in Java
				@Test(enabled=false)
				public void stringManipulation13()
				{
					ArrayList<String> geekcourses= new ArrayList<String>();
			        geekcourses.add("Data Structures");
			        geekcourses.add("Algorithms");
			        geekcourses.add("Operating System");
			        geekcourses.add("Computer Networks");
			        geekcourses.add("Machine Learning");
			        geekcourses.add("Databases");
			        String commaseparatedlist = geekcourses.toString();
			        System.out.println(commaseparatedlist);
			        commaseparatedlist
			            = commaseparatedlist.replace("[", "")
			                  .replace("]", "")
			                  .replace(" ", "");
			        System.out.println(commaseparatedlist);
			      
				}
				
				//42.Convert ArrayList to Comma Separated String in Java
				@Test(enabled=false)
				public void stringManipulation14()
				{
					System.out.println(45+5 + "=" +(45+5));
					System.out.println(45+5 + "=" +45+5);
				}	
				
				//43.How to Initialize and Compare Strings in Java?
				@Test(enabled=false)
				public void stringManipulation15()
				{
					String a="abc";
						a="cb";
					String b=new String("aa");
					b=a;
					System.out.println(b);
				}	
				
				//44.Remove all non-alphabetical characters of a String in Java
				@Test(enabled=false)
				public void stringManipulation16()
				{
					String str = "Hello, how are you  ?";
					str=str.trim();
					String delims = "\\W+"; // split any non word
			        String[] tokens = str.split(delims);
			        for (String item : tokens) {
			        	System.out.println(item + " ");
			        }
					
				}		
				
				//45.Replace a character at a specific index in a String in Java
				@Test(enabled=false)
				public void stringManipulation17()
				{
					String str = "Geeks Gor Geeks";
					int index=6;
					char x='F';
					str=str.substring(0,index)+x+str.substring(index+1);
					System.out.println(str);
				}
				
				//46.Program to convert List of Integer to List of String in Java
				@Test(enabled=false)
				public void stringManipulation18()
				{
					List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5);
					List<String> a =new ArrayList<String>();
					for(Integer b:listOfInteger)
						a.add(String.valueOf(b));
					System.out.println(a);
					
				}
				
				//47.Swapping Pairs of Characters in a String in Java
				@Test(enabled=false)
				public void stringManipulation19()
				{
					String a="Geeksf";
					String b="";
					int len=a.length();
					for(int i=0;i<len-1;i=i+2)
					{
						StringBuffer s=new StringBuffer(a.substring(i,i+2)); 
						System.out.println("s= "+s);
						b=b+s.reverse();
						
					}
					if(len%2!=0)
					{
						b=b+a.charAt(len-1);
					}
					System.out.println("b="+b);
				}
				
				//48.Convert Snake Case string to Camel Case in Java
				@Test(enabled=false)
				public void stringManipulation20()
				{
					String a="snake_case_to_camel_case";
					String []b=a.split("_");
					String rev="";
					int len=b.length;
					for(int i=0;i<len;i++)
					{
						rev=rev+b[i].substring(0,1).toUpperCase()+b[i].substring(1).toLowerCase();
					}
					System.out.println("rev="+rev);
				}
				
				//49.Java program to print Even length words in a String
				@Test(enabled=true)
				public void stringManipulation21()
				{
					String a="This is a java language";
					String []b=a.split(" ");
					int len=b.length;
					for(int i=0;i<len;i++)
					{
						if(b[i].length()%2==0)
						{
							System.out.println("even word="+b[i]);	
						}
							
					}
					
				}
				
				//50.convert array to string
				@Test(enabled=true)
				public void stringManipulation22()
				{
					String []a= {"ranit","ray","abc"};
					String b=Arrays.toString(a);
					System.out.println(b);
					b=b.replace("[", "").replace("]", "");
					System.out.println(b);
				}
				
				
				
				
}






