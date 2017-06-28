package javaPractice;

public class Overloading {
	
	public void sum(int a, int b)
	{
		System.out.println(a+"+"+b+"="+(a+b));
	}

	public void sum(int a, int b, int c)
	{
		System.out.println(a+"+"+b+"+"+c+"="+(a+b+c));
	}
	public static void main(String[] args) {
		Overloading obj=new Overloading();
		obj.sum(2, 3);
		obj.sum(2, 3,4);
		

	}

}
