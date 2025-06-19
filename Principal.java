import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println("MENU:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um Produto");
            System.out.println("(3) Sair");
            System.out.println("Escolha: ");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpar o buffer

            if (opcao == 1) {
                System.out.print("Nome da loja: ");
                String nome = sc.nextLine();
                System.out.print("Quantidade de funcionários: ");
                int qtdFunc = sc.nextInt();
                System.out.print("Salário base: ");
                double salario = sc.nextDouble();
                sc.nextLine();

                System.out.print("Nome da rua: ");
                String rua = sc.nextLine();
                System.out.print("Cidade: ");
                String cidade = sc.nextLine();
                System.out.print("Estado: ");
                String estado = sc.nextLine();
                System.out.print("País: ");
                String pais = sc.nextLine();
                System.out.print("CEP: ");
                String cep = sc.nextLine();
                System.out.print("Númeo: ");
                String numero = sc.nextLine();
                System.out.print("Complemento: ");
                String complemento = sc.nextLine();
                System.out.print("Quantidade máxima de produtos: ");
                int quantidadeMaximaProdutos = sc.nextInt();
                sc.nextLine(); // Limpar o buffer

                Endereco endereco = new Endereco(rua, cidade, estado, pais, cep, numero, complemento);

                System.out.print("Dia da fundação: ");
                int dia = sc.nextInt();
                System.out.print("Mês da fundação: ");
                int mes = sc.nextInt();
                System.out.print("Ano da fundação: ");
                int ano = sc.nextInt();

                Data dataFundacao = new Data(dia, mes, ano);

                loja = new Loja(nome, qtdFunc, salario, endereco, dataFundacao, quantidadeMaximaProdutos);

            } else if (opcao == 2) {
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                sc.nextLine();

                System.out.print("Dia da validade: ");
                int dia = sc.nextInt();
                System.out.print("Mês da validade: ");
                int mes = sc.nextInt();
                System.out.print("Ano da validade: ");
                int ano = sc.nextInt();

                Data dataValidade = new Data(dia, mes, ano);

                produto = new Produto(nome, preco, dataValidade);

            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }

        // Depois de sair, verificar e imprimir
        if (produto != null) {
            Data dataReferencia = new Data(20, 10, 2023);
            if (produto.estaVencido(dataReferencia)) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }
        }

        if (loja != null) {
            System.out.println("Informações da loja:");
            System.out.println(loja);
        }

        sc.close();
    }
}