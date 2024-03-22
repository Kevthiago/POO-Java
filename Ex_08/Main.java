public class Main {
    public static void main(String[] args) {
        int diasAtraso = 0; // Atribuir um valor para diasAtraso

        // Instanciando objetos
        Material livro1 = new Material("1984", 2018);
        Material revista1 = new Material("ISTOÉ", 2024);

        Emprestimo teste1 = new LongoPrazo(2, 5);
        Emprestimo teste2 = new CurtoPrazo(1.5, 8);

        double multa = teste1.calcularMulta(diasAtraso);
        System.out.println("Multa pelo material " + livro1.getTitulo() + ", publicado em "
                + livro1.getAnoPublicacao() + ", no valor de R$" + multa + " reais devido ao atraso.");

        double multa2 = teste2.calcularMulta(diasAtraso);
        System.out.println("Multa pelo material " + revista1.getTitulo() + ", publicado em "
                + revista1.getAnoPublicacao() + ", no valor de R$" + multa2 + " reais devido ao atraso.");
    }
}