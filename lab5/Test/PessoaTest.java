import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class PessoaTest {

    @Test
    public void testConstrutorComNomeValido() throws PessoaException {
        String nome = "João";
        Pessoa pessoa = new Pessoa(nome);
        assertEquals(nome, pessoa.getNome());
    }

    @Test
    public void testConstrutorComNomeNulo() {
        assertThrows(PessoaException.class, () -> new Pessoa(null));
    }

    @Test
    public void testConstrutorComNomeVazio() {
        assertThrows(PessoaException.class, () -> new Pessoa(""));
    }
}
