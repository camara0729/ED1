

public class Index {
    
    private Node first;
    private Node last;
    private int size;

    public boolean isEmpty() {
        
        if (this.first == null && this.last == null && this.size == 0) {
            return true;
        }
        return false;
    }

    public void addFirst(int value) {
        Node newest = new Node(value);
        
        if(this.isEmpty()) {
            this.first = newest;
            this.last = newest;
            this.size++;
            this.last.setNext(this.first);
        } 
        else {
            newest.setNext(this.first);
            this.first = newest;
            this.size++;
            this.last.setNext(this.first);
        }
    }

    public void removeFirst() {

        if(this.isEmpty()) {
            System.out.println("Don't exist any movie");
        }
        else if (this.size == 1) {
            this.first = null;
            this.last = null;
            this.size = 0;
            System.out.println("Movie removed");
        }
        else {
            this.first = this.first.getNext();
            this.size--;
            this.last.setNext(this.first);
            System.out.println("Movie removed");
        }
    }

    public void showList() {
        Node auxFirst = this.first;

        if(this.isEmpty()) {
            System.out.println("Don't exist any movie");
        }
        else {
            for(int i = 0; i < this.size; i++) {
                System.out.println(auxFirst.getInfo());
                auxFirst.getNext();
            }
        }
    }
}
