# Contador

Este é um simples programa Java que solicita dois números inteiros do usuário e, em seguida, imprime uma contagem a partir do primeiro número até o segundo número.

## Como usar

1. **Pré-requisitos:**
   - Certifique-se de ter o Java Development Kit (JDK) instalado em sua máquina.
   - Um ambiente de desenvolvimento Java configurado, como Eclipse, IntelliJ IDEA, ou simplesmente compilar via linha de comando.

2. **Executando o programa:**
   - Compile o arquivo `Contador.java` usando o comando:
     ```bash
     javac Contador.java
     ```
   - Em seguida, execute o programa compilado com:
     ```bash
     java Contador
     ```

3. **Instruções de uso:**
   - Ao executar o programa, você será solicitado a inserir dois números inteiros.
   - O programa então tentará contar a partir do primeiro número até o segundo número.
   - Se o primeiro número for maior que o segundo, uma exceção será lançada e uma mensagem de erro será exibida.

## Estrutura do projeto

- `Contador.java`: Contém a classe principal do programa.
- `ParametrosInvalidosException.java`: Define uma exceção personalizada que é lançada quando os parâmetros inseridos são inválidos.

## Exceções

- O programa utiliza uma exceção personalizada `ParametrosInvalidosException`, que é lançada se o primeiro parâmetro for maior que o segundo.
