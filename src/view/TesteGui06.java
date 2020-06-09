package view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * esta classe é responsavel por demonstrar a utilização de JComboBox
 * 
 * @author JPBonfa
 * @since 30/05/2020
 */
public class TesteGui06 {

	// declaração dos atributos
	private JFrame janela;
	private JPanel painelDaJanela;
	private JComboBox cbxEquipamentos;
	private String equipamentos[] = {"Monitor","Teclado","Mouse","Scanner","Moden"};
	

	public void iniciaGui() {

		// criar as instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		cbxEquipamentos = new JComboBox(equipamentos);

		// configuraçoes da combo
		cbxEquipamentos.setSelectedIndex(-1);
		cbxEquipamentos.setBounds(10, 10, 300, 30);

		// configurçoes do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(cbxEquipamentos);

		// configuraçoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Exemplo de Combo Box");
		janela.setSize(400, 300);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new TesteGui06().iniciaGui();

	}

}
