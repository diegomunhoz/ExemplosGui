package view;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Classe inicial para demonstrar a utilização de janela e botões
 * 
 * @author JPBonfa
 * @since 27/05/2020
 */
public class TesteGui01 {

	public void iniciaGui() {
		// cria uma nova instancia de tela e atribui o titulo
		JFrame janela = new JFrame("Minha primeira tela");

		// cria uma nova instancia de botão
		JButton botao = new JButton("Clique aqui");

		// adicionando o botao no componente janela
		janela.getContentPane().add(botao);

		// configurar o tamanho da tela
		janela.setSize(500, 300);

		// configurar a visibilidade da tela
		janela.setVisible(true);

		// informar que a tela nao tem um layout pre definido
		janela.getContentPane().setLayout(null);

	}

	public static void main(String[] args) {
		new TesteGui01().iniciaGui();
	}

}
