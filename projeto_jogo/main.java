public class main {
    public static void main(String[] args) {
        Sobrevivente sobrevivente = new Sobrevivente("Wilson",8,10,10,5,8);
        Medico medico = new Medico("Oswaldo",7,8,8,8,5);
        Rastreador rastreador = new Rastreador("Jorge",10,7,7,8,6);
        System.out.println(sobrevivente);
        System.out.println("\n" + medico);
        System.out.println("\n" + rastreador);

        System.out.println();

        medico.curar();
        rastreador.encontrar();


    }
}
