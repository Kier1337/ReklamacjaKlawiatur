import MojeKlasy.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Gra gra1 = new Gra("Wiedźmin 3 Dziki Gon", 2015, 10, 5);
        Gra gra2 = new Gra("Skyrim Special Edition", 2011, 3, 19);
        Gra gra3 = new Gra("Warms destruct", 2009, 7, 15);


        List<Gra> gry = new ArrayList<>();
        gry.add(gra1);
        gry.add(gra2);
        gry.add(gra3);

        Collections.sort(gry);

        for (Gra gra : gry) {
            System.out.println(gra);
        }

        System.out.println("\nDzień tygodnia dla daty 2015-10-05: " + gra1.DzienTygodnia(2015, 10, 5));
        System.out.println("Dzień roku dla daty 2015-10-05: " + gra1.DzienRoku(2015, 10, 5));
    }
}
