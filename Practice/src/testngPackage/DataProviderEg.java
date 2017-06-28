package testngPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEg {
	
	@Test(dataProvider="getData")
	public void Details(String c1, String c2)
	{
		System.out.println(c1+"---"+c2);
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		data[0][0]="aaa";
		data[0][1]="AAA";
				
		data[1][0]="bbb";
		data[1][1]="BBB";
		data[2][0]="ccc";
		data[2][1]="CCC";
		return data;
	}

}
