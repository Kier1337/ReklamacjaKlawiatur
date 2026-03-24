import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    private static final double powierzchniaZamieszkana = 30;

//TWORZENIE OBIEKTOW//

    public static void main(String[] args) {
        Park_Narodowy park1 = new Park_Narodowy("Kieresowski", "Polska", 1225, 1992);
        Park_Narodowy park2 = new Park_Narodowy("Tatarowski", "Polska", 850, 1954);
        Park_Narodowy park3 = new Park_Narodowy("Pedalski", "Polska", 1100, 1995);

        Rezerwacik rezerwat1 = new Rezerwacik("Rezerwat Kulszewski", "Polska", 150, 1980, "Rezerwat górski", "Mamut");
        Rezerwacik rezerwat2 = new Rezerwacik("Rezerwat Wolnoseski", "Polska", 200, 1990, "Obszar jezior", "Kuń");

        //LISTA//
        ArrayList<Park_Narodowy> parki = new ArrayList<>();
        parki.add(park1);
        parki.add(park2);
        parki.add(park3);
        parki.add(rezerwat1);
        parki.add(rezerwat2);


        System.out.println("Przed posortowaniem:");
        for (Park_Narodowy park : parki) {
            System.out.println(park);
        }

//POROWNANIE PRZED I PO SORTOWANIU//
        parki.sort(new Comparator<Park_Narodowy>() {
            @Override
            public int compare(Park_Narodowy o1, Park_Narodowy o2) {
                return Double.compare(o1.przeliczPowierzchnie(), o2.przeliczPowierzchnie());
            }
        });

        System.out.println("\nPo posortowaniu:");
        for (Park_Narodowy park : parki) {
            System.out.println(park);
        }
    }
}
