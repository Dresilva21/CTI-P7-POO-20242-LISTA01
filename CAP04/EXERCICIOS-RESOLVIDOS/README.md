## Como Executar
## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes itens instalados no seu sistema:

1. **Java Development Kit (JDK):**
   - Necessário para compilar e executar o projeto.
   - Baixe a versão 8 ou superior em: [Download do JDK](https://www.oracle.com/java/technologies/javase-downloads.html)
   - Verifique a instalação no terminal executando:

2. **Git:**
   - Usado para clonar o repositório.
   - Baixe o Git em: [Download do Git](https://git-scm.com/)
   - Verifique a instalação no terminal executando:
    git --version
     

3. (Opcional) Uma **IDE** como IntelliJ IDEA, Eclipse ou VS Code para facilitar o desenvolvimento.

---

## Passo a Passo

### 1. Clonar o Repositório

Abra o terminal no seu computador e execute o comando abaixo para clonar o projeto:


git clone <URL_DO_REPOSITORIO>
Substitua <URL_DO_REPOSITORIO> pela URL do repositório GitHub onde o projeto está armazenado.

### 2. Navegar até o Diretório do Projeto
Após clonar o repositório, entre no diretório do projeto com o seguinte comando:



cd <NOME_DO_DIRETORIO>
Substitua <NOME_DO_DIRETORIO> pelo nome do diretório criado pelo comando git clone.

### 3. Localizar o Código Principal
O código principal está localizado no seguinte caminho dentro do projeto:
src/edu/br/principal
Certifique-se de verificar se os arquivos .java estão presentes nesse diretório.

### 4. Compilar o Projeto
Para compilar o projeto, execute o seguinte comando no terminal:
javac -d bin src/edu/br/principal/*.java
Este comando compila todos os arquivos .java dentro do diretório src/edu/br/principal.
O parâmetro -d bin especifica que os arquivos compilados serão armazenados na pasta bin.

### 5. Executar o Programa
Depois de compilar o projeto, você pode executar o programa principal com o seguinte comando:
java -cp bin edu.br.principal.NomeDoArquivoPrincipal
Substitua NomeDoArquivoPrincipal pelo nome da classe que contém o método main.

