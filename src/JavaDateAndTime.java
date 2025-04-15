import java.time.DayOfWeek;
import java.time.LocalDate;

public class JavaDateAndTime {

    public static void main(String[] args) {


        System.out.println(findDay(8, 5, 2015));
    }

    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().toString();
    }

}
