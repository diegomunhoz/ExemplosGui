package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import sun.net.www.content.image.jpeg;

/**
 * Classe responsavel por demonstar a utilização de Paineis *
 * 
 * @author JPJBonfa
 * @since 30/05/2020
 */
public class TesteGui09 {

	// Declaração de variaveis
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;

	public void iniciaGui() {

		// Criar instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		painel1 = new JPanel();
		painel2 = new JPanel();
		painel3 = new JPanel();
		painel4 = new JPanel();

		// Configurações dos parametros do painel1
		painel1.setBounds(4, 6, 200, 100);
		painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		painel1.setBorder(BorderFactory.createEtchedBorder());

		// Configurações dos paramentros do painel 2
		painel2.setBounds(208, 6, 200, 100);
		painel2.setLayout(new BorderLayout(0, 0));
		painel2.setBorder(BorderFactory.createLoweredBevelBorder());

		// Configurações dos parametros do painel3
		painel3.setBounds(3, 109, 200, 100);
		painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
		painel3.setBorder(BorderFactory.createRaisedBevelBorder());

		// Configurações dos parametros do painel4
		painel4.setBounds(208, 110, 200, 100);
		painel4.setLayout(new GridLayout(1, 0, 0, 0));
		painel4.setBorder(new TitledBorder("João"));

		// Configurações do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painel1);
		painelDaJanela.add(painel2);
		painelDaJanela.add(painel3);
		painelDaJanela.add(painel4);

		// Configuraçoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Exemplo de bordas ");
		janela.setSize(422, 246);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new TesteGui09().iniciaGui();
	}

}
