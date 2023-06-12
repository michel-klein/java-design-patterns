package subsistema2.cep;

public class CepAPI {
    private static CepAPI instance = new CepAPI();
    private CepAPI() {}

    public static CepAPI getInstance() {
        return instance;
    }

    public String recuperarCidade(String cep) {
        return "Salvador";
    }

    public String recuperarEstado(String cep) {
        return "BA";
    }
}
