package javaPractice;

public class InheritanceDemo extends Overloading{

	public void multiply(int a, int b)
	{
		System.out.println(a+"*"+b+"="+(a*b));
	}
	public static void main(String[] args) {
		System.out.println("child obj");
		InheritanceDemo iobj=new InheritanceDemo();
		iobj.sum(20, 30);
		iobj.sum(20, 30, 40);
		iobj.multiply(20, 30);
		
		System.out.println("parent obj");
		Overloading obj=new Overloading();
		obj.sum(2, 3);
		obj.sum(2, 3, 4);
	}

}
