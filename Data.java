public class Data {
    private int dia, mes, ano;

    // Método Construtor com validação
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Ajustando para 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    private boolean validaData(int dia, int mes, int ano) {
        if (mes < 1 || mes > 12)
            return false;
        int[] diasMes = { 31, verificaAnoBissexto(ano) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        return dia >= 1 && dia <= diasMes[mes - 1];
    }

    public boolean verificaAnoBissexto() {
        return verificaAnoBissexto(this.ano);
    }

    private boolean verificaAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    // Métodos de acesso (Getters e Setters)
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Método toString
    public String toString() {
        return dia + "/" + ano;
    }
}