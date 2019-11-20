package TimeAndDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.*;

public class LocalDateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LocalDate d = LocalDate.now();
        LocalTime t = LocalTime.now();
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(d);
        System.out.println(t);
        System.out.println(dt);
        
        LocalDate d2 = dt.toLocalDate();
        LocalTime t2 = dt.toLocalTime();
        System.out.println(d2);
        System.out.println(t2);
        System.out.println(dt);
        
        //Appoint date and time
        LocalDate d3 = LocalDate.of(2019, 11, 30);
        LocalTime t3 = LocalTime.of(15,16,17);
        LocalDateTime dt2 = LocalDateTime.of(2019,11,30,15,16,17);
        LocalDateTime dt3 = LocalDateTime.of(d3, t3);
        System.out.println(dt2.toString());
        System.out.println(dt3.toString());
        
        //DateTimeFormatter
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));
        
        LocalDateTime dt4 = LocalDateTime.parse("2019/11/30 15:16:17",dtf);
        System.out.println(dt4);
        
        //Date and time operation eg. plus minus 
        LocalDateTime dt5 = LocalDateTime.of(2019, 10,26,20,30,59);
        System.out.println(dt5);
        LocalDateTime dt6 = dt5.plusDays(5).minusHours(3);
        System.out.println(dt6);
        
        LocalDateTime dt7 = dt6.minusMonths(1);
        System.out.println(dt7);
        
        LocalDateTime dt8 = LocalDateTime.of(2019, 10,26,20,30,59);
        System.out.println(dt8);
        LocalDateTime dt9 = dt8.withDayOfMonth(31);
        System.out.println(dt9);
        LocalDateTime dt10 = dt9.withMonth(9);
        System.out.println(dt10);
        
        LocalDateTime firstDay = LocalDate.now().withDayOfMonth(1).atStartOfDay();
        System.out.println(firstDay);
        LocalDate lastDay = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
	    System.out.println(lastDay);
	    
	    LocalDate firstWeekday = LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
	    System.out.println(firstWeekday);
	    
	    //isBefore and isAfter
	    LocalDateTime now = LocalDateTime.now();
	    LocalDateTime target = LocalDateTime.of(2019, 11,19,8,15,0);
	    System.out.println(now.isBefore(target));
	    System.out.println(LocalDate.now().isBefore(LocalDate.of(2019, 11, 19)));
	    System.out.println(LocalTime.now().isAfter(LocalTime.parse("08:15:00")));
	    
	    //Duration(time distance) and Period (date distance)
	    LocalDateTime start = LocalDateTime.of(2019, 11,19,8,15,0);
	    LocalDateTime end = LocalDateTime.of(2020, 1,9,19,25,30);
	    Duration d4 = Duration.between(start, end);
	    System.out.println(d4);
	    Period p = LocalDate.of(2019, 11, 19).until(LocalDate.of(2020, 1, 9));
	    System.out.println(p);
	    
	    
	} 

}
