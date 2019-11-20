package TimeAndDate;
import java.time.*;
public class ZonedDateTimeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ZonedDateTime zbj = ZonedDateTime.now();
        ZonedDateTime zny = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime zld = ZonedDateTime.now(ZoneId.of("Europe/London"));
        System.out.println(zbj);
        System.out.println(zny);
        System.out.println(zld);
        
        //time zone switch
        ZonedDateTime zbj2 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zny2 = zbj2.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj2);
        System.out.println(zny2);
        
        ZonedDateTime zbj3 = ZonedDateTime.of(2019, 9, 15, 21, 5, 0, 0,ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zny3 = zbj3.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj3);
        System.out.println(zny3);
        
        ZonedDateTime zbj4 = ZonedDateTime.of(2019, 11, 15, 21, 5, 0, 0,ZoneId.of("Asia/Shanghai"));
        ZonedDateTime zny4 = zbj4.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println(zbj4);
        System.out.println(zny4);
        
        ZonedDateTime zny5 = ZonedDateTime.of(2019, 11, 15, 21, 5, 0, 0,ZoneId.of("Asia/Shanghai"));
        LocalDateTime ldt = zny5.toLocalDateTime();	
        System.out.println(ldt);
        
        //excise
        LocalDateTime departureAtBeijing = LocalDateTime.of(2019, 9, 15, 13, 0, 0);
        int hours = 13;
        int minutes = 20;
        LocalDateTime arrivalAtNewYork = calculateArrivalAtNY(departureAtBeijing, hours, minutes);
        System.out.println(departureAtBeijing + " -> " + arrivalAtNewYork);
        // test:
        if (!LocalDateTime.of(2019, 10, 15, 14, 20, 0)
                .equals(calculateArrivalAtNY(LocalDateTime.of(2019, 10, 15, 13, 0, 0), 13, 20))) {
            System.err.println("≤‚ ‘ ß∞‹!");
        } else if (!LocalDateTime.of(2019, 11, 15, 13, 20, 0)
                .equals(calculateArrivalAtNY(LocalDateTime.of(2019, 11, 15, 13, 0, 0), 13, 20))) {
            System.err.println("≤‚ ‘ ß∞‹!");
        }
        System.out.println("≤‚ ‘≥…π¶");
	}
	static LocalDateTime calculateArrivalAtNY(LocalDateTime bj,int h,int m) {
		   LocalDateTime arrivalTime = bj.plusHours(h).plusMinutes(m);
	       ZonedDateTime zbj = arrivalTime.atZone(ZoneId.of("Asia/Shanghai"));
	       ZonedDateTime zny = zbj.withZoneSameInstant(ZoneId.of("America/New_York"));
		   return zny.toLocalDateTime();
	}

}
