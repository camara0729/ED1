import java.util.Scanner;
public class LSEComDescritor {
public static void main(String[] args) {
        LSE listaAlunosP1 = new LSE();
        try (Scanner in = new Scanner (System.in)) {
            char op;
            Aluno aluno;
            String matr;
            do {
                exibirMenu();
                op = in.next().charAt(0); in.nextLine();
                switch(op) {
                    case '1': System.out.print("Qual a matrícula do aluno? ");
                              matr = in.nextLine();
                              aluno = new Aluno(matr);
                              listaAlunosP1.inserirInicio(aluno);
                              break;
                    case '2' : listaAlunosP1.removerPrimeiro();
                               break;
                    case '3' : System.out.print("Qual a matrícula do aluno? ");
                              matr = in.nextLine();
                              aluno = new Aluno(matr);
                              listaAlunosP1.inserirFinal(aluno);
                              break;
                    case '4' : listaAlunosP1.removerUltimo();
                               break;
                    case '5' : listaAlunosP1.exibirLista();
                               break;
                    case '6' : System.out.println("Qual a matrícula do aluno?");
                               matr = in.nextLine();
                               listaAlunosP1.remover(matr);
                    case '0' : System.out.println("Bye bye!");
                               break;
                    default: System.out.println("Opção inválida!");
                }            
            } while (op != '0');
        }                
    }
     
    public static void exibirMenu() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um novo aluno no início");
        System.out.println("2 - Remover aluno no início da lista");
        System.out.println("3 - Cadastrar um novo aluno no final");
        System.out.println("4 - Remover aluno do final da lista");
        System.out.println("5 - Exibir alunos da turma");
        System.out.println("6 - Remover aluno pela matrícula");
        System.out.println("0 - Sair do programa");
        System.out.print("Informe a opção desejada: ");
    }
}