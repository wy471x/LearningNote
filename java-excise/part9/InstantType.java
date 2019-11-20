package TimeAndDate;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Instant now = Instant.now();
        System.out.println(now.getEpochSecond());
        System.out.println(now.toEpochMilli());
        
        Instant ins = Instant.ofEpochSecond(1574243614);
        ZonedDateTime zdt = ins.atZone(ZoneId.systemDefault());
        System.out.println(zdt);
	}

}
