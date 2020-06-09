package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * Classe para demonstrar a utilização de janela, botões, rotulo e campo de
 * texto
 * 
 * @author JPBonfa
 * @since 27/05/2020
 */
public class TesteGui02 {

	public void iniciaGui() {
		// definir a tela e suas caracteristicas
		JFrame janela = new JFrame();
		janela.setTitle("Tela 02");
		janela.setSize(300, 200);
		janela.getContentPane().setLayout(null);
		janela.setLocationRelativeTo(null);// comando para centralizar a janela

		// definir o componente JButton(botão)
		JButton botao = new JButton();
		botao.setText("clique aqui");
		botao.setBounds(10, 60, 100, 20);// informa as cordenadas(de cima para
											// baixo , da esquerda para direita
											// , largura do botao, altura do
											// botao

		// definir o componente JLabel(rottulo)
		JLabel lbNome = new JLabel();
		lbNome.setText("Nome:");
		lbNome.setBounds(10, 10, 40, 20);

		// definir o componente JTextField(Campo para digitação)
		JTextField tfNome = new JTextField();
		tfNome.setBounds(50, 10, 150, 20);

		// adicionar os componentes na janela
		janela.getContentPane().add(lbNome);
		janela.getContentPane().add(tfNome);
		janela.getContentPane().add(botao);

		// definindo a visibilidade da tela
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		new TesteGui02().iniciaGui();
	}

}
