import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private List<Funcao> funcoes;

    public Funcionario(String nome) {
        super(nome);
        this.funcoes = new ArrayList<>();
    }

    public void adicionarFuncao(Funcao funcao) {
        funcoes.add(funcao);
    }

    public List<Funcao> getFuncoes() {
        return funcoes;
    }
}