package view;

import java.text.ParseException;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;

/**
 * Classe responsavel por armazenar os componentes de campo formatados
 * 
 * @author JPJBonfa
 * @since 03/06/2020
 */
public class TesteGui13 {

	// Declaração das variaveis
	private JFrame janela;
	private JPanel painelDaJanela;
	private JLabel lbCpf;
	private JLabel lbRg;
	private JLabel lbDataNascimento;
	private JLabel lbTelefone;
	private JFormattedTextField tfCpf;
	private JFormattedTextField tfRg;
	private JFormattedTextField tfDataNascimento;
	private JFormattedTextField tfTelefone;

	// Declaração dos campos de formatação
	private MaskFormatter fmtCpf;
	private MaskFormatter fmtRg;
	private MaskFormatter fmtDataNascimento;
	private MaskFormatter fmtTelefone;

	public void iniciaGui() throws ParseException {

		// Criação das instancias de formato(DEVE SER A PRIMEIRA INSTANCIA)
		fmtCpf = new MaskFormatter("###.###.###-##");
		fmtRg = new MaskFormatter("##.###.###-#");
		fmtDataNascimento = new MaskFormatter("##/##/####");
		fmtTelefone = new MaskFormatter("(##) ####-####");

		// criação das instancias
		janela = new JFrame();
		painelDaJanela = (JPanel) janela.getContentPane();
		lbCpf = new JLabel();
		lbRg = new JLabel();
		lbDataNascimento = new JLabel();
		lbTelefone = new JLabel();
		tfCpf = new JFormattedTextField(fmtCpf);
		tfRg = new JFormattedTextField(fmtRg);
		tfDataNascimento = new JFormattedTextField(fmtDataNascimento);
		tfTelefone = new JFormattedTextField(fmtTelefone);
		
		//Configuraçoes dos textos das labels
		lbCpf.setText("CPF:");
		lbRg.setText("RG:");
		lbDataNascimento.setText("Data de nascimento:");
		lbTelefone.setText("Telefone");
		

		// Configurações das posições dos componentes na tela
		lbCpf.setBounds(10, 10, 50, 20);
		tfCpf.setBounds(100, 10, 110, 20);
		lbRg.setBounds(10, 40, 50, 20);
		tfRg.setBounds(100, 40, 110, 20);
		lbDataNascimento.setBounds(10, 70, 120, 20);
		tfDataNascimento.setBounds(130, 70, 110, 20);
		lbTelefone.setBounds(10, 100, 50, 20);
		tfTelefone.setBounds(100, 100, 110, 20);
		
		
		
		

		// Configurações do painel da janela
		painelDaJanela.setLayout(null);
		painelDaJanela.add(lbCpf);
		painelDaJanela.add(tfCpf);
		painelDaJanela.add(lbRg);
		painelDaJanela.add(tfRg);
		painelDaJanela.add(lbDataNascimento);
		painelDaJanela.add(tfDataNascimento);
		painelDaJanela.add(lbTelefone);
		painelDaJanela.add(tfTelefone);

		// Configuraçoes da janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setTitle("Exemplo de campos formatados");
		janela.setSize(400, 300);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			new TesteGui13().iniciaGui();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
