package TimeAndDate;
import java.text.*;
import java.util.*;

public class DateAndCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Date
		int n = 123400;
        System.out.println(n);
        System.out.println(Integer.toHexString(n));
        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(n));
        System.out.println("===========Date Time===========");
        Date date = new Date();
        System.out.println(date.getYear() + 1900);
        System.out.println(date.getMonth() + 1);
        System.out.println(date.getDate());
        
        System.out.println(date.toString());
        System.out.println(date.toGMTString());
        System.out.println(date.toLocaleString());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(date));
        
        SimpleDateFormat sdf2 = new SimpleDateFormat("E MMM dd 日, yyyy年");
        System.out.println(sdf2.format(date));
        
        //Calendar
        Calendar c = Calendar.getInstance();
        int y = c.get(Calendar.YEAR);
        int m = 1 + c.get(Calendar.MONTH);
        int d = c.get(Calendar.DAY_OF_MONTH);
        int w = c.get(Calendar.DAY_OF_WEEK);
        int hh = c.get(Calendar.HOUR_OF_DAY);
        int mm = c.get(Calendar.MINUTE);
        int ss = c.get(Calendar.SECOND);
        int ms = c.get(Calendar.MILLISECOND);
        System.out.println(y + "-" + m + "-" + d + " " + w + " " + hh + ":" +  mm + ":" + ss +"." + ms);
	    
        c.clear();
        c.set(Calendar.YEAR, 2019);
        c.set(Calendar.MONTH, 6);
        c.set(Calendar.DATE, 15);
        c.set(Calendar.HOUR_OF_DAY, 21);
        c.set(Calendar.MINUTE, 22);
        c.set(Calendar.SECOND, 23);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(c.getTime()));
        
        //TimeZone
        TimeZone tzDefault = TimeZone.getDefault();
        TimeZone tzGMT9 = TimeZone.getTimeZone("GMT+09:00");
        
        TimeZone tzNY = TimeZone.getTimeZone("America/New_York");
        String[] tz = TimeZone.getAvailableIDs();
        System.out.println(tzDefault.getID());
        System.out.println(tzGMT9.getID());
        System.out.println(tzNY.getID());
        System.out.println(tz);
        
        // Time switch among  different timezone
        Calendar c2 = Calendar.getInstance();
        c2.clear();
        c2.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        c2.set(2019, 10 /* 11 月 */ ,20,8,15,0);
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        System.out.println(sdf3.format(c2.getTime()));
        
        //Calendar operation
        Calendar c3 = Calendar.getInstance();
        c3.clear();
        c3.set(2019, 10 /* 11 月*/, 20,8,15,0);
        c3.add(Calendar.DAY_OF_MONTH,5);
        c3.add(Calendar.HOUR_OF_DAY, -2);
        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d2 = c3.getTime();
        System.out.println(sdf4.format(d2));
	} 

}
