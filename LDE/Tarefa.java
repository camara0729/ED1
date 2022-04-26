import javax.print.DocFlavor.STRING;

public class Tarefa {
    
    private String cpf;
    private String nome;
    private String fone;

    public Tarefa(String cpf, String nome, String fone) {
        
        this.cpf = cpf;
        this.nome = nome;
        this.fone = fone;

    }

    public String toString () {
        return this.cpf + " " + this.nome + " " + this.fone;
    }
}
