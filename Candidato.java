public class Candidato {
    private int numero;
    private String nome;
    private int votos;

    public Candidato(int numero, String nome) {
        this.numero = numero;
        this.nome = nome;
        this.votos = 0;
    }

    public void votar() {
        this.votos++;
    }

    // setters

    public void setNumero(int novoNumero) {
        this.numero = novoNumero;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

   public void setVotos (int novoVotos) {
        this.votos = novoVotos;
    }
    // getters

    public int getNumero() {
        return this.numero;
    }

    public String getNome() {
        return this.nome;
    }

    public int getVotos() {
        return this.votos;
    }

  public String toString(){
    return this.nome + "|" + this.numero + "|" + this.votos;
  }
}