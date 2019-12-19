import javax.crypto.spec.PSource;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class LocalDateLesson {

    public static void main(String[] args) {

        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.MONTH, 2);

        System.out.println(calendar.getTime());

        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusDays(2);
        System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(formatter));
        LocalDate localDate1 = LocalDate.parse("18/04/1856", formatter);
        System.out.println(localDate1);



    }

}
