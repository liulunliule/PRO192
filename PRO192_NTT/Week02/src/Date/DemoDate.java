
package Date;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DemoDate {

    public static void main(String[] args) {
        Date currrent = new Date();
        System.out.println("Today: " + currrent);
        SimpleDateFormat sformat = new SimpleDateFormat("dd/MM/yyyy");
        String today = sformat.format(currrent);
        System.out.println("Today after processing: " + today);
    }
}
