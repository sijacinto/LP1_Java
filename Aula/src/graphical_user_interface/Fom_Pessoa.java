package graphical_user_interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextField;


import recurso.Pessoa;

import javax.swing.JButton;

public class Fom_Pessoa extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField cpfField;
	private JTextField nomeField;
	private JTextField sexoField;
	private JTextField alturaField;
	private JTextField massaField;
    private ArrayList<Pessoa> pessoas;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Fom_Pessoa frame = new Fom_Pessoa();
					frame.setVisible(true);
									
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fom_Pessoa() {
		
		pessoas=new ArrayList<Pessoa>();
		setBackground(Color.WHITE);
		setTitle("Cadastro de Pessoa F\u00EDsica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 721, 378);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C.P.F.:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(0, 24, 56, 16);
		getContentPane().add(lblNewLabel);
		
		cpfField = new JTextField();
		cpfField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		cpfField.setBounds(49, 21, 371, 39);
		getContentPane().add(cpfField);
		cpfField.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNome.setBounds(0, 99, 56, 16);
		getContentPane().add(lblNome);
		
		nomeField = new JTextField();
		nomeField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		nomeField.setColumns(10);
		nomeField.setBounds(49, 86, 371, 44);
		getContentPane().add(nomeField);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(448, 99, 97, 25);
		getContentPane().add(btnSalvar);
		//quando botão salvar for clicado o que acontece?
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			InserirPessoa();	
			}
		});
		
		JButton btnProcurar = new JButton("Procurar");
		btnProcurar.setBounds(448, 35, 97, 25);
		getContentPane().add(btnProcurar);
		
		//quando botão Procurar for clicado o que acontece?
		btnProcurar.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					ProcurarPessoa();
					}
				});
		sexoField = new JTextField();
		sexoField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		sexoField.setColumns(10);
		sexoField.setBounds(49, 214, 157, 55);
		getContentPane().add(sexoField);
		
		JLabel label = new JLabel("Nome:");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		label.setBounds(-125, 156, 56, 16);
		getContentPane().add(label);
		
		alturaField = new JTextField();
		alturaField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		alturaField.setColumns(10);
		alturaField.setBounds(232, 214, 136, 55);
		getContentPane().add(alturaField);
		
		massaField = new JTextField();
		massaField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		massaField.setColumns(10);
		massaField.setBounds(380, 214, 136, 55);
		getContentPane().add(massaField);
		
		JLabel lblSexo = new JLabel("sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSexo.setBounds(90, 183, 56, 16);
		getContentPane().add(lblSexo);
		
		JLabel lblAltura = new JLabel("altura:");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAltura.setBounds(252, 184, 56, 16);
		getContentPane().add(lblAltura);
		
		JLabel lblMassa = new JLabel("massa:");
		lblMassa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMassa.setBounds(408, 184, 56, 16);
		getContentPane().add(lblMassa);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(313, 282, 97, 25);
		getContentPane().add(btnFechar);
		
		//quando botão Fechar for clicado o que acontece?
		btnFechar.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
							dispose();	
							}
						});
	
	
	}
	
	public void ProcurarPessoa(){
		Pessoa p=new Pessoa();
		
		for (int i=0;i<pessoas.size();i++) 
		{
			p=(Pessoa)pessoas.get(i);
			if (p.getCPF().equals(cpfField.getText())){
				
				nomeField.setText(p.getNome());
				massaField.setText(String.valueOf(p.getMassa()));
				sexoField.setText(String.valueOf(p.getSexo()));
				alturaField.setText(String.valueOf(p.getAltura()));
				break;
			} 
			
				
		}
		
	}
	
    public void InserirPessoa(){
    	Pessoa p=new Pessoa(cpfField.getText(),nomeField.getText());
    	p.setAltura(Float.valueOf((alturaField.getText())));
    	p.setMassa(52);
    	p.setSexo('F');
    	pessoas.add(p);
    	limparCampos();
    	
		
	}
     public void limparCampos(){
    	 cpfField.setText("");
    	 massaField.setText("");
    	 sexoField.setText("");
    	 nomeField.setText("");
    	 alturaField.setText("");
    	 
     }
	
}
