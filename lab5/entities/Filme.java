import java.util.ArrayList;
import java.util.List;

public class Filme {
   private String nome;
   private Funcionario diretor;
   private Funcionario roteirista;
   private List<Funcionario> elenco;

   public Filme(String nome, String diretor, String roteirista) throws FilmeException, PessoaException {// contrutor que recebe todos os atributos
      if (nome == "" || nome == null)
         throw new FilmeException();// nome invalido ou null
      if (diretor == "" || diretor == null)
         throw new FilmeException();// diretor invalido
      if (roteirista == "" || roteirista == null)
         throw new FilmeException();// roteirista invalido
         Funcionario fun1 = new Funcionario(diretor ) ;
         fun1.adicionarFuncao(new Diretor());
         this.diretor=fun1;

         Funcionario fun2 = new Funcionario(roteirista);
         fun2.adicionarFuncao(new Roteirista());
         this.roteirista=fun2;

      this.nome = nome;
      
      this.elenco = new ArrayList<>();
   }

   public int adicionarFuncionario(Funcionario funcionario) throws PessoaException {

      elenco.add(funcionario);
      return 1;
   }

   public String getNome() {

      return nome;
   }

   public String getDiretor() {
      return diretor.getNome();
   }

   public String getRoteirista() {

      return roteirista.getNome();
   }

   public List<Funcionario> getElenco() throws FilmeException {
      if (elenco.size() == 0)
         throw new FilmeException();// nao tem elenco
      return elenco;
   }
}
