package basic;

import java.util.ArrayList;

public class ArraysList {
    public static void main(String[] args) {

        String[] nomesArr = new String[10];

        nomesArr[0] = "Maria";
        nomesArr[1] = "Doda";

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Eduarda");
        nomes.add("Abreu");
        nomes.add("Doda");
        nomes.add("Clara");
        nomes.add("Marcele");

        System.out.println(nomes.get(0));
        nomes.remove(0);
        System.out.println(nomes.get(0));

        for(String nome : nomes) {
            System.out.println(nome);
        }



    }
}
