package loja;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPessoa extends JFrame {

	private JPanel contentPane;
	private JTextField textField_Nome;
	private JTextField textField_CPF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoa frame = new CadastroPessoa();
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
	public CadastroPessoa() {
		setBackground(Color.GREEN);
		setTitle("Cadastro de Pessoa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNome.setBounds(10, 11, 102, 34);
		contentPane.add(lblNome);
		
		textField_Nome = new JTextField();
		textField_Nome.setBounds(83, 11, 291, 34);
		contentPane.add(textField_Nome);
		textField_Nome.setColumns(10);
		
		JLabel lblcpf = new JLabel("CPF");
		lblcpf.setFont(new Font("Arial", Font.BOLD, 16));
		lblcpf.setBounds(10, 84, 70, 28);
		contentPane.add(lblcpf);
		
		textField_CPF = new JTextField();
		textField_CPF.setBounds(68, 89, 306, 52);
		contentPane.add(textField_CPF);
		textField_CPF.setColumns(10);
		
		JButton btnInseir = new JButton("inserir");
		btnInseir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Pessoa p4=new Pessoa(textField_CPF.getText(),textField_Nome.getText());
				System.out.println("teste de inserção: " + p4.getNome());
			}
		});
		btnInseir.setBounds(161, 200, 89, 23);
		contentPane.add(btnInseir);
	}
}
