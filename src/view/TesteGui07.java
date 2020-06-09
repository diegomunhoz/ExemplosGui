package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Classe responsalvel por demonstar a utiliza��o do campo de senhas
 * 
 * @author JPJBonfa
 * @since 30/05/2020
 */
public class TesteGui07 {

	// declara��o das variaveis
	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel lbSenha;
	private JPasswordField pfSenha;

	public void iniciaGui() {

		// Criar as instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		lbSenha = new JLabel();
		pfSenha = new JPasswordField();

		// configura��es da label senha
		lbSenha.setText("Senha:");
		lbSenha.setBounds(10, 40, 40, 20);

		// configura��es do campo de senha
		pfSenha.setBounds(60, 40, 100, 20);

		// configura��es do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lbSenha);
		painelDaJanela.add(pfSenha);

		// configura�oes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Exemplo de campo de senha");
		janela.setSize(300, 300);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		new TesteGui07().iniciaGui();

	}

}
