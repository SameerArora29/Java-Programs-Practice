import java.util.*;
import java.io.*;
public class Calendarclass {
    public static void main(String args[]) {
     
        Calendar c = Calendar.getInstance();
		System.out.println(c.getCalendarType());

        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.getActualMinimum(Calendar.DAY_OF_MONTH));
        System.out.println(c.getGreatestMinimum(Calendar.DAY_OF_MONTH));
         System.out.println(c.get(Calendar.MONTH));	
        // c.set(Calendar.MONTH, 6);
        // System.out.println(c.get(Calendar.MONTH));	

    }
}

