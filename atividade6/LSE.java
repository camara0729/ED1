// Classe LSE

import java.util.Scanner;

public class LSE {

    private Node primeiro;
    private int qtd;
    private Node ultimo;

    public boolean isEmpty() { // está vazia??
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }
    public LSE intersecao (LSE lista){
        LSE lista1 = new LSE();
        LSE lista2 = new LSE();
        
        ultimo.setProx(lista2.primeiro);
        ultimo = lista2.ultimo;
        qtd += lista2.qtd;

        LSE lista3 = lista1.intersecao (lista2);
        return lista3;        
    }
    public void alterarInfo (String matr){
        try (Scanner in = new Scanner (System.in)) {
            Node aux;
            Aluno al;
            String nome;
            double media;
            int faltas;
            aux = this.buscar (matr);
            if (aux == null) {
                System.out.println("Matrícula inexistente!!!");
            }
            else {
                al = aux.getInfo();
                System.out.println("Aluno encontrado");
                System.out.print("Informe o nome do aluno: ");
                nome = in.nextLine();
                al.setNome(nome);
                System.out.print("Informe a média do aluno: ");
                media = in.nextDouble(); in.nextLine();
                al.setMedia(media);
                System.out.print("Informe as faltas do aluno: ");
                faltas = in.nextInt(); in.nextLine();
                al.setFaltas(faltas);
                System.out.println("Alterações efetuadas!");
            }
        }
    }
   
    private Node buscar(String matr) {
        Node aux;
        if (this.isEmpty() == true) {
            return null;
        } else {
            Aluno proc = new Aluno(matr);
            aux = this.primeiro;
            while (aux != null) {
                if (aux.getInfo().equals(proc) == true) {
                    return aux;
                } else {
                    aux = aux.getProx();
                }
            }
            return null;
        }
    }

    public void inserirFinal(Aluno al) {
        Node novo = new Node(al);
        Node aux;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção efetuada com sucesso!!!");
        } else {
            aux = this.buscar(al.getMatr());
            if (aux == null) {
                this.ultimo.setProx(novo);
                this.ultimo = novo;
                this.qtd++;
                System.out.println("Inserção efetuada com sucesso!!!");
            } else {
                System.out.println("Valor repetido. Não pode inserir.");
            }
        }
    }

    public void inserirInicio(Aluno al) {
        Node novo = new Node(al);
        Node aux;
        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Inserção efetuada com sucesso!!!");
        } else {
            aux = this.buscar(al.getMatr());
            if (aux == null) {
                novo.setProx(this.primeiro);
                this.primeiro = novo;
                this.qtd++;
                System.out.println("Inserção efetuada com sucesso!!!");
            } else {
                System.out.println("Valor repetido. Não pode inserir.");
            }            
        }
    }

    public void exibirLista() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem alunos cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void removerPrimeiro() {
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
            System.out.println("Remoção efetuada!");
        } else {
            this.primeiro = this.primeiro.getProx();
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
    }

    public void removerUltimo() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!");
        } else if (this.qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
            this.qtd = 0;
            System.out.println("Remoção efetuada!");
        } else {
            aux = this.primeiro;
            while (aux.getProx() != this.ultimo) {
                aux = aux.getProx();
            }
            aux.setProx(null);
            this.ultimo = aux;
            this.qtd--;
            System.out.println("Remoção efetuada!");
        }
    }

    public void remover(String matr){

        Aluno proc = new Aluno (matr);
        if (this.isEmpty() == true) {
            System.out.println("Lista vazia!!");
        }
        // Um único elemento
        else if(this.qtd == 1){
            if(proc.equals(this.primeiro.getInfo())){
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
                System.out.println("Remoção efetuada!");         
            }
            else{
                System.out.println("Não encontrado");
            }
        }
        // Mais de um elemento
        else{
            Node anterior2 = this.primeiro;
            if (proc.equals(this.primeiro.getInfo())){
                while(anterior2.getProx() != this.ultimo){
                    anterior2 = anterior2.getProx();
                }
                anterior2.setProx(null);
                this.ultimo = anterior2;
                this.qtd--;
            }
            else if(proc.equals(this.primeiro.getInfo())){
                this.primeiro = this.primeiro.getProx();
                this.qtd--;
                System.out.println("Remoção efetuada!");
            }
            // "meio da lista"
            else{
                Node anterior = this.primeiro;
                Node atual = anterior.getProx();

                while( atual != null){
                    if(proc.equals(atual.getInfo())){
                        anterior.setProx(atual.getProx());
                        this.qtd--;
                        System.out.println("Remoção efetuada!");
                        break;
                    }
                    else{
                        atual = atual.getProx();
                        anterior = anterior.getProx();
                    }
                }
            }
        }
    }
}