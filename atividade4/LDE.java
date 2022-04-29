

public class LDE<Node> {
    
    private Node ultimo;
    private Node primeiro;
    private int qtd;

    public boolean isEmpty() {
        if (this.ultimo == null && this.primeiro == null && this.qtd == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public LDE intersecao(LDE lista2) {

        LDE lista = new LDE();
        if (lista2.isEmpty() || isEmpty()) {
            System.out.println("Algumas das listas estão vazias!");
            return null;
        }
        else {
            
        }
        return null;
    }
}
