public class Personagem {
    private String nome;
    private int vida;
    private int fome;
    private int sede;
    private int energia;
    private int sanidade;

    public Personagem(String nome, int vida, int fome, int sede, int energia, int sanidade){
        this.nome = nome;
        this.vida = vida;
        this.fome = fome;
        this.sede = sede;
        this.energia = energia;
        this.sanidade = sanidade;
    }

    String getNome(){
        return this.nome;
    }

    int getVida(){
        return this.vida;
    }
    int getFome(){
        return this.fome;
    }
    int getSede(){
        return this.sede;
    }
    int getEnergia(){
        return this.energia;
    }
    int getSanidade(){
        return this.sanidade;
    }

    void setVida(int vida){
        this.vida = vida;
    }
    void setFome(int fome){
        this.fome = fome;
    }
    void setSede(int sede){
        this.sede = sede;
    }
    void setEnergia(int energia){
        this.energia = energia;
    }
    void setSanidade(int sanidade){
        this.sanidade = sanidade;
    }


    @Override
    public String toString(){
        return "NOME: " + this.nome + "\nVIDA: " + this.vida + "\nFOME: " +this.fome + "\nSEDE: " + this.sede + "\nENERGIA: " + this.energia + "\nSANIDADE: " + this.sanidade;

    }



}
