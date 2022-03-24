public class Aluno {
    private String matr;
    private String nome;
    private double media;
    private int faltas;
   
    // método construtor
    public Aluno (String matr, String nome) {
        this.matr = matr;
        this.nome = nome;
    }
   
    public Aluno (String matr) {
        this.matr = matr;
    }
   
    // métodos get e set
   
    public void setMatr (String matr) {
        this.matr = matr;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }    

    public void setMedia (double media) {
        this.media = media;
    }
   
    public void setFaltas (int faltas) {
        this.faltas = faltas;
    }
   
    public String getMatr() {
        return this.matr;
    }
   
    public String getNome() {
        return this.nome;
    }
   
    public double getMedia() {
        return this.media;
    }
   
    public int getFaltas() {
        return this.faltas;
    }
       
    // método toString
    public String toString () {
        return this.matr + " " + this.nome + " " + this.media + " " + this.faltas;
    }

    public boolean equals (Aluno al) {
        if (this.matr.equals(al.matr) == true) {
            return true;
        }
        else {
           return false;
        }
    }    
}