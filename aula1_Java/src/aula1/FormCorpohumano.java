package aula1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCorpohumano extends JFrame {

	private JPanel contentPane;
	private JTextField txtnome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCorpohumano frame = new FormCorpohumano();
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
	public FormCorpohumano() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 949, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 33));
		lblNewLabel.setBounds(60, 41, 301, 40);
		contentPane.add(lblNewLabel);
		
		txtnome = new JTextField();
		txtnome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtnome.setBounds(166, 32, 406, 72);
		contentPane.add(txtnome);
		txtnome.setColumns(10);
		
		JButton entrar_nome = new JButton("ok");
		entrar_nome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Corpohumano c3 = new Corpohumano();
				c3.setNome(txtnome.getText());
				System.out.println(c3.getNome());
				txtnome.setText("");
			}
		});
		entrar_nome.setFont(new Font("Tahoma", Font.PLAIN, 32));
		entrar_nome.setBounds(166, 351, 406, 94);
		contentPane.add(entrar_nome);
		
		
	}
}
