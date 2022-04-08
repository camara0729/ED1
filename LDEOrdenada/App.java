import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        LDE listaClientes = new LDE();
        try (Scanner in = new Scanner (System.in)) {
            char op;
            Cliente cliente;
            String cpf, nome, fone, email;
            do {
                exibirMenu();
                op = in.next().charAt(0); in.nextLine();
                switch(op) {
                    case '1': System.out.print("Informe o CPF do cliente: ");
                              cpf = in.nextLine();
                              System.out.print("Informe o nome do cliente: ");
                              nome = in.nextLine();
                              cliente = new Cliente(cpf, nome);
                              listaClientes.inserirOrdenado(cliente);
                              break;
                    case '2' : listaClientes.exibirLista();
                               break;
                    case '0' : System.out.println("Bye bye!");
                               break;
                    default: System.out.println("Opção inválida!");
                }            
            } while (op != '0');
        }                
    }
     
    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um novo cliente na lista");
        System.out.println("2 - Exibir todos os clientes cadastrados");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }
}

