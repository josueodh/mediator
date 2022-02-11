public class Formulario {
    private static Formulario instancia = new Formulario();

    private Formulario() {}

    public static Formulario getInstancia() {
        return instancia;
    }

    public String receberElogioRestaurante(String mensagem) {
        return "Agradecemos seu contato.\n"+
                "O Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Restaurante.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoRestaurante(String mensagem) {
        return "Agradecemos seu contato.\n"+
                "O Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Restaurante.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoRestaurante(String mensagem) {
        return "Agradecemos seu contato.\n"+
                "O Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Restaurante.getInstancia().receberSugestao(mensagem);
    }
}
