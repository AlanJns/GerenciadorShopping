public class Produto {
    private String nome;
    private double preco;
    private Data dataValidade;

    // Método construtor
    public Produto(String nome, double preco, Data dataValidade) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Produto(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = new Data(1, 1, 2000);
    }

    // Método estaVencido
    public boolean estaVencido(Data data) {
        if (data.getAno() > dataValidade.getAno()) {
            return true;
        } else if (data.getAno() == dataValidade.getAno()) {
            if (data.getMes() > dataValidade.getMes()) {
                return true;
            } else if (data.getAno() == dataValidade.getAno()) {
                if (data.getMes() > dataValidade.getMes()) {
                    return true;
                } else if (data.getMes() == dataValidade.getMes()) {
                    return data.getDia() > dataValidade.getDia();
                }
            }
        }
        return false;
    }

    // Método de acesso (Getters e Setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método tostring
    public String toString() {
        return "Produto: " + nome + ", Preço: " + preco + ", Validade: " + dataValidade;
    }
}