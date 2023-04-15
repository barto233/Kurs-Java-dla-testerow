import org.junit.Test;

public class Petlaforiforeach {
    @Test
    public void Petla() {
        int silnia6 = obliczSilnie(6);
    }

    private int obliczSilnie(int liczba) {
        int silnia = 1;

        if (liczba > 1) {
            for (int i = 2; i <= liczba; i++) {
                silnia = silnia * i;
            }
        }
        System.out.println(silnia);
        return silnia;
    }

    @Test
    public void forEachExample() {
        String[] planety = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        String tekst = "Planety naszego układu słoneczego to: ";

        for (String planeta : planety) {
            tekst = tekst + "\n" + planeta;
        }
        System.out.println(tekst);
    }


}
