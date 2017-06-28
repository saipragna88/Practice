package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import OrangeHRM.OrangeMethods;

public class ExcelOperationsEg {

	public static void main(String[] args) throws IOException {
		
		String xlpath="C:\\SeleniumWorkspace\\WebDriver\\src\\TestData\\TestData.xlsx";
		String xlout="C:\\SeleniumWorkspace\\WebDriver\\src\\results\\EmpRegFontColorResults.xlsx";
		
		FileInputStream fi=new FileInputStream(xlpath);
		
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmployeeRegistration");
		CellStyle style=wb.createCellStyle();
		Font font=wb.createFont();
//		XSSFRow r=ws.getRow(5);
//		XSSFCell c=r.getCell(0);
//		
//		System.out.println(c.getStringCellValue());
		
		OrangeMethods o=new OrangeMethods();
		o.Launch("http://opensource.demo.orangehrmlive.com/");
		o.Login("Admin", "admin");
		int rowcount=ws.getLastRowNum();
		
		for(int i=1;i<=rowcount;i++)
		{
			XSSFRow r=ws.getRow(i);
			XSSFCell fName=r.getCell(0);
			XSSFCell lName=r.getCell(1);
			XSSFCell result=r.createCell(2);
			System.out.println(fName+" "+lName);
			String res=o.EmployeeRegistration(fName.getStringCellValue(), lName.getStringCellValue());
			result.setCellValue(res);
//			Applying background color
//			if(res.equalsIgnoreCase("pass"))
//			{
//				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//				
//			}
//			else
//			{
//				style.setFillForegroundColor(IndexedColors.RED.getIndex());
//				style.setFillPattern(CellStyle.SOLID_FOREGROUND);
//				
//			}
			
//			Applying font
			if(res.equalsIgnoreCase("pass"))
			{
				font.setColor(IndexedColors.GREEN.getIndex());
				
			}
			else
			{
				font.setColor(IndexedColors.RED.getIndex());
				
			}
			style.setFont(font);
			result.setCellStyle(style);
		}
		
		FileOutputStream fo=new FileOutputStream(xlout);
		wb.write(fo);
		wb.close();
		
		o.Logout();
		o.Close();
		

	}

}
