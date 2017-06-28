package javaPractice;

public class ClassImplementingAbstractDemo extends AbstractDemo {

	public static void main(String[] args) {
		AbstractDemo obj=new ClassImplementingAbstractDemo();
		obj.absMethod();
		obj.nonAbsMethod();
		System.out.println(dataMember);

	}

	@Override
	void absMethod() {
		System.out.println("In abstract method...");
		
	}

}
