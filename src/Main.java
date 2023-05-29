import dio.desafio.gof.facade.Regar;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static ArrayList<String> estacoes = new ArrayList<>();
    public static void main(String[] args) {
        estacoes.add("primavera");
        estacoes.add("verao");
        estacoes.add("outono");
        estacoes.add("inverno");
        int random = ThreadLocalRandom.current().nextInt(0,4);
        Regar regar = new Regar();
        regar.regarCactos(estacoes.get(random));

    }
}
