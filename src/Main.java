import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Mazlicek pes = new Mazlicek("adolf", "n.ovcak", 4, 7.8);
        Mazlicek kocka = new Mazlicek("milda", "niga", 2, 4);
        Mazlicek krecek = new Mazlicek("ludva", "bezdak", 2, 0.25);

        ArrayList<Mazlicek> mazlicekA = new ArrayList<>();

        mazlicekA.add(pes);
        mazlicekA.add(kocka);
        mazlicekA.add(krecek);

        //pes.toString();
        System.out.println(pes);
        System.out.println(kocka);
        System.out.println(krecek);
        System.out.print("Jmena mazlicku: ");

        for (int i = 0; i < mazlicekA.size(); i++) {
            if(i == mazlicekA.size()-1){
                System.out.print(mazlicekA.get(i).getJmeno()+". ");
            } else {
                System.out.print(mazlicekA.get(i).getJmeno()+", ");
            }


        }


    }
}