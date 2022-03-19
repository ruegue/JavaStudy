package ch10;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CalendarEx1 {

	public static void main(String[] args) throws ParseException {
		String data = "Name: ¿Ã¿⁄πŸ Tel: 02-123-1234 Age27 Birthday 07-09";
		
		String pattern = "Name: {0} Tel:{1} Age{2} Birthday{3}";
		
		MessageFormat mf = new MessageFormat(pattern);
		
		Object[] objs = mf.parse(data);
		
		for(int i=0; i<objs.length; i++) {
			System.out.print(objs[i]+",");
		}
	}
}

