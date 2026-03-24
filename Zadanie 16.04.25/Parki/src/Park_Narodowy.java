public class Park_Narodowy {
    private String nazwa;
    private String kraj;
    private double powierzchnia;
    private int rokUtowrzenia;

//KONSTRUKTOR//
    public Park_Narodowy(String nazwa, String kraj, double powierzchnia, int rokUtowrzenia) {
        this.nazwa = nazwa;
        this.kraj = kraj;
        this.powierzchnia = powierzchnia;
        this.rokUtowrzenia = rokUtowrzenia;
    }


    public double przeliczPowierzchnie() {
        return this.powierzchnia * 100;
    }

    public double przeliczPowierzchnie(boolean naMetry) {
        if (naMetry) {
            return this.powierzchnia * 1000000;
        } else {
            return this.powierzchnia / 100;
        }
    }

    @Override
    public String toString() {
        return "Park Narodowy: " + nazwa + ", Kraj: " + kraj + ", Powierzchnia: " + przeliczPowierzchnie() + " ha, Rok utworzenia: " + rokUtowrzenia;
    }
}
