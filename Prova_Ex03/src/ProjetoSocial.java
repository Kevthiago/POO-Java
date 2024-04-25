public class ProjetoSocial {
    public static void main(String[] args) {
        //Instanciando objetos
        Projeto p001 = new DistribuicaoAlimentos("FomeZero", "Luta contra a fome no mundo",
                "Rua Catumbi 104", "10/07/2024", "Indeterminado", "Não perecíveis",
                1000);
        Projeto p002 = new TrabalhoVoluntario("Acolher", "Abrace essa causa!",
                "Rua Catumbi 104", "10/07/2024", "Indeterminado", "Voluntariado - braçal", 30);

        System.out.println(p001.validaProjeto("FomeZero"));
        System.out.println(p001.imprimeProjeto());
        System.out.println();
        System.out.println(p002.validaProjeto("Acolher"));
        System.out.println(p002.imprimeProjeto());
    }
}
