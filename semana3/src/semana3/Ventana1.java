package semana3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Primer Número");
		lblNewLabel.setBounds(10, 11, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Segundo Número");
		lblNewLabel_1.setBounds(10, 36, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tercer Número");
		lblNewLabel_2.setBounds(10, 61, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		txtN1 = new JTextField();
		txtN1.setBounds(139, 8, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(139, 33, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		txtN3 = new JTextField();
		txtN3.setBounds(139, 61, 86, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);
		
		btnNewButton = new JButton("Sumar dos enteros");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(84, 92, 141, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Sumar tres enteros");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setBounds(84, 126, 141, 23);
		contentPane.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("Sumar dos reales");
		btnNewButton_2.addActionListener(this);
		btnNewButton_2.setBounds(84, 160, 141, 23);
		contentPane.add(btnNewButton_2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(264, 92, 160, 158);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
	try {
		int n1 = Integer.parseInt(txtN1.getText());
		int n2 = Integer.parseInt(txtN2.getText());
		calculadora c=new calculadora(n1, n2);
		txtS.setText("");
		txtS.append("La suma es: "+c.Sumar(n1, n2));
	} catch (Exception e2) {
		JOptionPane.showMessageDialog(this, "Ingrese numeros enteros");
	}
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(txtN1.getText());
			int n2 = Integer.parseInt(txtN2.getText());
			int n3 = Integer.parseInt(txtN3.getText());
			calculadora c=new calculadora(n1, n2);
			txtS.setText("");
			txtS.append("La suma es: "+c.Sumar(n1, n2, n3));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese numeros enteros");
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		try {
			double num1 = Integer.parseInt(txtN1.getText());
			double num2 = Integer.parseInt(txtN2.getText());
			calculadora c=new calculadora(num1, num2);
			txtS.setText("");
			txtS.append("La suma es: "+c.Sumar(num1, num2));
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese numeros reales");
		}	
	}
}
