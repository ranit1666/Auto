package Streams;

import org.testng.annotations.Test;

import java.util.*;
import java.util.stream.Collectors;

public class Streams1 
{
	            //1.Number Greater Than 5
	
   // @Test
	public void NumberGreaterThan5()
	{
    List<Integer>a=new ArrayList<Integer>();
	a.add(5);
	a.add(4);
	a.add(3);
	a.add(10);
	a.add(8);
	
	List<Integer>b=a.stream().filter(i->i>5).collect(Collectors.toList());
	System.out.println("The numbers greater than 5 are- "+b);
	}
	
	            //2.Odd Numbers
	
   // @Test
   	public void OddNumbers()
   	{
       List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(10);
   	a.add(8);
   	
   	List<Integer>b=a.stream().filter(i->i%2!=0).collect(Collectors.toList());
   	System.out.println("The odd numbers are- "+b);
   	}
   	
   	            //3.find Average Of Numbers
    
   // @Test
   	public void findAverageOfNumbers()
   	{
       List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(10);
   	a.add(8);
   	
   	OptionalDouble b=a.stream().mapToInt(x->x.intValue()).average();
   	System.out.println("The average number is- "+b);
   	}
   	
   	             //4.find Sum Of Numbers
    
   // @Test
   	public void findSumOfNumbers()
   	{
    List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(10);
   	a.add(8);
   	int b=a.stream().mapToInt(x->x.intValue()).sum();
   	System.out.println("The sum is- "+b);
   	}
    
   	             // 5.find Even Numbers, then get there squares and then get their sum
   	
   // @Test
   	public void findSumOfEvenSquareNumbers()
   	{
    List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(10);
   	a.add(8);
   	 int b= a.stream().filter(i->i%2==0).mapToInt(i->i*i).sum();
   	System.out.println("The sum Of Even Square Numbers are- "+b);
   	}
    
                 // 6.find max number from list
   	
   // @Test
   	public void findMaxNumber()
   	{
    List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(10);
   	a.add(8);
   	 OptionalInt b= a.stream().mapToInt(i->i).max();
   	System.out.println("The max number is - "+b.getAsInt());
   	}
    
                 // 7.find list in ascending order
   	
  //  @Test
   	public void findAscendingSortedList()
   	{
    List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(10);
   	a.add(8);
   	 List<Integer> b= a.stream().sorted().collect(Collectors.toList());
   	System.out.println("The sorted list in ascending order - "+b);
   	}
    
                 // 8.find list in descending order
   	
  // @Test
   	public void findDecendingSortedList()
   	{
    List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(10);
   	a.add(8);
   	 List<Integer> b= a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
   	System.out.println("The sorted list in descending order - "+b);
   	}
    
                 // 9.find the first element from the list
   	
   // @Test
   	public void findFirstElement()
   	{
    List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(10);
   	a.add(8);
   	 Optional<Integer> b= a.stream().reduce((x,y)->x); // if you want last element then write .reduce((x,y)->y)
   	System.out.println("The first element is - "+b.get());
   	}
    
    
// 10.find the duplicate element from the list
   	
   // @Test
   	public void findDuplicate()
   	{
    List<Integer>a=new ArrayList<Integer>();
   	a.add(5);
   	a.add(4);
   	a.add(3);
   	a.add(4);
   	a.add(5);
   	Set<Integer> items = new HashSet<Integer>();
   	
   	 List<Integer> b= a.stream().filter(i->!items.add(i)).collect(Collectors.toList()); 
   	System.out.println("The duplicate element is - "+b);
   	}
    
// 11.Search and find the element from the string
   	
    @Test
   	public void findElement()
   	{
    List<String>a=new ArrayList<String>();
   	a.add("thisistesting");
   
   	
   	 long b= a.stream().filter(i->i=="e").count(); 
   	System.out.println("The no of time particular element is present is - "+b);
   	}
    
    
    
    
	
}
