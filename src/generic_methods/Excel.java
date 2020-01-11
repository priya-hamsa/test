package generic_methods;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel implements Framework_Constants{

	public static String getData(String sheet, int row, int cell) {
		String v="";
		try {
			FileInputStream fis = new FileInputStream(EXCEL);
			Workbook wb = new WorkbookFactory().create(fis);
			Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			 v = c.toString();

		} catch (Exception e) {

		}
		return v;

	}

}
