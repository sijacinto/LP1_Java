package loja;

// importando classes 
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
import java.util.ArrayList;
import java.awt.event.ActionEvent;
 // classe CadastroPessoa, filha (herdeira) de JFRame
public class CadastroPessoa extends JFrame {
  //atributos
	private JPanel contentPane;
	private JTextField textField_Nome;
	private JTextField textField_CPF;
	;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// método principal
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
	 * códigos gerados automaticamente, conforme desenho
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
		
		JButton btnInserir = new JButton("inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//lista para armazenar várias pessoas
				ArrayList pes=new ArrayList<Pessoa>();
				//se houver dados no campo CPF e no campo nome
				if((!textField_CPF.getText().equals(""))&& !(textField_Nome.getText().equals("")))
				{
					// um objeto pessoa é criado
					Pessoa p4=new Pessoa(textField_CPF.getText(),textField_Nome.getText());
					//e adcionado à lista
					pes.add(p4);
					//campos são limpos
					textField_CPF.setText("");
					textField_Nome.setText("");
				}
				
				
				
				
			}
		});
		btnInserir.setBounds(161, 200, 89, 23);
		contentPane.add(btnInserir);
	}
}
