
# 🛒 Projeto: Gerenciador de Shopping (Laboratório de Programação I)

Este repositório contém o projeto desenvolvido como parte do desafio prático da disciplina **Laboratório de Programação I**, cujo objetivo foi aplicar conceitos de **POO (Programação Orientada a Objetos)** em Java.

## 👨‍💻 Sobre o Projeto

O projeto simula a estrutura de um shopping, com foco no gerenciamento de **lojas**, **produtos** e um **shopping center** que agrupa várias lojas.

O desenvolvimento seguiu as seguintes etapas:

### ✅ Etapa 1: Estrutura Básica de Classes
- Criação das classes principais: `Loja`, `Produto`, `Data` e `Endereco`.
- Definição de atributos básicos e seus getters e setters.

### ✅ Etapa 2: Associação entre Classes
- Inclusão de relacionamentos entre as classes: Loja possui um endereço e uma data de fundação, Produto possui uma data de validade.
- Implementação de métodos com regras de negócio como o `estaVencido()` na classe `Produto`.

### ✅ Etapa 3: Herança e Polimorfismo
- Criação de subclasses de `Loja`, representando tipos específicos:
  - `Cosmetico`
  - `Vestuario`
  - `Bijuteria`
  - `Alimentacao`
  - `Informatica`
- Sobrescrita de métodos como `toString()`.

### ✅ Etapa 4: Arrays e Agregação
- Criação do array de produtos dentro de `Loja` (estoque).
- Implementação de métodos como:
  - `insereProduto()`
  - `removeProduto()`
  - `imprimeProdutos()`
- Criação da classe `Shopping`, que agrega várias lojas.

---

## 🚀 Como Executar

### Pré-requisitos:
- Java JDK 17 ou superior.
- Um ambiente de desenvolvimento (ex.: VSCode, Eclipse ou IntelliJ).

### Passos:
1. Clone o repositório:
   ```bash
   git clone https://github.com/AlanJns/GerenciadorShopping.git
   ```
2. Compile os arquivos `.java`:
   ```bash
   javac *.java
   ```
3. Execute a classe `Principal` ou um dos validadores:
   ```bash
   java Principal
   ```

---

## 📄 Estrutura de Arquivos

```
📂 GerenciadorShopping
├── Alimentacao.java
├── Bijuteria.java
├── Cosmetico.java
├── Data.java
├── Endereco.java
├── Informatica.java
├── Loja.java
├── Principal.java
├── Produto.java
├── Shopping.java
├── Vestuario.java
├── ValidadorEtapa1.java
├── ValidadorEtapa2.java
├── ValidadorEtapa3.java
├── ValidadorEtapa4.java
```

---

## ✅ Resultado Final

O projeto foi apresentado em vídeo conforme as diretrizes da disciplina. Todos os requisitos das etapas foram implementados e validados com sucesso.

---

## 👤 Autor

- **Alan Jones**
- [LinkedIn]: https://www.linkedin.com/in/alan-jones-ti

---

## 📚 Tecnologias utilizadas

- Java (JDK 17)
- VSCode com Extensão Java

---

## 🏅 Licença
Projeto acadêmico. Livre para fins de estudo.
