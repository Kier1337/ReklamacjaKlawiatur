// Definicja interfejsu oraz klasy implementującej go w jednym pliku
public class Main {

    // Definicja interfejsu
    public interface NazwaInterfejsu {
        // Metody interfejsu bez implementacji
        void metoda1();

        int metoda2(String parametr);
    }

    // Klasa implementująca interfejs
    public static class KlasaImplementujaca implements NazwaInterfejsu {

        @Override
        public void metoda1() {
            // Implementacja metody1
            System.out.println("Implementacja metody1");
        }

        @Override
        public int metoda2(String parametr) {
            // Implementacja metody2
            return parametr.length();
        }
    }
}