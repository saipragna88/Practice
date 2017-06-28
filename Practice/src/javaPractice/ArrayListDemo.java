package javaPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("selenium");
		al.add("uft");
		al.add("uft");
		al.add("manual");
		al.add("manual");
		System.out.println("Enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		al.add(s);
		sc.close();
		al.add(1, "java");
		for (String str : al) {
			System.out.println(str);
		}
		System.out.println("size of arraylist is "+al.size());

	}

}
