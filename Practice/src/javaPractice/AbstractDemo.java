package javaPractice;

public abstract class AbstractDemo {
	
	static String dataMember="Data Member";
	
	public AbstractDemo()
	{
		System.out.println("In Constructor of abstract class...");
	}
	
	abstract void absMethod();
	
	void nonAbsMethod()
	{
		System.out.println("In Non abstract Method....");
	}
	
	public static void main(String[] args) {
		System.out.println("In main method of abstract class...");
		System.out.println(dataMember);
	}
	
}
