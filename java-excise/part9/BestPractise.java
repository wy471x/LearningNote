package TimeAndDate;
import java.time.*;
import java.time.format.FormatStyle;
import java.util.*;

public class BestPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// old API to new API
		// Date -> Instant
		Instant ins1 = new Date().toInstant();
		System.out.println(ins1);
		
		//Calendar -> Instant -> ZonedDateTime
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.getTime());
		Instant ins2 = Calendar.getInstance().toInstant();
		System.out.println(ins2);
		ZonedDateTime zdt = ins2.atZone(calendar.getTimeZone().toZoneId());
		System.out.println(zdt);
		
		//new API to  old API
		//zonedDateTime -> long
		ZonedDateTime zdt2 = ZonedDateTime.now();
		long ts = zdt2.toEpochSecond() * 1000;
		System.out.println(ts);
		
		//long -> Date
		Date date = new Date(ts);
		System.out.println(date);
		
		//long -> Calendar
		Calendar calendar2  = Calendar.getInstance();
		calendar2.clear();
		calendar2.setTimeZone(TimeZone.getTimeZone(zdt2.getZone().getId()));
		calendar2.setTimeInMillis(zdt.toEpochSecond() * 1000);
		System.out.println(calendar.getTime());
		
		
		// 
		long ts2 = 1574208900000L;
		System.out.println(timestampToString(ts2,Locale.CHINA,"Asia/Shanghai"));
		System.out.println(timestampToString(ts2,Locale.US,"America/New_York"));
		
	}
	static String timestampToString(long epochMilli,Locale lo,
			String zoneId) {
		Instant ins = Instant.ofEpochMilli(epochMilli);
		DateTimeFormatter f = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.SHORT);
	}

}
