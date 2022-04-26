public class LDE {

    private Node ultimo;
    private Node primeiro;
    private int qtd;

    public boolean isEmpty() {

        if (this.primeiro == null & qtd == 0 & this.ultimo == null) {
            return true;
        }
        else{
            return false;
        }
    }

    public void inserirInicio(Tarefa c) {

        Node novo = new Node(c);
        Node aux;

        if (this.isEmpty() == true) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Não existem clientes cadastrados!");
        }
        else {

            aux = this.primeiro;
            novo.setProx(aux); 
            aux.setAnt(novo);
            aux = novo;
            this.qtd++;
        }
        System.out.println("Cliente inserido!");
    }

    public void exibirLista() {
        
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem clientes cadastrados!");
        } 
        else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }
}