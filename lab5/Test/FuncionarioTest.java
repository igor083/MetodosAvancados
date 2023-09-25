import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

public class FuncionarioTest {
   @Test
   public void testConstrutorComNomeNulo() {
      assertThrows(PessoaException.class, () -> new Funcionario(null));
   }

   @Test
   public void testAdicionarFuncao() throws PessoaException, FilmeException {
      Funcionario funcionario = new Funcionario("Maria");
      Funcao funcao = new Ator();
      funcionario.adicionarFuncao(funcao);
      assertTrue(funcionario.getFuncoes().contains(funcao));
   }

   @Test
   public void testAdicionarFuncaoComFuncaoNula() throws PessoaException {
      Funcionario funcionario = new Funcionario("Carlos");
      
      assertThrows(FilmeException.class, () -> funcionario.adicionarFuncao(null));
   }

   @Test
   public void testGetFuncoes() throws PessoaException, FilmeException {
      Funcionario funcionario = new Funcionario("Ana");
      Funcao funcao1 = new Diretor();
      Funcao funcao2 = new Ator();

      funcionario.adicionarFuncao(funcao1);
      funcionario.adicionarFuncao(funcao2);

      List<Funcao> funcoes = funcionario.getFuncoes();

      assertNotNull(funcoes);
      assertEquals(2, funcoes.size());
      assertTrue(funcoes.contains(funcao1));
      assertTrue(funcoes.contains(funcao2));
   }

   @Test
   public void testGetFuncoesComNenhumaFuncao() throws PessoaException, FilmeException {
      Funcionario funcionario = new Funcionario("Pedro");

      List<Funcao> funcoes = funcionario.getFuncoes();

      assertNotNull(funcoes);
      assertTrue(funcoes.isEmpty());
   }

   @Test
   public void testGetFuncoesComExcecao() throws PessoaException {
      Funcionario funcionario = new Funcionario("Fernanda");

      assertThrows(FilmeException.class, () -> funcionario.getFuncoes());
   }
}
