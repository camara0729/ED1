import javax.print.DocFlavor.STRING;

public class Cliente {
    
    private String cpf;
    private String nome;
    private String fone;

    public Cliente(String cpf, String nome, String fone) {
        
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;

    }

    public String toString () {
        return this.cpf + " " + this.nome + " " + this.fone;
    }
}
