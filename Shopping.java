public class Shopping {
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    // Construtor
    public Shopping(String nome, Endereco endereco, int quantidadeMaximaLojas) {
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[quantidadeMaximaLojas];
    }

    // Método Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString() {
        return "Shopping: " + nome + ", Endereço: " + endereco + ", Capacidade de lojas: " + lojas.length;
    }

    // Método insereLoja
    public boolean insereLoja(Loja l) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] == null) {
                lojas[i] = l;
                return true;
            }
        }

        return false; // Sem espaço
    }

    // Método removeLoja
    public boolean removeLoja(String nomeLoja) {
        for (int i = 0; i < lojas.length; i++) {
            if (lojas[i] != null && lojas[i].getNome().equals(nomeLoja)) {
                lojas[i] = null;
                return true;
            }
        }
        return false; // Loja não encontrada
    }

    // Método quantidadeLojasPorTipo
    public int quantidadeLojasPorTipo(String tipo) {
        int cont = 0;
        for (Loja l : lojas) {
            if (l != null) {
                if (tipo.equalsIgnoreCase("Cosmético") && l instanceof Cosmetico)
                    cont++;
                else if (tipo.equalsIgnoreCase("Vestuário") && l instanceof Vestuario)
                    cont++;
                else if (tipo.equalsIgnoreCase("Bijuteria") && l instanceof Bijuteria)
                    cont++;
                else if (tipo.equalsIgnoreCase("Alimentação") && l instanceof Alimentacao)
                    cont++;
                else if (tipo.equalsIgnoreCase("Informática") && l instanceof Informatica)
                    cont++;
            }
        }
        if (cont == 0)
            return -1; // Tipo inválido ou nenhuma loja
        return cont;
    }

    // Método lojaSeguroMaisCaro
    public Informatica lojaSeguroMaisCaro() {
        Informatica maisCara = null;
        double maiorSeguro = -1;

        for (Loja l : lojas) {
            if (l != null && l instanceof Informatica) {
                Informatica inf = (Informatica) l;
                if (inf.getSeguroEletronicos() > maiorSeguro) {
                    maiorSeguro = inf.getSeguroEletronicos();
                    maisCara = inf;
                }
            }
        }
        return maisCara; // Pode ser null
    }
}