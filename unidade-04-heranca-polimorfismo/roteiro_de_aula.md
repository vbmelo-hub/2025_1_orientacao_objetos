# ☕♨ Unidade Temática #4: roteiro de aula de refatoração de código  

>> 📅 Sexta-feira, 20/6/2025 


## Melhorias no projeto empresa

A classe Aplicacao está fazendo entrada e saída de dados, controle de fluxo e lógica de interface textual. Isso não está de acordo com o princípio da responsabilidade única.

### Como corrigir
>> 🔄 Criar uma classe chamada MenuInterativo responsável apenas por exibir menus e capturar entradas do usuário. Adicionar um pacote chamado ui (User Interface) para abrigar a classe MenuInterativo.

### O que será feito
- Criar o pacote **ui**;
- Adicionar a classe **MenuInterativo** no pacote ui;
- Fazer ajustes na classe **Aplicacao**.

#### Classe MenuInterativo
> Delcaração da classe e criação das variáveis de leitura e do tipo Servico;
```java
public class MenuInterativo {
    private Scanner teclado;
    private Servico servico;

    public MenuInterativo(Servico servico) {
        this.teclado = new Scanner(System.in);
        this.servico = servico;
    }
}
```

> Método exibir: ler a opção, mostra o menu e trata os casos. A forma que o switch é implementado requer Java 14 ou superior.
```java
    public void exibir() {
        byte opcao;
        do {
            imprimirMenu();
            opcao = Byte.parseByte(teclado.nextLine());

            switch (opcao) {
                case 0 -> System.out.println("Você escolheu sair do sistema.");
                case 1 -> cadastrarDepartamento();
                case 2 -> removerDepartamento();
                case 3 -> cadastrarFuncionario("funcionario");
                case 4 -> cadastrarFuncionario("gerente");
                case 5 -> cadastrarFuncionario("diretor");
                case 6 -> removerFuncionario();
                case 7 -> transferirFuncionario();
                case 8 -> listarFuncionariosDepartamento();
                case 9 -> System.out.println(servico.listarFuncionarios());
                default -> System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
        teclado.close();
    }
```

> Criação o método imprimirMenu, usando a classe StringBuilder
```java
private void imprimirMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("\n============================================\n");
        menu.append("Escolha uma opção:\n");
        menu.append("1. Cadastrar departamento\n");
        menu.append("2. Remover departamento\n");
        menu.append("3. Cadastrar funcionário\n");
        menu.append("4. Cadastrar gerente\n");
        menu.append("5. Cadastrar diretor\n");
        menu.append("6. Remover funcionário\n");
        menu.append("7. Transferir funcionário de departamento\n");
        menu.append("8. Listar funcionários de um departamento\n");
        menu.append("9. Listar todos os funcionários\n");
        menu.append("0. Sair do sistema\n");
        System.out.println(menu);
    }
```

> Méotodos para cadastrar e remover departamentos
```java
    private void cadastrarDepartamento() {
        System.out.print("Nome do departamento: ");
        String nome = teclado.nextLine();
        System.out.print("ID do departamento: ");
        String id = teclado.nextLine();
        System.out.println(servico.cadastrarDepartamento(nome, id));
    }

    private void removerDepartamento() {
        System.out.print("ID do departamento: ");
        String id = teclado.nextLine();
        System.out.println(servico.removerDepartamento(id));
    }
``` 

> Método para cadastrar funcionários. O método tem um tipo, do tipo string, que serve para decidir se é um funcionário, um gerente, um diretor etc. 
```java
    private void cadastrarFuncionario(String tipo) {
        System.out.print("Nome do " + tipo + ": ");
        String nome = teclado.nextLine();
        System.out.print("CPF do " + tipo + ": ");
        String cpf = teclado.nextLine();
        System.out.print("ID do departamento de lotação: ");
        String idDepartamento = teclado.nextLine();
        System.out.print("Salário: ");
        double salario = Double.parseDouble(teclado.nextLine());
        System.out.println(servico.cadastrarFuncionario(nome, cpf, salario, idDepartamento, tipo));
    }
```
_Observação: é necessário tratar o argumento recebido (com switch, por exemplo) no método que cadastra funcionário na classe Servico._

> Métodos para transferir funcionário de departamento e para exibir todos os funcionários de um departamento
```java
    private void transferirFuncionario() {
        System.out.print("Matrícula do funcionário: ");
        String matricula = teclado.nextLine();
        System.out.print("ID do departamento de origem: ");
        String idOrigem = teclado.nextLine();
        System.out.print("ID do departamento de destino: ");
        String idDestino = teclado.nextLine();
        System.out.println(servico.trasferirFuncionarioDepartamento(matricula, idOrigem, idDestino));
    }

    private void listarFuncionariosDepartamento() {
        System.out.print("ID do departamento: ");
        String id = teclado.nextLine();
        System.out.println(servico.listarFuncionariosDepartamento(id));
    }
```

> Classe Aplicacao
```java
public class Aplicacao {
    public static void main(String[] args) {
        Servico servico = new Servico();
        MenuInterativo menu = new MenuInterativo(servico);
        menu.exibir();
    }
}
``` 