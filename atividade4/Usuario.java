import java.util.Scanner;

public class Usuario implements Comparable <Usuario> {

    private String id;

    public Usuario(String id) {
        this.id = id;
    }

    @Override
    public int compareTo(Usuario u) {
        return this.id.compareTo(u.getId());
    }

    public String getId() {
        return this.id;
    }
    
    public String setId(String id) {
        return this.id = id;
    }

    @Override
    public String toString() {
        return "Usuário [id= " + id + "]"; 
    }
}
