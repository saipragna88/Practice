package KeywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import OrangeHRM.OrangeMethods;


public class KeywordDriven
{
	@Test
	public void test() throws IOException
	{
		OrangeMethods om=new OrangeMethods();
		
		String xlpath="C:\\SeleniumWorkspace\\WebDriver\\src\\TestData\\Keyword.xlsx";
		String xlout="C:\\SeleniumWorkspace\\WebDriver\\src\\results\\Keywordtestresults.xlsx";
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws_tc=wb.getSheet("TestCase");
		XSSFSheet ws_ts=wb.getSheet("TestSteps");
		
		int rc_tc=ws_tc.getLastRowNum();
		int rc_ts=ws_ts.getLastRowNum();
		
		String res=null;
		for(int i=1;i<=rc_tc;i++)
		{
			ws_tc.getRow(i).createCell(3);
			String exe=ws_tc.getRow(i).getCell(2).getStringCellValue();
			if(exe.equalsIgnoreCase("y"))
			{
				String tcID=ws_tc.getRow(i).getCell(0).getStringCellValue();
				for(int j=1;j<=rc_ts;j++)
				{
					String tstcID=ws_ts.getRow(j).getCell(0).getStringCellValue();
					if(tstcID.equalsIgnoreCase(tcID))
					{
						String keyword=ws_ts.getRow(j).getCell(3).getStringCellValue();
						System.out.println(keyword);
						
						switch (keyword) {
						case "Launch":
							res=om.Launch("http://opensource.demo.orangehrmlive.com");
							break;
							
						case "Login":
							res=om.Login("Admin", "admin");
							break;
							
						case "EmpReg":
							res=om.EmployeeRegistration("Srinu", "M");
							break;
							
						case "UserReg":
							res=om.UserRegistration("Srinu M", "SrinuM123", "SrinuM123", "SrinuM123");
							break;
							
						case "UserLogin":
							res=om.Login("SrinuM123", "SrinuM123");
							break;
							
						case "Logout":
							res=om.Logout();
							om.Close();
							break;

						default:
							System.out.println("Select a proper keyword");
							break;
						}
						if(res.equalsIgnoreCase("fail"))
						{
							//result updation in test steps sheet
							ws_ts.getRow(j).createCell(4).setCellValue(res);
							ws_tc.getRow(i).getCell(3).setCellValue(res);
							break;
							
						}
						else
						{	
							ws_ts.getRow(j).createCell(4).setCellValue(res);
							ws_tc.getRow(i).getCell(3).setCellValue(res);
							continue;
							
						}
						
						
						
						
					}
				}
			}
			else
			{
				ws_tc.getRow(i).createCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
	}

}
