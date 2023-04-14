import org.junit.Test;

public class OperatoryLogiczne {
    @Test
    public void Operator(){
        int pierwszaZmienna = 2;
        int drugaZmienna = 4;
        int trzeciaZmienna = 2;

        boolean warunek = pierwszaZmienna == trzeciaZmienna; // == to sprawdzenie czy te 2 zmienne sa sobie równe, porównanie
        boolean warunek2 = 2 == 2;
        boolean warunek3 = pierwszaZmienna != trzeciaZmienna; // to sprawdzeczenie czy NIE sa sobie równe.

        boolean warunek4 = pierwszaZmienna < drugaZmienna;
        boolean warunek5 = pierwszaZmienna > drugaZmienna;
        boolean warunek6 = pierwszaZmienna <= trzeciaZmienna;
        boolean warunek7 = pierwszaZmienna >= trzeciaZmienna;

        boolean prawda = true;
        boolean falsz = false;

        boolean warunek8 = !prawda;
        boolean warunek9 = prawda && falsz; //koniunkcja
        boolean warunek10 = falsz || prawda; //alternatywa
        boolean warune11 = falsz == prawda;
        boolean warunek12 = prawda != prawda;


        //KONKATENACJA

        String text1 = "Na śniadanie zjadlam";
        String text2 = "jajecznice";
        String text3 = "na masle";

        String text = text1 + text2 +text3;
    }
}
