package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Label;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Canvas;
import java.applet.Applet;
import java.awt.Button;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage frame = new WelcomePage();
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
	public WelcomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 898, 605);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("Receipe With Oven and Gas");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.equals(b1))
				{
					recwithgas re=new recwithgas();
					re.show();
					}
				
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b1.setBounds(23, 211, 260, 38);
		contentPane.add(b1);
		
		JButton b2 = new JButton("Receipe Without Oven&Gas");
		b2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b2.equals(b2))
				{
					recwithoutgas rec=new recwithoutgas();
					rec.show();
					}
				
			}
			
		});
		b2.setBounds(23, 311, 262, 38);
		contentPane.add(b2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pruth\\Downloads\\cooking-vector-background-converted1-01- (2).jpg"));
		lblNewLabel.setBounds(10, 10, 874, 563);
		contentPane.add(lblNewLabel);
		
	}
}
