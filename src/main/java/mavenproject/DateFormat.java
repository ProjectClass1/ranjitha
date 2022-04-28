package mavenproject;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMMM-yy");
		String format = dateFormat.format(date);
		System.out.println(format);
		
	}

}
