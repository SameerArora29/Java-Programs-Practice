import java.util.*;
public class Integer1 {
    public static void main(String args[]) {
          Integer i = new Integer(5);

        i.toString();
        Integer.toString(8);       // returns String object of arguement int

        int i2 = Integer.valueOf(9); //  Integer.ValueOf(String s)  basically for returning object present in both Integer and string 
        int i3 = Integer.parseInt("456"); // returns primitive int    parseInt(String s);

   System.out.println(i2);
   System.out.println(i3);
    }
}