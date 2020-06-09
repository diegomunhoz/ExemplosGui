package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Classe responsavel por demonstar a utilização de tabela (JTable)
 * 
 * @author JPJBonfa
 * @since 30/05/2020
 */
public class TesteGui11 {

	// Declaração das variaveis
	private JFrame janela;
	private JPanel painelDaJanela;
	private JTable tabela;
	private JLabel lbIncluirUF;
	private JLabel lbIncluirEstado;
	private JTextField tfIncluirUF;
	private JTextField tfIncluirEstado;
	private JButton btIncluir;
	private JButton btExcluir;
	private JScrollPane scroll;

	private String colunas[] = { "UF", "Estado" };
	private String dados[][] = { { "SP", "São Paulo" },
			{ "RJ", "Rio de Janeiro" }, { "PR", "Paraná" },
			{ "MG", "Minas Gerais" } };

	public void iniciaGui() {

		// Criar as Instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		lbIncluirUF = new JLabel();
		lbIncluirEstado = new JLabel();
		tfIncluirUF = new JTextField();
		tfIncluirEstado = new JTextField();
		btIncluir = new JButton();
		btExcluir = new JButton();

		// Configurações da tabela, ao invés de passar os atributos direto ,
		// iremos colocar em um modelo de dados
		DefaultTableModel modelo = new DefaultTableModel(dados, colunas);
		tabela = new JTable(modelo);
		tabela.setEnabled(true);
		tabela.setBounds(10, 30, 300, 95);

		// configurações do scroll
		scroll = new JScrollPane(tabela);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setBounds(10, 100, 360, 95);

		// Configuraçao da label uf
		lbIncluirUF.setText("Informe UF:");
		lbIncluirUF.setBounds(15, 20, 70, 25);

		// Configurações da label Estado
		lbIncluirEstado.setText("Informe Estado:");
		lbIncluirEstado.setBounds(15, 55, 90, 25);

		// Configuração do textField UF e Estado
		tfIncluirUF.setBounds(110, 20, 50, 25);
		tfIncluirEstado.setBounds(110, 55, 260, 25);

		// Configuração do botão incluir
		btIncluir.setText("Incluir");
		btIncluir.setBounds(75, 200, 100, 50);
		btIncluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				adcionaLinha();

			}
		});

		// Configurações do botão excluir
		btExcluir.setText("Excluir");
		btExcluir.setBounds(195, 200, 100, 50);
		btExcluir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				excluiLinha();
			}
		});

		// Configurações do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lbIncluirUF);
		painelDaJanela.add(lbIncluirEstado);
		painelDaJanela.add(tfIncluirUF);
		painelDaJanela.add(tfIncluirEstado);
		painelDaJanela.add(btIncluir);
		painelDaJanela.add(btExcluir);
		painelDaJanela.add(scroll);

		// Configuraçoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Exemplo de tabela");
		janela.setSize(400, 300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public void adcionaLinha() {
		if (tfIncluirUF.getText().equals("")
				&& tfIncluirEstado.getText().equals("")) {
			JOptionPane.showMessageDialog(null,
					"Informe os dados, campo obrigatorio");
		} else {
			// Obtendo o modelo da tabela ja criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();
			// Adicioando a linha com os dados
			modelo.addRow(new String[] { tfIncluirUF.getText(),
					tfIncluirEstado.getText() });
			tfIncluirUF.setText("");
			tfIncluirEstado.setText("");
			JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");

		}

	}

	public void excluiLinha() {
		if (tabela.getSelectedRow() == -1) {
			JOptionPane.showMessageDialog(null, "Selecione uma linha");
		} else if (tabela.getSelectedRowCount() > 1) {
			JOptionPane.showMessageDialog(null, "Selecione apenas uma linha");

		} else {
			// Obtendo o modelo da tabela ja criada
			DefaultTableModel modelo = (DefaultTableModel) tabela.getModel();

			// excluindo a linha selecionada
			modelo.removeRow(tabela.getSelectedRow());
			JOptionPane.showMessageDialog(null, "Linha excluida com sucesso");

		}

	}

	public static void main(String[] args) {
		new TesteGui11().iniciaGui();

	}

}
