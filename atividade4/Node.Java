public class Node {
    
    private Node ant;
    private Node prox;
    private User info;
    
    public Node (User u) {
        this.info = u;
    }

    public void setAnt (Node novoAnt) {
        this.ant = novoAnt;
    }

    public Node getAnt () {
        return this.ant;
    }

    public void setProx (Node novoProx) {
        this.prox = novoProx;
    }

    public Node getProx () {
        return this.prox;
    }

    public void setInfo (Node novoInfo) {
        this.info = novoInfo;
    }

    public Node getInfo () {
        return this.info;
    }
}