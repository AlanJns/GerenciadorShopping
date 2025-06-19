public class Cosmetico extends Loja {
    private double taxaComercializacao;

    // Construtor
    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, double taxaComercializacao, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.taxaComercializacao = taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, int taxaComercializacao, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, (double) salarioBaseFuncionario, endereco, dataFundacao,
                quantidadeMaximaProdutos);
        this.taxaComercializacao = (double) taxaComercializacao;
    }

    public Cosmetico(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, int taxaComercializacao) {
        super(nome, quantidadeFuncionarios, (double) salarioBaseFuncionario, endereco, dataFundacao, 10);
        this.taxaComercializacao = (double) taxaComercializacao;
    }

    // Métodos de acesso Getters e Setters
    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
    }

    @Override
    public String toString() {
        return super.toString() + ", Taxa de Comercialização: " + taxaComercializacao;
    }
}