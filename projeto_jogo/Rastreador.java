public class Rastreador extends Personagem {
    public Rastreador(String nome, int vida, int fome, int sede, int energia, int sanidade) {
        super(nome, vida, fome, sede, energia, sanidade);

    }
    public void encontrar(){
        System.out.println("O rastreador " + this.getNome() + " encontrou comida e água.");
    }

}
