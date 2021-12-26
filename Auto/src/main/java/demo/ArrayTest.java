package demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.testng.annotations.Test;

public class ArrayTest 
{

	@Test
	public void test() throws IOException
	{
		System.out.println("Enter the file name : ");
		Scanner sc =new Scanner(System.in);
        String a= sc.nextLine();
        FileOutputStream fos=new FileOutputStream(new File("C:\\demo\\"+a+".txt"));
        System.out.print("Enter file content: "); 
        String b= sc.nextLine();
        byte[] c=b.getBytes();
		fos.write(c);
        fos.close();
   }


}
