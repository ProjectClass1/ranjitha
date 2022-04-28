package facebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.invoke.SwitchPoint;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.collections4.functors.SwitchClosure;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AutomationData {
	public static void main(String[] args) throws IOException {

		File file = new File(
				"C:\\Users\\PriyaVenkatesan\\eclipse-workspace\\Login\\target\\excel\\Automation data.xlsx");
		FileInputStream fileInputStream = new FileInputStream(file);

		Workbook workbook = new XSSFWorkbook(fileInputStream);
		Sheet sheet = workbook.getSheet("Label data");

		for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				CellType type = cell.getCellType();
				// System.out.println(type);
				switch (type) {
				case STRING:
					String text = cell.getStringCellValue();
					System.out.println(text);

					break;
				case NUMERIC:
					if (DateUtil.isCellDateFormatted(cell)) {
						Date date = cell.getDateCellValue();
						SimpleDateFormat da = new SimpleDateFormat("dd-MMMM-yyyy");
						String ra = da.format(date);
						System.out.println(ra);

					} else {
						double d = cell.getNumericCellValue();
						BigDecimal b = BigDecimal.valueOf(d);
						String num = b.toString();
						System.out.println(num);

					}

				default:
					break;
				}

			}

			System.out.println("*************************");
		}

	}

}
