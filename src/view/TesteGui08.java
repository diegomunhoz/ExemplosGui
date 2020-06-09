package view;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * Classe responsavel por demonstar a utiliza��o de listas(Jlist) e Scroll
 * 
 * @author JPJBonfa
 * @since 30/05/2020
 */
public class TesteGui08 {

	// Declara��o dos atributos
	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel lbLabel;
	private JList ltDiaSemana;
	private JScrollPane scroll;
	private String diaSemana[] = { "Domingo", "Segunda", "Ter�a", "Quarta",
			"Quinta", "Sexta", "Sabado" };

	public void iniciaGui() {

		// criar instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		lbLabel = new JLabel("CTRL para multisele��es", JLabel.CENTER);
		ltDiaSemana = new JList(diaSemana);
		scroll = new JScrollPane(ltDiaSemana);

		// Configura��es dos paramentros de a�oes da lista
		ltDiaSemana
				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ltDiaSemana.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				lbLabel.setText((String) ltDiaSemana.getSelectedValue());

			}
		});

		// Configura��es do scroll
		scroll.setBounds(10, 60, 300, 90);

		// Configura��es da label
		lbLabel.setOpaque(true);
		lbLabel.setBackground(Color.lightGray);
		lbLabel.setForeground(Color.black);
		lbLabel.setBounds(10, 10, 300, 30);

		// Configura��es do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lbLabel);
		painelDaJanela.add(scroll);

		// Configura��es da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Exemplo de scroll");
		janela.setSize(330, 330);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		new TesteGui08().iniciaGui();
	}

}
