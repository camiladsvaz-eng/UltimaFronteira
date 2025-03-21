public class Medico extends Personagem{
    public Medico(String nome, int vida, int fome, int sede, int energia, int sanidade){
        super(nome,vida,fome,sede,energia,sanidade);
}
    public void curar(){
        System.out.println("O médico " + this.getNome() + " se curou.");
    }
}
