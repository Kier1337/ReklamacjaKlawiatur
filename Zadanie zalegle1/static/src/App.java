import java.time.LocalDate;
import InneKlasy.DataUtils;

public class App {
    public static void main(String[] args) {


        LocalDate data1 = LocalDate.of(2019, 5, 12);
        LocalDate data2 = LocalDate.of(2019, 5, 22);


        System.out.println("Różnica w dniach: " + DataUtils.obliczRozniceWDniach(data1, data2));


        System.out.println("Różnica w miesiącach: " + DataUtils.obliczRozniceWMiesiacach(data1, data2));


        System.out.println("Data po interwale: " + DataUtils.obliczDatePoInterwale(data1, 10));


        Sklep sklep = new Sklep("ul. Geralta 8", 58, true, 1200);
        System.out.println(sklep.toString());
        System.out.println("Liczba półek w sklepie: " + sklep.liczbaPelek());
        System.out.println("Czynsz za 6 miesięcy: " + sklep.obliczCzynszNaMiesiac(6));


        Kwiaciarnia kwiaciarnia = new Kwiaciarnia("ul. Kreta 40", 42, false, 900, 10);
        System.out.println(kwiaciarnia.toString());
        System.out.println("Liczba półek w kwiaciarni: " + kwiaciarnia.liczbaPelek());
        System.out.println("Czynsz za 3 miesiące: " + kwiaciarnia.obliczCzynszNaMiesiac(3));
    }
}
