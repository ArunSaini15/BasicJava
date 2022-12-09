package in.co.practicre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date21 {

	public static void main(String[] args) throws ParseException{
		
		// given current date in java's format
		Date d = new Date();
		System.out.println(d);
		
		
		// given date in our format
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		String str = sdf.format(d);
		System.out.println(str);
		
		// parsec date in java's format
		String a = "13/11/22";
		System.out.println(a);
		
		Date d1 = sdf.parse(a);
		System.out.println(d1);
		
		
		
				
		
	}
}
