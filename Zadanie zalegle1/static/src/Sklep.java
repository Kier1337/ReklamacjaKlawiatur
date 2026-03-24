public class Sklep {

    private String adres;
    private double powierzchnia;
    private boolean czyJestWc;
    private double czynszNajmu;


    public Sklep(String adres, double powierzchnia, boolean czyJestWc, double czynszNajmu) {
        this.adres = adres;
        this.powierzchnia = powierzchnia;
        this.czyJestWc = czyJestWc;
        this.czynszNajmu = czynszNajmu;
    }


    public double getPowierzchnia() {
        return powierzchnia;
    }


    @Override
    public String toString() {
        return "Sklep [adres=" + adres + ", powierzchnia=" + powierzchnia + ", czyJestWc=" + czyJestWc
                + ", czynszNajmu=" + czynszNajmu + "]";
    }


    public int liczbaPelek() {
        return (int) (powierzchnia / 2);
    }


    public final double obliczCzynszNaMiesiac(int liczbaMiesiecy) {
        return liczbaMiesiecy * czynszNajmu;
    }
}
