package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 * Classe responsavel por demonstar a utilização de Menu(JMenu)
 * 
 * @author JPJBonfa
 * @since 30/05/2020
 */
public class TesteGui12 {

	// declaraçao de variaveis
	private JFrame janela;
	private JMenuBar barraMenu;
	private JMenu menu1;
	private JMenu menu2;
	private JMenuItem itemMenu1;
	private JMenuItem itemMenu2;
	private JMenuItem itemMenu3;
	private JMenuItem itemMenu4;
	private JMenuItem itemMenu5;
	private JMenuItem itemMenu6;
	private JMenuItem itemMenu7;
	private JMenuItem itemMenu8;
	private JMenuItem itemMenu9;
	private JMenuItem itemMenu10;
	private JMenuItem itemMenu11;

	public void iniciaGui() {

		// Criação das instancias
		janela = new JFrame();
		barraMenu = new JMenuBar();
		menu1 = new JMenu();
		menu2 = new JMenu();
		itemMenu1 = new JMenuItem();
		itemMenu2 = new JMenuItem();
		itemMenu3 = new JMenuItem();
		itemMenu4 = new JMenuItem();
		itemMenu5 = new JMenuItem();
		itemMenu6 = new JMenuItem();
		itemMenu7 = new JMenuItem();
		itemMenu8 = new JMenuItem();
		itemMenu9 = new JMenuItem();
		itemMenu10 = new JMenuItem();
		itemMenu11 = new JMenuItem();

		// Adcionando os rotulos no menus
		menu1.setText("Iniciais");
		menu2.setText("Exemplos GUI");

		// Adicionando os rotulos aos intens de menu
		itemMenu1.setText("TesteGui01");
		itemMenu2.setText("TesteGui02");
		itemMenu3.setText("TesteGui03");
		itemMenu4.setText("TesteGui04");
		itemMenu5.setText("TesteGui05");
		itemMenu6.setText("TesteGui06");
		itemMenu7.setText("TesteGui07");
		itemMenu8.setText("TesteGui08");
		itemMenu9.setText("TesteGui09");
		itemMenu10.setText("TesteGui10");
		itemMenu11.setText("TesteGui11");

		// Adicionando os menus a barra de menu
		barraMenu.add(menu1);
		barraMenu.add(menu2);

		// Adicionando os itens de menu no menu1
		menu1.add(itemMenu1);
		menu1.add(itemMenu2);
		menu1.add(itemMenu3);

		// adicionando os itens de menu no menu2
		menu2.add(itemMenu4);
		menu2.add(itemMenu5);
		menu2.add(itemMenu6);
		menu2.add(itemMenu7);
		menu2.add(itemMenu8);
		menu2.add(itemMenu9);
		menu2.add(itemMenu10);
		menu2.add(itemMenu11);

		// Configurando as ações dos itens de menu
		itemMenu1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui01().iniciaGui();

			}
		});
		itemMenu2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui02().iniciaGui();
			}
		});
		itemMenu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui03().iniciaGui();
			}
		});
		itemMenu4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui04().iniciaGui();
			}
		});
		itemMenu5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui05().iniciaGui();
			}
		});
		itemMenu6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui06().iniciaGui();
			}
		});
		itemMenu7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui07().iniciaGui();
			}
		});
		itemMenu8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui08().iniciaGui();
			}
		});
		itemMenu9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui09().iniciaGui();
			}
		});
		itemMenu10.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui10().iniciaGui();
			}
		});
		itemMenu11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				new TesteGui11().iniciaGui();
			}
		});

		// Configuraçoes da janela
		janela.setJMenuBar(barraMenu);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Exemplo de menu");
		janela.setSize(600, 600);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);

	}

	public static void main(String[] args) {
		new TesteGui12().iniciaGui();
	}

}
