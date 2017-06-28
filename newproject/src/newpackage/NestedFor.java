package newpackage;

public class NestedFor {

	public static void main(String[] args) {
		System.out.println("Hi");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
