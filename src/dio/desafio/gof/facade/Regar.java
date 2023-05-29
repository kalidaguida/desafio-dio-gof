package dio.desafio.gof.facade;

import dio.desafio.gof.singleton.SensorUmidade;

public class Regar {
    private SensorUmidade sensorUmidade;

    public Regar() {
        sensorUmidade = SensorUmidade.getInstance();
    }

    public void regarCactos(String estacao) {
        boolean necessidade = sensorUmidade.nivelUmidade(estacao);
        if (necessidade) {
            System.out.println("Regando os cactos");
        } else {
            System.out.println("Cactos não precisam de rega");
        }
    }
}

