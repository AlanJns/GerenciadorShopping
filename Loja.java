public class Loja {
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public static Loja loja1 = new Loja("E3", 5, -1,
            new Endereco("Rua Padrão", "Cidade", "Estado", "País", "00000-000", "0", "Sem complemento"),
            new Data(1, 1, 2000), 5);

    // Construtor com todos os atributos
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao, int quantidadeMaximaProdutos) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[quantidadeMaximaProdutos];
    }

    // Construtor com nome e quantidade, salario = -1
    public Loja(String nome, int quantidadeFuncionarios) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = new Endereco("Rua Padrão", "Cidede", "Estada", "País", "00000-00", "0", "Sem complemento");
        this.dataFundacao = new Data(1, 1, 200);
        this.estoqueProdutos = new Produto[5];
    }

    // Construtor com nome, quantidadeFuncionarios e salarioBaseFuncionario
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;

        // Definindo valores padrão para os novos atributos obrigatórios
        this.endereco = new Endereco("Rua Padrão", "Cidade", "Estado", "País", "00000-000", "0", "Sem complemento");
        this.dataFundacao = new Data(1, 1, 2000);
        this.estoqueProdutos = new Produto[10]; // Estoque padrão com 10 posições
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, 10);
    }

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco,
            Data dataFundacao) {
        this(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, 10);
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao,
            int quantidadeMaximaProdutos) {
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, quantidadeMaximaProdutos);
    }

    // Metodo insereProduto
    public boolean insereProduto(Produto p) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = p;
                return true;
            }
        }
        return true;
    }

    // Método removeProduto
    public boolean removeProduto(String nomeProduto) {
        for (int i = 0; i < estoqueProdutos.length; i++) {
            if (estoqueProdutos[i] != null && estoqueProdutos[i].getNome().equals(nomeProduto)) {
                estoqueProdutos[i] = null;
                return true;
            }
        }
        return false; // Produto não encontrado
    }

    // Método imprimeProduto
    public void imprimeProdutos() {
        System.out.println("Produtos da loja" + nome + ":");
        for (Produto p : estoqueProdutos) {
            if (p != null) {
                System.out.println(p);
            }
        }
    }

    // Gettrs e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    @Override
    public String toString() {
        return "Loja: " + nome + ", Funcionários: " + quantidadeFuncionarios +
                ", Endereço: " + endereco + ", Data de Fundação: " + dataFundacao +
                ", Produtos no estoque: " + estoqueProdutos.length;
    }

    // Método gastosComSalario
    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1;
        }
        return salarioBaseFuncionario * quantidadeFuncionarios;
    }

    // Método tamanhoDaLoja
    public char tamanhoDaLoja() {
        if (quantidadeFuncionarios < 10)
            return 'P';
        else if (quantidadeFuncionarios <= 30)
            return 'M';
        else
            return 'G';
    }
}