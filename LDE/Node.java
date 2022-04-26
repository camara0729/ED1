public class Node {
    
    private Node ant;
    private Node prox;
    private Tarefa info;

    public Node (Tarefa c){
        this.info = c;
    }

    public void setAnt (Node novoAnt){
        this.ant = novoAnt;
    }

    public void setProx (Node novoProx){
        this.ant = novoProx;
    }
    
    public void setInfo (Tarefa valor){
        this.info = valor;
    }

    public Node getAnt(){
        return this.ant;
    }

    public Node getProx(){
        return this.prox;
    }

    public Tarefa getInfo(){
        return this.info;
    }


}

