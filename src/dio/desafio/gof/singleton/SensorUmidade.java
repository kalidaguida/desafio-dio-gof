package dio.desafio.gof.singleton;
public class SensorUmidade {
    private static SensorUmidade instance = new SensorUmidade();

    private SensorUmidade() {
    }

    public static SensorUmidade getInstance() {
        return instance;
    }

    public boolean nivelUmidade(String estacao) {
        if (estacao.equalsIgnoreCase("verao")) {
            return true;
        } else if (estacao.equalsIgnoreCase("primavera")) {
            return true;
        } else if (estacao.equalsIgnoreCase("outono")) {
            return false;
        } else if (estacao.equalsIgnoreCase("inverno")) {
            return false;
        } else {
            return false;
        }
    }
}
