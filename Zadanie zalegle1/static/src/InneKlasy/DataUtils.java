package InneKlasy;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DataUtils {


    public static long obliczRozniceWMiesiacach(LocalDate data1, LocalDate data2) {
        return ChronoUnit.MONTHS.between(data1, data2);
    }


    public static long obliczRozniceWDniach(LocalDate data1, LocalDate data2) {
        return ChronoUnit.DAYS.between(data1, data2);
    }


    public static LocalDate obliczDatePoInterwale(LocalDate data, int dni) {
        return data.plusDays(dni);
    }
}

