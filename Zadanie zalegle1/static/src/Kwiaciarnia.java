public class Kwiaciarnia extends Sklep {

    private double powierzchniaZaplecza;


    public Kwiaciarnia(String adres, double powierzchnia, boolean czyJestWc, double czynszNajmu, double powierzchniaZaplecza) {
        super(adres, powierzchnia, czyJestWc, czynszNajmu);
        this.powierzchniaZaplecza = powierzchniaZaplecza;
    }


    @Override
    public String toString() {
        return "Kwiaciarnia [adres=" + super.toString() + ", powierzchniaZaplecza=" + powierzchniaZaplecza + "]";
    }


    @Override
    public int liczbaPelek() {
        return (int) ((getPowierzchnia() + powierzchniaZaplecza) / 4);
    }
}
