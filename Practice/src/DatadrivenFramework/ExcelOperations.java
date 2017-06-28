package DatadrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperations {

	public static void main(String[] args) throws IOException {
		
		
//		try {
			String xlin="C:\\SeleniumWorkspace\\Practice\\src\\TestData\\TestData_EmpReg.xlsx";
			FileInputStream fi;
			fi = new FileInputStream(xlin);


			XSSFWorkbook wb=new XSSFWorkbook(fi);
			XSSFSheet ws=wb.getSheet("EmpReg");
			XSSFRow r=ws.getRow(2);
			XSSFCell c=r.getCell(1);
			System.out.println(c.getStringCellValue());
			wb.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
