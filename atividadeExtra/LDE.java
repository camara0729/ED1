public class LDE { 
    private Node primeiro;
    private int qtd;
    private Node ultimo;
    
    public boolean isEmpty () {
        if (this.primeiro == null && this.qtd == 0 && this.ultimo == null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public Node buscaMelhorada (Cliente c) {
        Node aux;
        int retorno;
        if (this.isEmpty() == true) {
            return null;
        }
        else {
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(c);
                if (retorno == 0) {
                    return aux;
                }
                else if (retorno > 0) {
                    return null;
                }
                else {
                    aux = aux.getProx();
                }            
            }
            return null;
        }
    }
    
    public void inserirOrdenado (Cliente c) {
        Node novo = new Node (c);
        Node aux, anterior;
        int retorno;
        if (this.isEmpty() == true) { 
            this.primeiro = novo;
            this.ultimo = novo;
            this.qtd++;
        }
        else if (c.compareTo(this.primeiro.getInfo()) < 0) { 
            novo.setProx(this.primeiro);
            this.primeiro.setAnt(novo);
            this.primeiro = novo;
            this.qtd++;
        }
        else if (c.compareTo(this.ultimo.getInfo()) > 0) { 
            this.ultimo.setProx(novo);
            novo.setAnt(this.ultimo);
            this.ultimo = novo;
            this.qtd++;
        }
        else { 
            aux = this.primeiro;
            while (aux != null) {
                retorno = aux.getInfo().compareTo(c);
                if (retorno == 0) {
                    System.out.println("Valor repetido. Inserção não efetuada!");
                    return;
                }
                else if (retorno > 0) {
                    anterior = aux.getAnt();
                    novo.setAnt(anterior);
                    novo.setProx(aux);
                    anterior.setProx(novo);
                    aux.setAnt(novo);
                    this.qtd++;
                    System.out.println("Valor inserido com sucesso!!");
                    return;
                }
                else {
                    aux = aux.getProx();
                }                
            }
        }
    }

    public void removerOrdenado (Cliente c) {
        Node retorno, anterior, proximo;
        if (this.isEmpty() == true) { 
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
                System.out.println("Valor não pertence a lista");
            }            
        }
        else { 
            retorno = this.buscaMelhorada (c);
            if (retorno == null) {
                System.out.println("Valor não pertence a lista");
            }
            else { 
                if (retorno == this.primeiro) {
                    this.primeiro = this.primeiro.getProx();
                    this.primeiro.setAnt(null);
                }
                else if (retorno == this.ultimo) {
                    this.ultimo = this.ultimo.getAnt();
                    this.ultimo.setProx(null);
                }
                else {
                   anterior = retorno.getAnt();
                   proximo = retorno.getProx();
                   anterior.setProx(proximo);
                   proximo.setAnt(anterior);
                }
                this.qtd--;
                System.out.println("Remoção efetuada!");
            }
        }        
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
}
