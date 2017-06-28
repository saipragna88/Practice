package newpackage;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


//import java.util.Scanner;

public class EmployeeList {

	public static void main(String[] args)
	{
		
		//Scanner sc=new Scanner(System.in);
		//char x=sc.next().charAt(0);
		//System.out.println(x);
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		Set<Object> hash=new HashSet<Object>();
		hash.add("a");
		hash.add("b");
		hash.add(5000);
		hash.add("c");
		hash.add(true);
		hash.add("pragna");
		hash.add("ghytrrrt");
		
		Iterator<Object> it=hash.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
}
