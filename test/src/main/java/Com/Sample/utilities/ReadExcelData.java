package Com.Sample.utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {
	public String readingData(int row_num, int cell_num) throws Exception {
        File file = new File(System.getProperty ("user.dir")+"\\Testdata\\Excellogin.xlsx");
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        String value = sheet.getRow(row_num).getCell(cell_num).getStringCellValue();
        return value;
    
}
}