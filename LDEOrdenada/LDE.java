
public class LDE {

    private Node ultimo;
    private Node primeiro;
    private int qtd;

    public boolean isEmpty() {

        if (this.primeiro == null && qtd == 0 && this.ultimo == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserirOrdenado(Cliente c) {

        Node novo = new Node(c);

        if (this.isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Primeira inserção.");
        } 
        else if (c.compareTo(this.primeiro.getInfo()) < 0){
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        } 
        else if (c.compareTo(this.ultimo.getInfo()) > 0) {
            Node aux = this.ultimo;
            aux.setProx(novo);
            novo.setAnt(aux);
            this.ultimo = novo;
            this.qtd++;
        }
        else {
            Node aux = this.ultimo;
            aux.setProx(novo);
            novo.setAnt(aux);
            this.ultimo = novo;
            this.qtd--;
        }
        System.out.println("Cliente inserido");
    }

    public void inserirFinal(Cliente c) {
       
        Node novo = new Node(c);

        if (isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            System.out.println("Primeira inserção.");
        } else if (qtd == 1) {
            this.primeiro.setProx(novo);
            novo.setAnt(this.primeiro);
            this.ultimo = novo;
        } else {
            Node aux = ultimo;
            aux.setProx(novo);
            novo.setAnt(aux);
            this.ultimo = novo;
        }
        System.out.println("Cliente inserido");
        this.qtd++;
    }

    public void removerInicio() {
        
        if (isEmpty()) {
            System.out.println("Nada pra remover po");
            return;
        } 
        else if (qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
        } 
        else {
            Node aux = this.primeiro.getProx();
            aux.setAnt(null);
            this.primeiro = aux;
        }

        this.qtd--;
    }

    public void removerFinal() {
        if (isEmpty()) {
            System.out.println("A lista ta vazia po");
            return;
        } 
        else if (qtd == 1) {
            this.primeiro = null;
            this.ultimo = null;
        } 
        else {
            Node aux = ultimo.getAnt();
            aux.setProx(null);
        }

        System.out.println("Cliente removido.");

        this.qtd--;
    }

    public void exibirLista() {

        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem clientes cadastrados!");
        } else {
            aux = this.primeiro;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getProx();
            }
        }
    }

    public void exibirContrario() {
        Node aux;
        if (this.isEmpty() == true) {
            System.out.println("Não existem clientes cadastrados!");
        } else {
            aux = this.ultimo;
            while (aux != null) {
                System.out.println(aux.getInfo());
                aux = aux.getAnt();
            }
        }
    }
}