public class SIG {
    private Administrativa administrativo;
    private Financeiro financeiro;
    private Professores professores;
    private Alunos alunos;
    private Almoxarifado almoxarifado;
    private Infraestrutura infraestrutura;

    public SIG() {
        administrativo = new Administrativa();
        financeiro = new Financeiro();
        professores = new Professores();
        alunos = new Alunos();
        almoxarifado = new Almoxarifado();
        infraestrutura = new Infraestrutura();
    }

    public String obterInformacoesAdministrativas() {
        return administrativo.obterReunioesAgendadas() + "\n" + administrativo.obterEntrevistas();
    }

    public String obterInformacoesFinanceiras() {
        return financeiro.obterBalancoContas() + "\n" + financeiro.obterFolhaPagamento();
    }

    public String obterInformacoesProfessores() {
        return professores.obterAlocacaoDisciplina() + "\n" + professores.obterTempoCasa();
    }

    public String obterInformacoesAlunos() {
        return alunos.obterHistorico() + "\n" + alunos.obterRDM();
    }

    public String obterInformacoesAlmoxarifado() {
        return almoxarifado.obterEstoque() + "\n" + almoxarifado.obterPedidosCompra();
    }

    public String obterInformacoesInfraestrutura() {
        return infraestrutura.obterAlocacaoSalas();
    }
}