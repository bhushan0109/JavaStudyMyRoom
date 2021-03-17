package string_method;

import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

import Instance1.Instance;

public class ExicutionTimeCal {
public static void  diplay() {
	System.out.println("hello dear");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long t1 = System.nanoTime();
		diplay();
		long t2= System.nanoTime();
		System.out.println((t2-t1));
		
		Date date = new Date();
		System.out.println("-----------");
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
			      System.out.println(ft.toString());
					System.out.println("-----------");

	      // display time and date using toString()
	      System.out.println(date.toString());
	  //String a=    new now();
	      System.out.println(new Date( ));
	      System.out.println(java.time.LocalTime.now());
	      //Timestamp b=Timestamp.from(Instant.now());
	     // Timestamp timestamp = Timestamp.from(instant);

	}

}
