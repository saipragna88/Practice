package DatadrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ModularFramework.OrgMaster;

public class ExcelOps {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("C:\\SeleniumWorkspace\\Practice\\src\\TestData\\TestData_EmpReg.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("EmpReg");
//		XSSFRow r=ws.getRow(2);
//		XSSFCell c=r.getCell(0);
//		System.out.println(c.getStringCellValue());
//		System.out.println("number of rows ="+ws.getLastRowNum());
		
		int rowCount=ws.getLastRowNum();
		CellStyle style=wb.createCellStyle();
//		Font font=wb.createFont();
		
		
		OrgMaster om=new OrgMaster();
		om.Launch();
		om.Login("Admin", "admin");
		
		for(int i=1;i<=rowCount;i++)
		{
			XSSFRow r=ws.getRow(i);
			String fname=r.getCell(0).getStringCellValue();
			String lname=r.getCell(1).getStringCellValue();
			
			String result=om.EmployeeRegistration(fname, lname);
			XSSFCell resultCell=r.createCell(2);
			resultCell.setCellValue(result);
			
			if(result.equalsIgnoreCase("pass"))
			{
//				font.setColor(IndexedColors.GREEN.getIndex());
				style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
			}
			else
			{
//				font.setColor(IndexedColors.RED.getIndex());
				style.setFillForegroundColor(IndexedColors.RED.getIndex());
			}
//			style.setFont(font);
			style.setFillPattern(CellStyle.SOLID_FOREGROUND);
			resultCell.setCellStyle(style);
			
		}
		om.Logout();
		om.Close();
		FileOutputStream fo=new FileOutputStream("C:\\SeleniumWorkspace\\Practice\\src\\results\\TestResult_BGColor_EmpReg.xlsx");
		wb.write(fo);
		wb.close();
		
		
	}

}
