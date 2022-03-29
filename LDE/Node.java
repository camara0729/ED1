public class Node {
    
    private Node ant;
    private Node prox;
    private Cliente info;

    public Node (Cliente c){
        this.info = c;
    }

    public void setAnt (Node novoAnt){
        this.ant = novoAnt;
    }

    public void setProx (Node novoProx){
        this.ant = novoProx;
    }
    
    public void setInfo (Cliente valor){
        this.info = valor;
    }

    public Node getAnt(){
        return this.ant;
    }

    public Node getProx(){
        return this.prox;
    }

    public Cliente getInfo(){
        return this.info;
    }


}

