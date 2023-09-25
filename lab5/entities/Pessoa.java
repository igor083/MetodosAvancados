

public class Pessoa {
   private String nome;

   public Pessoa(String nome) throws PessoaException {
      if(nome==null || nome == "") throw new PessoaException();//nome invalido ou null
      this.nome = nome;
   }

   public String getNome() {
      return nome;
   }
}
