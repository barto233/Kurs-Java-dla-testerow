import org.junit.Test;

public class InstrukcjeWarunkowe {
    @Test
    public void warunki(){
        int liczba = -98;
        if(liczba>100) {
            System.out.println("Liczba" + liczba + " jest większa od 100.");
            liczba++;
        }
        else if (0<=liczba && liczba<=100){
            System.out.println("Liczba" + liczba + " jest większa lub równa 0 i mniejsza lub równa 100.");
            if(liczba==100) System.out.println("Liczba jest równa 100!");
            liczba = 100;
        }
        else {
            System.out.println("Liczba" + liczba +" jest liczbą ujemną.");
        }

        System.out.println("Koniec Testu. Liczba jest równa" + liczba);
        // jeśli liczba będzie wieksza niz 100 to ja wyswietli, jak nie to zignoruje ten element kodu.
    }
    @Test
    public void switchExample(){
        int liczba = 0;
        switch (liczba){ //na podstawie zmiennej liczba robimy rozne casey
            case 0:
                System.out.println("Liczba jest równa 0");
                break;
            case 1:
                System.out.println("Liczba jest równa 1");
                break;
            case 2:
                System.out.println("Liczba jest równa 2");
                break;
            default //wykona sie gdy zaden case nie zostanie spełniony np. liczba jest bledna (z poza zakresu).
        }
    }
}
