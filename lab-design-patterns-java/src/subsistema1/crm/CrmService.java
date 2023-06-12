package subsistema1.crm;

public class CrmService {
    private CrmService() {}
    public static void gravarCliente(String nome, String cep, String estado, String cidade) {
        System.out.println("Cliente salvo no CRM");
        System.out.println(cep);
        System.out.println(estado);
        System.out.println(cidade);
    }
}
