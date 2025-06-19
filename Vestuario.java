public class Vestuario extends Loja {
    private boolean produtosImportados;

    // Construtor
    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, boolean produtosImportados, int quantidadeMaximaProdutos) {
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, quantidadeMaximaProdutos);
        this.produtosImportados = produtosImportados;
    }

    public Vestuario(String nome, int quantidadeFuncionarios, int salarioBaseFuncionario,
            Endereco endereco, Data dataFundacao, boolean produtosImportados) {
        super(nome, quantidadeFuncionarios, (double) salarioBaseFuncionario, endereco, dataFundacao, 10);
        this.produtosImportados = produtosImportados;
    }

    // Métodos de acesso Getters e Setters
    public boolean getProdutosImportados() {
        return this.produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados) {
        this.produtosImportados = produtosImportados;
    }

    @Override
    public String toString() {
        return super.toString() + ", Produtos Importados: " + (produtosImportados ? "Sim" : "Não");
    }
}