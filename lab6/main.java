class Main {
    public static void main(String[] args) {
        SIG sig = new SIG();

        System.out.println(sig.obterInformacoesAdministrativas()); // OK

        System.out.println(sig.obterInformacoesFinanceiras()); // OK

        System.out.println(sig.obterInformacoesProfessores()); // OK

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
