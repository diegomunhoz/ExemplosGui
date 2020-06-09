package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Classe responsavel por demonstrar a utilização de JCheckBox
 * 
 * @author JPBonfa
 * @since 28/05/2020
 */
public class TesteGui05 {

	// Declaração das variaveis
	private JFrame janela;
	private JLabel lbEscolha;
	private JLabel lbResposta;
	private JCheckBox cbCC;
	private JCheckBox cbDB;
	private JCheckBox cbBB;
	private JButton btResposta;
	private JPanel painelDaJanela;

	public void iniciaGui() {

		// Criação das instancias
		janela = new JFrame("Exemplo de Check Box");
		lbEscolha = new JLabel();
		lbResposta = new JLabel();
		cbCC = new JCheckBox();
		cbDB = new JCheckBox();
		cbBB = new JCheckBox();
		btResposta = new JButton();
		painelDaJanela = (JPanel) janela.getContentPane();

		// Configuraçoes da label escolha
		lbEscolha.setForeground(Color.RED);
		lbEscolha.setText("Escolha a forma de pagamento:");
		lbEscolha.setBounds(42, 15, 208, 18);

		// Configurações da label resposta
		lbResposta.setForeground(Color.BLUE);
		lbResposta.setText("Resposta:");
		lbResposta.setBounds(42, 230, 300, 18);

		// Configurções do Check Box Cartao de Credito
		cbCC.setText("Cartão de crédito");
		cbCC.setSelected(false);
		cbCC.setBounds(42, 124, 145, 24);

		// Configurções do Check Box Deposito Bancario
		cbDB.setText("Depósito Bancário");
		cbDB.setSelected(false);
		cbDB.setBounds(42, 98, 154, 24);

		// Configurções do Check Box Boleto Bancario
		cbBB.setText("Boleto bancário");
		cbBB.setSelected(false);
		cbBB.setBounds(42, 70, 157, 24);

		// Configurções do botão
		btResposta.setText("Resposta");
		btResposta.setBounds(146, 196, 120, 28);

		// Configurando a ação do botão
		btResposta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				verificaSelecionado();
			}
		});

		// Adicionando os componentes no painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lbEscolha);
		painelDaJanela.add(lbResposta);
		painelDaJanela.add(cbCC);
		painelDaJanela.add(cbDB);
		painelDaJanela.add(cbBB);
		painelDaJanela.add(btResposta);

		// configuraçoes da tela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(390, 300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public void verificaSelecionado() {
		String resposta = "";
		if (cbCC.isSelected()) {
			resposta += cbCC.getText();

		}
		if (cbDB.isSelected()) {
			resposta += cbDB.getText();

		}
		if (cbBB.isSelected()) {
			resposta += cbBB.getText();

		}
		if (!resposta.equals("")) {// inicio do if
			lbEscolha.setText(resposta);

		}// fim do if
		resposta = "";
	}

	public static void main(String[] args) {
		new TesteGui05().iniciaGui();

	}

}
