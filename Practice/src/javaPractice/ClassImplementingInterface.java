package javaPractice;

public class ClassImplementingInterface implements InterfaceDemo {

	public void method1() {
		System.out.println("In method1...");

	}

	public void method2() {
		System.out.println("In method2...");

	}
	
	public void method3()
	{
		System.out.println("In method3...");
	}

	public static void main(String[] args) {
		ClassImplementingInterface obj=new ClassImplementingInterface();
		obj.method1();
		obj.method2();
		obj.method3();
		
		InterfaceDemo obj1=new ClassImplementingInterface();
		obj1.method1();
		obj1.method2();
		
	}

}
