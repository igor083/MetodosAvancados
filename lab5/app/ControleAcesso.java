import java.util.List;

public class ControleAcesso {
    public static void main(String[] args) throws FilmeException, PessoaException {
        // Criação de funcionários
        Funcionario pessoa1 = new Funcionario("Pessoa 1");
        Funcionario pessoa2 = new Funcionario("Pessoa 2");

        // Adiciona funções aos funcionários
        pessoa1.adicionarFuncao(new Ator());
        pessoa1.adicionarFuncao(new Cameraman());
        pessoa2.adicionarFuncao(new Diretor());
        pessoa2.adicionarFuncao(new Roteirista());
        pessoa2.adicionarFuncao(new Ator());

        // Criação de um filme
        Filme filme1 = new Filme("Filme 1", "Diretor 1", "Roteirista 1");

        // Adiciona funcionários ao elenco do filme
        filme1.adicionarFuncionario(pessoa1);
        filme1.adicionarFuncionario(pessoa2);

        // Exibe informações do filme
        System.out.println("Nome do Filme: " + filme1.getNome());
        System.out.println("Diretor: " + filme1.getDiretor());
        System.out.println("Roteirista: " + filme1.getRoteirista());
        System.out.println("Elenco:");

        for (Funcionario funcionario : filme1.getElenco()) {
            System.out.print(funcionario.getNome() + " - Funções: ");
            List<Funcao> funcoes = funcionario.getFuncoes();
            for (int i = 0; i < funcoes.size(); i++) {
                System.out.print(funcoes.get(i).getFuncao());
                if (i < funcoes.size() - 1) {
                    System.out.print(", "); 
                }
            }
            System.out.println(); 
        }

    }
}