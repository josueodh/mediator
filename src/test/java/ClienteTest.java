import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarRestaurante() {
        Cliente cliente = new Cliente();
        assertEquals("Agradecemos seu contato.\nO Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O restaurante agradece a mensagem: Ótimo atendimento",
                cliente.elogiarRestaurante("Ótimo atendimento"));
    }

    @Test
    void deveReclamarRestaurante() {
        Cliente cliente = new Cliente();
        assertEquals("Agradecemos seu contato.\nO Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O restaurante vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarRestaurante("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirRestaurante() {
        Cliente cliente = new Cliente();
        assertEquals("Agradecemos seu contato.\nO Restaurante respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O restaurante vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.sugerirRestaurante("Ampliar horário funcionamento"));
    }
}