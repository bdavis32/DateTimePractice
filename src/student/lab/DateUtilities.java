package student.lab;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Benjamin
 */
public class DateUtilities {
    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ssa");
        //Converting Date objects to Strings
        Date now = new Date();
        String date = sdf.format(now);
        System.out.println(date);
        Calendar now2 = Calendar.getInstance();
        Date calDate = now2.getTime();
        System.out.println(calDate.toString());
        //////////////////////////////////
        System.out.println("---------------------"); //separator
        //Converting Strings to Date objects
        String date2 = "04/14/2017";
        Date dateFromString = new SimpleDateFormat("MM/dd/yyyy").parse(date2);
        System.out.println(dateFromString);
        //////////////////////////////////
        System.out.println("---------------------");
        //Date arithmetic
        LocalDateTime now3 = LocalDateTime.now();
        LocalDateTime dueDate = now3.plusDays(60);
        System.out.println("This assignment is due on " + dueDate + "\n");
        LocalDateTime now4 = LocalDateTime.now();
        LocalDateTime fifteenMinutesFromNow = now4.plusMinutes(15);
        System.out.println("Time after fifteen minutes: " + fifteenMinutesFromNow);
    }
}
