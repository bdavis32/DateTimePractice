package practice;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Benjamin
 */
public class Demo1 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy hh:mm:ssa");
        Date now = new Date();
        String date = sdf.format(now);
        System.out.println(date);
        
        Calendar now2 = Calendar.getInstance();
        Date calDate = now2.getTime();
        System.out.println(now2.toString());
    }
}
