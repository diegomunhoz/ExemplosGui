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
 * Classe responsavel por demonstar a utilização de listas(Jlist) e Scroll
 * 
 * @author JPJBonfa
 * @since 30/05/2020
 */
public class TesteGui08 {

	// Declaração dos atributos
	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel lbLabel;
	private JList ltDiaSemana;
	private JScrollPane scroll;
	private String diaSemana[] = { "Domingo", "Segunda", "Terça", "Quarta",
			"Quinta", "Sexta", "Sabado" };

	public void iniciaGui() {

		// criar instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		lbLabel = new JLabel("CTRL para multiseleções", JLabel.CENTER);
		ltDiaSemana = new JList(diaSemana);
		scroll = new JScrollPane(ltDiaSemana);

		// Configurações dos paramentros de açoes da lista
		ltDiaSemana
				.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		ltDiaSemana.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				lbLabel.setText((String) ltDiaSemana.getSelectedValue());

			}
		});

		// Configurações do scroll
		scroll.setBounds(10, 60, 300, 90);

		// Configurações da label
		lbLabel.setOpaque(true);
		lbLabel.setBackground(Color.lightGray);
		lbLabel.setForeground(Color.black);
		lbLabel.setBounds(10, 10, 300, 30);

		// Configurações do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lbLabel);
		painelDaJanela.add(scroll);

		// Configurações da janela
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
