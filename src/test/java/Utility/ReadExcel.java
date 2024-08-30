package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class ReadExcel {

		WebDriver driver;

		XSSFWorkbook wb;

		XSSFSheet s;

		public ReadExcel()  {

			try {

				FileInputStream fis = new FileInputStream(

						"C:\\Users\\STHABASS\\eclipse-workspace\\SauceLabsTestNG\\src\\test\\resources\\SauceInput.xlsx");

				wb = new XSSFWorkbook(fis);

			}catch(IOException e) {

				e.printStackTrace();

			}

			s = wb.getSheet("Sheet1");

			}

		public String getCellData(int rowno, int colno) {

			String data = null;

			data = s.getRow(rowno).getCell(colno).getStringCellValue();

			return data;

		}

		public double getCellDataNo(int rowno, int colno) {

			double data;

			data = s.getRow(rowno).getCell(colno).getNumericCellValue();

			return data;

		}
}
