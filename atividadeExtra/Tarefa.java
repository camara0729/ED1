public class Tarefa implements Comparable <Tarefa>{

    private String cpf;
    private String nome;
    private String fone;
    private String email;

    public Tarefa (String t) {
        this.cpf = t;
    }
    
    // Os demais métodos devem ser implementados pelo aluno
    
    public int compareTo (Tarefa t) {
        int retorno;
        retorno = this.cpf.compareTo(t.cpf);
        return retorno;        
    }
}
