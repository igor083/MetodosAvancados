import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private List<Funcao> funcoes;

    public Funcionario(String nome) throws PessoaException {
        super(nome);
        this.funcoes = new ArrayList<>();
    }

    public void adicionarFuncao(Funcao funcao) throws FilmeException {
      if(funcao==null) throw new FilmeException();
      
      funcoes.add(funcao);
    }

    public List<Funcao> getFuncoes() throws FilmeException {
      if(funcoes==null||funcoes.size()==0) throw new FilmeException();
        return funcoes;
    }
}