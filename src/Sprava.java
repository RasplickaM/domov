import java.util.ArrayList;

public class Sprava {
    private double pocet = 1;
    private double prumerVek = 0;
    private double pocet1 = 1;
    private double prumerVaha = 0;
    public double vypocetPrumernehoVeku(ArrayList<Mazlicek> seznamMazlicku){
        for (int i = 0; i < seznamMazlicku.size(); i++) {
            pocet += seznamMazlicku.get(i).getVek();

        }
        prumerVek = pocet / seznamMazlicku.size();
        return prumerVek;

    }
    public double vypocetPrumerneVahy(ArrayList<Mazlicek> seznamMazlicku){
        for (int i = 0; i < seznamMazlicku.size(); i++) {
            pocet1 += seznamMazlicku.get(i).getVaha();

        }
        prumerVaha = pocet1 / seznamMazlicku.size();
        return prumerVaha;


    }
}
