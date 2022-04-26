public class Cliente implements Comparable <Cliente>{

    private String cpf;
    private String nome;
    private String fone;
    private String email;

    public Cliente(String c) {
        this.cpf = c;
    }
    
    // Os demais métodos devem ser implementados pelo aluno
    
    public int compareTo (Cliente c) {
        int retorno;
        retorno = this.cpf.compareTo(c.cpf);
        return retorno;        
    }
}
