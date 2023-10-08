public class Main {
    public static void main(String[] args) {
        SIG sig = new SIG();
        
        // Exemplo de como obter informações administrativas
        String informacoesAdministrativas = sig.obterInformacoesAdministrativas();
        System.out.println("Informações Administrativas:\n" + informacoesAdministrativas);

        // Exemplo de como obter informações financeiras
        String informacoesFinanceiras = sig.obterInformacoesFinanceiras();
        System.out.println("\nInformações Financeiras:\n" + informacoesFinanceiras);

        // Exemplo de como obter informações dos professores
        String informacoesProfessores = sig.obterInformacoesProfessores();
        System.out.println("\nInformações dos Professores:\n" + informacoesProfessores);

        // Exemplo de como obter informações dos alunos
        String informacoesAlunos = sig.obterInformacoesAlunos();
        System.out.println("\nInformações dos Alunos:\n" + informacoesAlunos);

        // Exemplo de como obter informações do almoxarifado
        String informacoesAlmoxarifado = sig.obterInformacoesAlmoxarifado();
        System.out.println("\nInformações do Almoxarifado:\n" + informacoesAlmoxarifado);

        // Exemplo de como obter informações da infraestrutura
        String informacoesInfraestrutura = sig.obterInformacoesInfraestrutura();
        System.out.println("\nInformações da Infraestrutura:\n" + informacoesInfraestrutura);
    }
}
