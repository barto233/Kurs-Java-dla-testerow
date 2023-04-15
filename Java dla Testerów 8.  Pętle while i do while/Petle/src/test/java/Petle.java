import org.junit.Test;

import java.util.Random;

public class Petle {
    @Test
    public void petla(){
        int silnia5 = 1 * 2 * 3 * 4 * 5;
        int silnia4 = 1 * 2 * 3 * 4;
        int silnia6 = obliczSilnie(6);
        czyToMojaLiczba(4);
    }

    private int obliczSilnie(int liczba) {
        int silnia = 1;
        int i = 2;

        if(liczba>1){
            while(i<=liczba){
                silnia = silnia*i;
                i++;
            }
        }

        return silnia;
    }

    private void czyToMojaLiczba(int liczba){
        int licznik = 0;
        Random generator = new Random();
        while(generator.nextInt(5)!=liczba){
            System.out.println("Liczba nie jest równa " + liczba);
            licznik++;
        }
        System.out.println("Wylosowało moją liczbe." + licznik + " razy.");
    }
}
