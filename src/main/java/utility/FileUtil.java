package utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileUtil {

	
	public String excelmethod(int sheetind, int rowind, int colind) {
		String inputpath = System.getProperty("user.dir") + "/Book1.xlsx";
		String data = null;
		
		try {
			
			FileInputStream instream = new FileInputStream(inputpath);
			
			XSSFWorkbook book = new XSSFWorkbook(instream);
			
			XSSFSheet sheet = book.getSheetAt(sheetind);
			
			
			//Cell cell = sheet.getRow(2).getCell(3);
			
			Row row = sheet.getRow(rowind);
			Cell cell = row.getCell(colind);		
			
			
			
			DataFormatter format = new DataFormatter();
			data = format.formatCellValue(cell);
			
			
			
			//System.out.println(cell);
			//System.out.println(data);
			
			
			//System.out.println(sheet.getLastRowNum());
			
			
			book.close();
			instream.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	
	
	public String readProperty(String key) {

		String value = null;
		
		try {

			FileInputStream fin = new FileInputStream(
					"C:\\Users\\VINOTH\\eclipse-workspace\\MyProject1\\src\\test\\resources\\config.properties");
			Properties prop = new Properties();

			prop.load(fin);

			//String key = "browser";

			value = prop.getProperty(key);
			//System.out.println(value);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return value;

	}

}
