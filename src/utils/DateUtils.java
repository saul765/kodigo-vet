package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {


    public static String dateFormated(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(date);
    }
}
