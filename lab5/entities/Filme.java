import java.util.ArrayList;
import java.util.List;

public class Filme {
    private String nome;
    private String diretor;
    private String roteirista;
    private List<Funcionario> elenco;

    public Filme(String nome, String diretor, String roteirista) {
        this.nome = nome;
        this.diretor = diretor;
        this.roteirista = roteirista;
        this.elenco = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        elenco.add(funcionario);
    }

    public String getNome() {
        return nome;
    }

    public String getDiretor() {
        return diretor;
    }

    public String getRoteirista() {
        return roteirista;
    }

    public List<Funcionario> getElenco() {
        return elenco;
    }
}
