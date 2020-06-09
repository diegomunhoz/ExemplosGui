package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

/**
 * Classe responsavel por demonstrar a utilização de JRadioButton
 * 
 * @author JPBonfa
 * @since 28/05/2020
 */
public class TesteGui04 {

	// Declaração das variaveis
	private JFrame janela;
	private JLabel lbEscolha;
	private JRadioButton rbSolteiro;
	private JRadioButton rbCasado;
	private JRadioButton rbViuvo;
	private JRadioButton rbDivorciado;
	private ButtonGroup grpRadio;
	private JButton btVerificar;
	private JPanel painelDaJanela;

	public void iniciaGui() {// inicio do metodo

		// Criação das instancias
		janela = new JFrame("Exemplo de Radio Button");
		lbEscolha = new JLabel();
		rbSolteiro = new JRadioButton();
		rbCasado = new JRadioButton();
		rbViuvo = new JRadioButton();
		rbDivorciado = new JRadioButton();
		btVerificar = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// Cria o objeto dos grupos de botões
		grpRadio = new ButtonGroup();

		// Adicionando os botões ao grupo
		grpRadio.add(rbSolteiro);
		grpRadio.add(rbCasado);
		grpRadio.add(rbViuvo);
		grpRadio.add(rbDivorciado);

		// Configuraçoes da label escolha
		lbEscolha.setHorizontalTextPosition(SwingConstants.CENTER);
		lbEscolha.setText("Selecione o estado civil:");
		lbEscolha.setBounds(82, 18, 230, 18);

		// Configurações do RadioButton solteiro;
		rbSolteiro.setText("Solteiro");
		rbSolteiro.setBounds(80, 50, 100, 24);

		// Configurações do RadioButton casado;
		rbCasado.setText("Casado");
		rbCasado.setBounds(80, 75, 100, 24);

		// Configurações do RadioButton viuvo;
		rbViuvo.setText("Viuvo");
		rbViuvo.setBounds(80, 100, 100, 24);

		// Configurações do RadioButton divorciado;
		rbDivorciado.setText("Divorciado");
		rbDivorciado.setBounds(80, 125, 100, 24);

		// Configurações do botão
		btVerificar.setText("Verificar");
		btVerificar.setBounds(126, 176, 83, 28);
		btVerificar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				verificaSelecionado();
			}
		});

		// Configurções do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lbEscolha);
		painelDaJanela.add(rbSolteiro);
		painelDaJanela.add(rbCasado);
		painelDaJanela.add(rbViuvo);
		painelDaJanela.add(rbDivorciado);
		painelDaJanela.add(btVerificar);

		// Configuraçoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(340, 275);
		janela.setVisible(true);

	}// fim do metodo

	public void verificaSelecionado() {

		// verificar qual RadioButton foi selecionado;
		String resposta = "";
		if (rbSolteiro.isSelected()) {// inicio do if
			resposta += lbEscolha.getText() + " " + rbSolteiro.getText();
		}// fim do if
		if (rbCasado.isSelected()) {// inicio do if
			resposta += lbEscolha.getText() + " " + rbCasado.getText();
		}// fim do if
		if (rbViuvo.isSelected()) {// inicio do if
			resposta += lbEscolha.getText() + " " + rbViuvo.getText();
		}// fim do if
		if (rbDivorciado.isSelected()) {
			resposta += lbEscolha.getText() + " " + rbDivorciado.getText();
		}// fim do if

		if (!resposta.equals("")) {// inicio do if
			lbEscolha.setForeground(Color.RED);
			lbEscolha.setText(resposta);
		}// fim do if

		resposta = "";

	}// fim do metodo

	public static void main(String[] args) {
		new TesteGui04().iniciaGui();

	}

}
