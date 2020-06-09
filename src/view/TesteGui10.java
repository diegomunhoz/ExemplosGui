package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Classe responsavel por demonstar a utilização de paineis com abas
 * 
 * @author JPJBonfa
 * @since 30/05/2020
 */
public class TesteGui10 {
	private JFrame janela;
	private JPanel painelDaJanela;
	private JPanel primeiraAba;
	private JPanel segundaAba;
	private JPanel terceiraAba;
	private JTabbedPane painelComAbas;
	private JLabel lbAba1;
	private JLabel lbAba2;
	private JLabel lbAba3;

	public void iniciaGui() {

		// Criar as instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		primeiraAba = new JPanel();
		segundaAba = new JPanel();
		terceiraAba = new JPanel();
		painelComAbas = new JTabbedPane();
		lbAba1 = new JLabel("Está é a primeira aba");
		lbAba2 = new JLabel("Está é a segunda aba");
		lbAba3 = new JLabel("Está é a terceira aba");

		// Configurar e adcionar as abas no painel
		painelComAbas.addTab("Aba 1", primeiraAba);
		painelComAbas.addTab("Aba 2", segundaAba);
		painelComAbas.addTab("Aba 3", terceiraAba);
		painelComAbas.setBounds(14, 21, 342, 200);

		// Configurações das abas
		primeiraAba.add(lbAba1);
		segundaAba.add(lbAba2);
		terceiraAba.add(lbAba3);

		// Configurações do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(painelComAbas);

		// Configuraçoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Exemplo de abas ");
		janela.setSize(390, 300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new TesteGui10().iniciaGui();

	}

}
