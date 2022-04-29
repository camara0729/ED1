

public class Node {
    private Integer info;
    private Node next;

    public Node (Integer info) {
        this.info = info;
    }

    public Integer getInfo() {
        return this.info;
    }

    public void setInfo(Integer info) {
        this.info = info;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
