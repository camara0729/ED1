
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

    public Node buscaMelhorada (Cliente c){
        Node aux;
        int comparar;
        if (this.isEmpty()){
            return null;
        }
        else {
            aux = this.primeiro;
            while (aux != null) {
                comparar = c.compareTo(aux.getInfo());
                if(comparar == 0) {
                    return aux;
                }
                else if(comparar > 0) {
                    return null;
                }
                else {
                   aux = aux.getProx(); 
                }
            }
        }
        return null; // maior que o último
    }

    public void inserirOrdenado(Cliente c) {

        Node novo = new Node(c);

        if (this.isEmpty()) {
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
            System.out.println("Primeira inserção!");
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
            Node aux = this.primeiro;
            while (aux != null) {
                if (c.compareTo(aux.getInfo()) < 0) {
                    novo.setAnt(aux.getAnt());
                    novo.setProx(aux);
                    aux.getAnt().setProx(novo);
                    aux.setAnt(novo);
                    this.qtd++;
                }
                else {
                    aux = aux.getProx();
                }
            }
        }
        System.out.println("Cliente inserido");
    }

    /*public void inserirFinal(Cliente c) {
       
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
    }*/
    
    public void removerOrdenado(Cliente c) {
        Node aux, anterior, proximo;
        if (this.isEmpty()) {
            System.out.println("Lista vazia!");
        }
        else if (this.qtd == 1) {
            if (c.compareTo (this.primeiro.getInfo()) == 0) {
                this.primeiro = null;
                this.ultimo = null;
                this.qtd = 0;
                System.out.println("Remoção efetuada!");
            }
            else {
                System.out.println("Valor não pertence à lista!");
            }
        }
        else {
            aux = this.buscaMelhorada(c);
            if (aux == null) {
                System.out.println("Valor não pertence à lista");
            }
            else {
                if (aux == this.primeiro) {
                    this.primeiro = this.primeiro.getProx();
                    this.primeiro.setAnt(null);
                    this.qtd--;
                }
                else if (aux == this.ultimo) {
                    this.ultimo = this.ultimo.getAnt();
                    this.ultimo.setProx(null);
                    this.qtd--;
                }
                else {
                    anterior = aux.getAnt();
                    proximo = aux.getProx();
                    anterior.setProx(proximo);
                    proximo.setAnt(anterior);
                    this.qtd--;
                }
                System.out.println("Remoção efetuada!");
            }
        }
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