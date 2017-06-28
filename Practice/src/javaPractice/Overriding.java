package javaPractice;

public class Overriding extends Overloading {
	public void sum(int a, int b)
	{
		System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
	}
	public static void main(String[] args) {
		System.out.println("parent obj with overrided method");
		Overriding robj=new Overriding();
		robj.sum(2, 3);
		robj.sum(2, 3, 4);
		System.out.println("child obj");
		Overloading obj=new Overloading();
		obj.sum(2, 3);
		obj.sum(2, 3, 4);
	}
}
