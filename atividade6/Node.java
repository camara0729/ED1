public class Node {
    private Aluno info;
    private Node prox;
    public Node (Aluno al) { // construtor
        this.info = al;
    }
    public void setInfo (Aluno al) {
        this.info = al;
    }
    public Aluno getInfo () {
        return this.info;
    }
    public void setProx (Node novoProx) {
        this.prox = novoProx;
    }
    public Node getProx () {
        return this.prox;
    }    
}