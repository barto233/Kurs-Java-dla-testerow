import org.junit.Test;

public class Metody {
    @Test
    public void metod() {
        double poleTrapezu1 = obliczPoleTrapezu(8, 10, 5);
        double poleTrapezu2 = ((6 + 8) * 3) / 2;
        double poleTrapezu3 = ((12 + 10) * 6) / 2;
        String tekst = "Pola trapezów to: " + poleTrapezu1 + ", " + poleTrapezu2 + ", " + poleTrapezu3 + ".";
        koniec("koniec testu.");
        boolean czyWieksza = czyWiekszaNizSto(120);
    }

    double obliczPoleTrapezu (double pierwszaPodstawa, double drugaPodstawa, double wysokosc) {
        double poleTrapezu = ((pierwszaPodstawa + drugaPodstawa) * wysokosc) / 2;
        return poleTrapezu;
    }

    void koniec(String tekst){
        System.out.println(tekst);
    }

    void wypiszKoniec() {
        System.out.println("Koniec testu.");
    }

    boolean czyWiekszaNizSto(int liczba){
        return liczba>100;
    }

}