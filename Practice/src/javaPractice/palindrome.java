package javaPractice;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		sc.close();
		int rem=0;
		int palindrome=0;
		while(number>0)
		{
			rem=number%10;
			number=number/10;
			palindrome=palindrome*10+rem;
		}
		System.out.println("Palindrome for number is "+palindrome);
	}

}
