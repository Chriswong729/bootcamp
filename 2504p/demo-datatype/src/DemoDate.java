
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DemoDate {
  public static void main(String[] args) {
    // 2025 04 28
int year = 2025;
int month = 4;
int day = 28;

// store date value 
// ! LocalDate 
LocalDate ld1 = LocalDate.of(2025, 4, 28);
LocalDate ld2 = LocalDate.of(2025, 3, 30);
System.out.println(ld1.isAfter(ld2));
System.out.println(ld1.isBefore(ld2));
System.out.println(ld1.isEqual(ld2));

LocalDate newDate = ld1.plusDays(7);
System.out.println(newDate);

System.out.println(LocalDate.of(2024, 12, 20).plusMonths(2));


//LocalDate.of(2025, 1, 32); invalid value for dayof month
Month m1 = LocalDate.of(2025, 1, 2).getMonth();
System.out.println(m1.getValue());
System.out.println(m1.toString());
System.out.println(LocalDate.of(2025, 1, 2).getDayOfWeek());
LocalDateTime dateTime = LocalDateTime.of(2025, 11, 1, 23, 59);
System.out.println(dateTime.toString());














  }
}
