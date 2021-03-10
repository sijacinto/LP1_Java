package recurso;


import java.util.HashMap;

import java.awt.EventQueue;

 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

 

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 


import javax.swing.JButton;
import javax.swing.JTextField;


 

public class MetMap extends JFrame {

 

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private JTextField buscar;
    private JTextField Notafield;
    private JTextField situacaoField;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    
    
 

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MetMap frame = new MetMap();
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
    public MetMap() {
        setTitle("Alunos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        
        HashMap<String, Integer> Alunos = new HashMap<String, Integer>();
        Alunos.put("John", 10);
        Alunos.put("Steve", 9);
        Alunos.put("Angie", 5);
        Alunos.put("Ramon", 10);
        Alunos.put("Joca", 10);
        Alunos.put("Luan", 10);
        Alunos.put("Jeferson", 10);
       
        JFrame frame = new JFrame("JOptionPane exemplo");
        JButton btnAlunos = new JButton("AlunosCadastrados");
        btnAlunos.setBounds(28, 216, 144, 23);
        contentPane.add(btnAlunos);
        
        buscar = new JTextField();
        buscar.setToolTipText("Nome");
        buscar.setBounds(28, 63, 167, 20);
        contentPane.add(buscar);
        buscar.setColumns(10);
        
        
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(266, 62, 115, 23);
        contentPane.add(btnBuscar);
        
        Notafield = new JTextField();
        Notafield.setBounds(28, 141, 39, 20);
        contentPane.add(Notafield);
        Notafield.setColumns(10);
        
        situacaoField = new JTextField();
        situacaoField.setBounds(223, 141, 96, 20);
        contentPane.add(situacaoField);
        situacaoField.setColumns(10);
        
        lblNewLabel = new JLabel("Nota do Aluno");
        lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel.setBounds(28, 116, 96, 14);
        contentPane.add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("Situa\u00E7\u00E3o do aluno");
        lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(223, 116, 115, 14);
        contentPane.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Nome");
        lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 14));
        lblNewLabel_2.setBounds(28, 38, 46, 14);
        contentPane.add(lblNewLabel_2);
        btnBuscar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
       /******Mudei aqui*****/         
                Notafield.setText(Integer.toString(Alunos.get(buscar.getText())));
                
                
               int valor = Alunos.get(buscar.getText());
                
                       
                if (valor >= 7) {
                    situacaoField.setText("Aprovado");
                }
                else {
                    situacaoField.setText("Reprovado");
                }
                
                
                
        
        
        
        btnAlunos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {    
                JOptionPane.showMessageDialog(frame,
                        "Os alunos cadastrados são: " + "\n"  + "John" + "\n" + "Steve" + "\n" + "Angie" + "\n" + "Ramon"+ "\n" + "Joca" + "\n"+ "Luan" + "\n"+ "Kevin",
                        "Alunos cadastrados", 
                        JOptionPane.INFORMATION_MESSAGE);
        };
    });
            }
        });
    }    
}