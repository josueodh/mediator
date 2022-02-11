public class Restaurante  implements Empresa {

    private static Restaurante instancia = new Restaurante();

    private Restaurante() {}

    public static Restaurante getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O restaurante vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O restaurante agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O restaurante vai analisar a sugestão: " + mensagem;
    }
}
