package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class recwithgas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recwithgas frame = new recwithgas();
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
	public recwithgas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 873, 608);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("CAKE");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.equals(b1))
				{
					mainrec mr=new mainrec();
					mr.show();
					
					
					}
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		b1.setBounds(326, 100, 136, 47);
		contentPane.add(b1);
		
		JButton b4= new JButton("TEA");
		b4.setFont(new Font("Times New Roman", Font.BOLD, 19));
		b4.setBounds(331, 189, 131, 47);
		contentPane.add(b4);
		
		JLabel l1 = new JLabel("New label");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l1.setBounds(74, 43, 717, 47);
		contentPane.add(l1);
		l1.setText("PLZ SELECT WHICH RECEIPE YOU WANT TO MAKE ");
		
		JButton btnNewButton = new JButton("PULAV");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(331, 279, 137, 52);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pruth\\Downloads\\withgas (1).jpg"));
		lblNewLabel.setBounds(0, 0, 912, 578);
		contentPane.add(lblNewLabel);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b4.equals(b4))
				{
					maintea mt=new maintea();
					mt.show();
					
					
					}
			}
		});
		
		
		
			
		
	}
}