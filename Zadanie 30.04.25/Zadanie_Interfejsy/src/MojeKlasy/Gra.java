package MojeKlasy;

import java.util.*;

public class Gra implements IDaty, Comparable<Gra> {

    private String tytul;
    private int[] dataPremiery = new int[3];


    public Gra(String tytul, int rok, int miesiac, int dzien) {
        this.tytul = tytul;
        this.dataPremiery[0] = rok;
        this.dataPremiery[1] = miesiac;
        this.dataPremiery[2] = dzien;
    }

    @Override
    public String DzienTygodnia(int rok, int miesiac, int dzien) {
        Calendar calendar = new GregorianCalendar(rok, miesiac - 1, dzien);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case Calendar.MONDAY: return "Poniedziałek";
            case Calendar.TUESDAY: return "Wtorek";
            case Calendar.WEDNESDAY: return "Środa";
            case Calendar.THURSDAY: return "Czwartek";
            case Calendar.FRIDAY: return "Piątek";
            case Calendar.SATURDAY: return "Sobota";
            case Calendar.SUNDAY: return "Niedziela";
            default: return "Nieznany dzień";
        }
    }
    @Override
    public int DzienRoku(int rok, int miesiac, int dzien) {
        Calendar calendar = new GregorianCalendar(rok, miesiac - 1, dzien);
        return calendar.get(Calendar.DAY_OF_YEAR);
    }

    @Override
    public String toString() {
        return "Gra: " + tytul + " | Data premiery: " + dataPremiery[0] + "-" + dataPremiery[1] + "-" + dataPremiery[2];
    }

    @Override
    public int compareTo(Gra innaGra) {
        if (this.dataPremiery[0] != innaGra.dataPremiery[0]) {
            return this.dataPremiery[0] - innaGra.dataPremiery[0];
        } else if (this.dataPremiery[1] != innaGra.dataPremiery[1]) {
            return this.dataPremiery[1] - innaGra.dataPremiery[1];
        } else {
            return this.dataPremiery[2] - innaGra.dataPremiery[2];
        }
    }
}


