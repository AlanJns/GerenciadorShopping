public class Bijuteria extends Loja {
    private double metaVendas;

    // Construtor
    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, double metaVendas, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.metaVendas = metaVendas;
    }

    public Bijuteria(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, int metaVendas) {
        super(nome, quantidadeFuncionarios, (double) salarioBaseFuncionario, endereco, dataFundacao, 10); // valor
                                                                                                          // padrão
        this.metaVendas = (double) metaVendas;
    }

    // Métodos de acesso Getters e Setters
    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Meta de Vendas: " + metaVendas;
    }
}