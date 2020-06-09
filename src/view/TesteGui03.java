package view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Classe para demonstrar a utilização de janela, textArea, botões e suas ações
 * 
 * @author JPBonfa
 * @since 27/05/2020
 */
public class TesteGui03 {

	// declaraçao dos componentes utilizados na tela
	private JFrame janela;
	private JButton botao1;
	private JButton botao2;
	private JTextField campo;
	private JTextArea area;

	public void iniciaGui() {
		// cria a instancia da janela
		janela = new JFrame();
		janela.setTitle("exemplo de ação button!");

		// cria a instancia da area de texto
		area = new JTextArea();

		// cria instancia do primeiro botao
		botao1 = new JButton("clique aqui");

		// configurando a acao quando clicar no botao
		botao1.addActionListener(new TextoListener());

		// cria a instancia do segundo botao
		botao2 = new JButton("troca cor");

		// confirgurano a ação do botão para trocar a cor
		botao2.addActionListener(new CorListener());

		// cria a instancia do textfield
		campo = new JTextField();

		// configura a ação adicionando um evento do textField quando precionado
		// enter
		campo.addActionListener(new TextoListener());

		// adcionando os componentes ao painel da janela
		janela.getContentPane().add(BorderLayout.EAST, botao2);
		janela.getContentPane().add(BorderLayout.SOUTH, botao1);
		janela.getContentPane().add(BorderLayout.CENTER, area);
		janela.getContentPane().add(BorderLayout.NORTH, campo);

		// configurar o tamanho da janela
		janela.setSize(300, 300);

		// configurar a visibilidade da janela
		janela.setVisible(true);
	}

	public class TextoListener implements ActionListener {// inicio da classe

		@Override
		public void actionPerformed(ActionEvent arg0) {// inicio do metodo
			area.append(campo.getText() + "\n");
			campo.setText("");

		}// fim do metodo

	}// fim da classe

	public class CorListener implements ActionListener {// inicio da classe

		@Override
		public void actionPerformed(ActionEvent arg0) {// inicio do metodo
			// se o fundo da JTextArea for neutro troca para preto
			if (area.getBackground().equals(Color.BLACK)) {// inicio do if
				area.setBackground(Color.WHITE);
				area.setForeground(Color.BLACK);
			} else {
				area.setBackground(Color.BLACK);
				area.setForeground(Color.WHITE);

			}
		}// fim do metodo

	}// fim da classe

	public static void main(String[] args) {
		new TesteGui03().iniciaGui();

	}

}
