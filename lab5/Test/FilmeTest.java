import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class FilmeTest {

    private Filme filme;
    private Funcionario diretor;
    private Funcionario roteirista;
    private Funcionario ator1;

    @Before
    public void setUp() throws FilmeException, PessoaException {
        diretor = new Funcionario("Diretor1");
        diretor.adicionarFuncao(new Diretor());
        roteirista = new Funcionario("Roteirista1");
        roteirista.adicionarFuncao(new Roteirista());

        filme = new Filme("Filme1", diretor.getNome(), roteirista.getNome());

        ator1 = new Funcionario("Ator1");
        ator1.adicionarFuncao(new Ator());
    }


    @Test
    public void testConstrutorComNomeNulo() {
        assertThrows(FilmeException.class, () -> new Filme(null, diretor.getNome(), roteirista.getNome()));
    }

    @Test
    public void testConstrutorComNomeVazio() {
        assertThrows(FilmeException.class, () -> new Filme("", diretor.getNome(), roteirista.getNome()));
    }

    @Test
    public void testGetDiretor() {
        assertEquals(diretor.getNome(), filme.getDiretor());
    }

    @Test
    public void testGetRoteirista() {
        assertEquals(roteirista.getNome(), filme.getRoteirista());
    }

    @Test
    public void testAdicionarFuncionario() throws PessoaException, FilmeException {
        assertEquals(1, filme.adicionarFuncionario(ator1));
        List<Funcionario> elenco = filme.getElenco();
        assertTrue(elenco.contains(ator1));
    }

    @Test
    public void testGetElenco() throws PessoaException, FilmeException {
        filme.adicionarFuncionario(ator1);

        List<Funcionario> elenco = filme.getElenco();
        assertNotNull(elenco);
        assertEquals(1, elenco.size());
        assertTrue(elenco.contains(ator1));
    }

    @Test
    public void testGetElencoSemFuncionarios() {
        assertThrows(FilmeException.class, () -> filme.getElenco());
    }
}