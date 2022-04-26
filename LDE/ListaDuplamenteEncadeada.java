import java.util.Scanner;
public class ListaDuplamenteEncadeada {
public static void main(String[] args) {
        LDE listaClientes = new LDE();
        try (Scanner in = new Scanner (System.in)) {
            char op;
            Tarefa cliente;
            String nome;
            String cpf;
            String fone;
            do {
                exibirMenu();
                op = in.next().charAt(0); in.nextLine();
                switch(op) {
                    case '1': System.out.print("Insira o CPF do cliente: ");
                              cpf = in.nextLine();
                              System.out.print("Insira o nome do cliente: ");
                              nome = in.nextLine();
                              System.out.print("Insira o número telefônico do cliente: ");
                              fone = in.nextLine();
                              cliente = new Tarefa(cpf, nome, fone);
                              listaClientes.inserirInicio(cliente);
                              break;
                    case '2': listaClientes.exibirLista();
                              break;

                    default: System.out.println("Opção inválida!");
                }            
            } while (op != '0');
        }                
    }
     
    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um novo cliente no início");
        System.out.println("2 - Exibir lista de clientes");
    }
}