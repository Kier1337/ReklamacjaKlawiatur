public class Rezerwacik extends Park_Narodowy {
    private String opis;
    private String chronionyGatunek;

    //KONSTRUKTOR//
    public Rezerwacik(String nazwa, String kraj, double powierzchnia, int rokUtowrzenia, String opis, String chronionyGatunek) {
        super(nazwa, kraj, powierzchnia, rokUtowrzenia);
        this.opis = opis;
        this.chronionyGatunek = chronionyGatunek;
    }

    //PRZESLANIE METODY TOSTRING//
    @Override
    public String toString() {
        return super.toString() + ", Opis: " + opis + ", Chroniony gatunek: " + chronionyGatunek;
    }
}
