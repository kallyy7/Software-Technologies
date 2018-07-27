import java.text.ParseException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class CountWorkingDays {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate firstDate = LocalDate.from(format.parse(scan.nextLine()));
        LocalDate secondDate = LocalDate.from(format.parse(scan.nextLine()));
        LocalDate[] holidays = getHolidays();
        int count = 0;

        for (LocalDate i = firstDate; i.isBefore(secondDate.plusDays(1)); i = i.plusDays(1)) {

            boolean isWeekend = i.getDayOfWeek().equals(DayOfWeek.SATURDAY) || i.getDayOfWeek().equals(DayOfWeek.SUNDAY);
            boolean isHoliday = Arrays.asList(holidays).contains(LocalDate.of(2016, i.getMonth(), i.getDayOfMonth()));
            boolean isWorkingDay = !isWeekend && !isHoliday;
            if (isWorkingDay) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static LocalDate[] getHolidays(){
        LocalDate[] holidays = new LocalDate[] {
                LocalDate.of(2016, 1, 1),
                LocalDate.of(2016, 3, 3),
                LocalDate.of(2016, 5, 1),
                LocalDate.of(2016, 5, 6),
                LocalDate.of(2016, 5, 24),
                LocalDate.of(2016, 9, 6),
                LocalDate.of(2016, 9, 22),
                LocalDate.of(2016, 11, 1),
                LocalDate.of(2016, 12, 24),
                LocalDate.of(2016, 12, 25),
                LocalDate.of(2016, 12, 26)
        };

        return holidays;
    }
}