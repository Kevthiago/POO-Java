import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ApuracaoVotosGUI extends JFrame {
    // Atributos
    JPanel painel = new JPanel();
    JButton votar = new JButton("VOTAR");
    JButton exibir = new JButton("EXIBIR MAIS VOTADOS");
    JLabel text = new JLabel("Bem vindo(a) ao sistema de votação do BBB!");
    ArrayList<Jogador> jogadores = new ArrayList<>();

    // Construtor
    public ApuracaoVotosGUI() {
        // Configurações da janela
        this.setTitle("Votação BBB - Modo Eliminatório");
        this.setSize(400, 200);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().add(painel);

        // Configuração dos componentes
        configurarComponentes();
    }

    // Configuração dos componentes da interface
    public void configurarComponentes() {
        painel.setLayout(null);
        painel.setBackground(new Color(255, 255, 255));
        text.setFont(new Font("Arial", Font.BOLD, 16));

        text.setBounds(20, 10, 350, 30);
        votar.setBounds(40, 60, 300, 30);
        exibir.setBounds(40, 100, 300, 30);

        painel.add(text);
        painel.add(votar);
        painel.add(exibir);

        // Adiciona jogadores à lista
        adicionarJogadores();

        // Adiciona ação aos botões
        votar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                votarEmParticipante(jogadores);
            }
        });

        exibir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exibirMaisVotados(jogadores);
            }
        });
    }

    // Adiciona jogadores à lista
    private void adicionarJogadores() {
        // Adicione os jogadores aqui
        jogadores.add(new Jogador("Alane Dias"));
        jogadores.add(new Jogador("Beatriz Reis"));
        jogadores.add(new Jogador("Davi Brito"));
        jogadores.add(new Jogador("Deniziane Ferreira"));
        jogadores.add(new Jogador("Fernanda Bande"));
        jogadores.add(new Jogador("Giovanna Lima"));
        jogadores.add(new Jogador("Giovanna Pitel"));
        jogadores.add(new Jogador("Isabelle Nogueira"));
        jogadores.add(new Jogador("Juninho"));
        jogadores.add(new Jogador("Leidy Elin"));
        jogadores.add(new Jogador("Lucas Henrique"));
        jogadores.add(new Jogador("Lucas Luigi"));
        jogadores.add(new Jogador("Lucas Pizane"));
        jogadores.add(new Jogador("Marcus Vinicius"));
        jogadores.add(new Jogador ("Matteus Amaral"));
        jogadores.add(new Jogador ("Maycon Cosmer"));
        jogadores.add(new Jogador ("MC Bin Laden"));
        jogadores.add(new Jogador ("Michel Nogueira"));
        jogadores.add(new Jogador ("Nizam"));
        jogadores.add(new Jogador ("Raquele Cardozo"));
        jogadores.add(new Jogador ("Rodriguinho"));
        jogadores.add(new Jogador ("Thalyta Alves"));
        jogadores.add(new Jogador ("Vanessa Lopes"));
        jogadores.add(new Jogador ("Vinicius Rodrigues"));
        jogadores.add(new Jogador ("Wanessa Camargo"));
        jogadores.add(new Jogador ("Yasmin Brunet"));
    }

    // Função para votar em um participante
    private void votarEmParticipante(ArrayList<Jogador> jogadores) {
        // Mostra a lista de participantes
        StringBuilder participantes = new StringBuilder();
        participantes.append("\nLista de participantes:\n");
        for (int i = 0; i < jogadores.size(); i++) {
            participantes.append((i + 1)).append(".").append(jogadores.get(i).getNome()).append("\n");
        }
        JOptionPane.showMessageDialog(null, participantes.toString());

        try {
            // Recebe a entrada do usuário
            String entrada = JOptionPane.showInputDialog(null, "Digite o número do participante em que deseja votar para sair:");

            if (entrada != null){
                int numeroParticipante = Integer.parseInt(entrada) - 1;

                // Verifica se o número do participante é válido
                if (numeroParticipante >= 0 && numeroParticipante < jogadores.size()) {
                    jogadores.get(numeroParticipante).adicionarVotos();
                    JOptionPane.showMessageDialog(null, "Voto registrado com sucesso para " + jogadores.get(numeroParticipante).getNome() + "!");
                } else {
                    JOptionPane.showMessageDialog(null, "Número de participante inválido! Tente novamente.");
                }
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida! " + e.getMessage());
        }
    }

    // Método para exibir o participante com mais votos
    private void exibirMaisVotados(ArrayList<Jogador> jogadores) {
        Jogador maisVotado = null;
        int maiorVotos = 0;

        // Encontra o participante com mais votos
        for (Jogador jogador : jogadores) {
            int votos = jogador.getVotos();
            if (votos > maiorVotos) {
                maiorVotos = votos;
                maisVotado = jogador;
            }
        }

        // Exibe o participante com mais votos
        if (maisVotado != null) {
            JOptionPane.showMessageDialog(null, "Participante com mais votos para eliminação:\n" +
                    "Nome: " + maisVotado.getNome() + "\n" +
                    "Votos: " + maisVotado.getVotos() + "\n" +
                    "Mensagem de eliminação:\n" +
                    "                    Se eu conseguir mover montanhas, se eu conseguir surfar um tsunami, se eu conseguir\n" +
                    "                    domar o sol, se eu conseguir fazer o mar virar sertão, e o sertão virar mar, se eu\n" +
                    "                    conseguir dizer o que eu nunca vou conseguir dizer, aí terá chegado o dia em que eu\n" +
                    "                    vou conseguir te eliminar com alegria.");
        } else {
            JOptionPane.showMessageDialog(null, "Ainda não há votos registrados.");
        }
    }

    public static void main(String[] args) {
        new ApuracaoVotosGUI();
    }
}
