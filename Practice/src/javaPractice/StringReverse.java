package javaPractice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		sc.close();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		System.out.println("Reverse string is "+rev);

	}

}
