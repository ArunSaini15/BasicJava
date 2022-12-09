package in.co.practicre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) throws ParseException {
		
		//Gives current date in java's format
		Date d = new Date();
		System.out.println(d);
		
		
		//date formating in our format
		SimpleDateFormat sdf=new SimpleDateFormat("mm/dd/yy");
		String str = sdf.format(d);
		System.out.println(str);

		//Parsing date into java's format
		
		String a = "12/11/22";
		System.out.println(a);
		
		Date d1 = sdf.parse(a);
		System.out.println(d1);
		
		
		
		
		
		
		
	}


	

}
