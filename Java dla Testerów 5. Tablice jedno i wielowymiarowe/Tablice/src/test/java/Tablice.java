import org.junit.Test;

public class Tablice {
    @Test
    public void Tablice() {
        //tworzymy tablice z nazwami planet
        String[] planety = new String[8];
        planety[0] = "Merkury";
        String planetaPierwsza = planety[0];

    }
    @Test
    public void Tablice2() {
        String[] planety = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun"};
        String czwartaPlaneta = planety[3];
    }

    @Test
    public void Tablice3() {
        int[][] srednicaPlanet = new int[8][2];
        srednicaPlanet[0][0] = 1;
        srednicaPlanet[0][1] = 4879;
        srednicaPlanet[1][0] = 2;
        srednicaPlanet[1][1] = 12104;
    }

    @Test
    public void Tablice4() {
        int[][] srednicaPlanet = {{1,4879},{2,12104},{3,12756},{4,6805},{5,142984},{6,120536},{7,5118},{8,49528}};
        System.out.println(srednicaPlanet[0][1]);
    }
}
