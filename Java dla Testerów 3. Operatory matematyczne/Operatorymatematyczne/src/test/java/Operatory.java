import org.junit.Test;

public class Operatory {
    @Test
    public void Examples(){
        int pierwsza = 11;
        int druga = 2;

        int wynikDodawania = pierwsza + druga;
        int wynikOdejmowania = pierwsza - druga;
        int wynikaMnozenia = pierwsza * druga;
        int wynikDzielenia = pierwsza / druga;
        // Wynik dzielenia zwroci 5, nie 5,5 poniewaz jest to typ INT czyli liczba całkowita.
        //aby to rozwiazac trzeba zmienić chociaz 1 zmienna w ktorej mamy liczby jak i typ zmiennej samego dzialania. Przyklad poprawny ponizej:
        double pierwszaDouble = 11;
        double wynikDzieleniaDouble = pierwszaDouble/druga;

        //modulo - to resta z dzielenia
        int wynikModulu = pierwsza%druga;

        //zmiana wartości zmiennej
        pierwsza = pierwsza + druga;
        pierwsza += druga;
        //obie powyzsze linijki robia to samo.

        System.out.println(druga); //ma wartosc 2
        System.out.println(druga++); // POSTINKREMENTACJA tutaj pokaze wartosc 2, zwieksza o 1 zmienna 'druga', ale najpierw ja wyswietli i dopiero wtedy zwiekszy o 1
        System.out.println(druga); // tutaj pokaze 3
        System.out.println(++druga); //PREINKREMENTACJA tutaj od razu pojawi sie 4 poniewaz ++ na poczatku najpierw powieksza wartosc i nastepnie ja wyswietla
        System.out.println(druga); // wyswietla 4

        System.out.println(druga); //ma wartosc 4
        System.out.println(druga--); // POSTDEKREMENTACJA tutaj pokaze wartosc 4, ZMNIEJSZA o 1 zmienna 'druga', ale najpierw ja wyswietli i dopiero wtedy zmniejszy o 1
        System.out.println(druga); // tutaj pokaze 3
        System.out.println(--druga); //PREDINKREMENTACJA tutaj od razu pojawi sie 2 poniewaz ++ na poczatku najpierw pomniejsza wartosc i nastepnie ja wyswietla
        System.out.println(druga); // wyswietla 2

    }

}
