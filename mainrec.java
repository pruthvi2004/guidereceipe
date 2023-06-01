package prowin;

import java.awt.EventQueue;
import java.lang.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import java.awt.Color;

public class mainrec extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainrec frame = new mainrec();
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
	public mainrec() {
		
		
		{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 736, 490);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Cake");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l1.setBounds(119, 85, 45, 13);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Ingredients");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l2.setBounds(19, 191, 90, 13);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(255, 255, 255));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 17));
		l3.setBounds(119, 192, 514, 13);
		contentPane.add(l3);
		l3.setText("1 1/2 cup powdered sugar &&"
				+ "1 cup butter &&"
				+ "1 cup milk.");
		
		JLabel l4 = new JLabel("");
		l4.setForeground(new Color(255, 255, 255));
		l4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l4.setBounds(119, 232, 565, 13);
		contentPane.add(l4);
		l4.setText("3 cup all purpose flour && 2 teaspoon baking soda");
		
		JLabel l5 = new JLabel("Procedure");
		l5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		l5.setBounds(28, 278, 80, 13);
		contentPane.add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setForeground(new Color(255, 255, 255));
		l6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l6.setBounds(125, 279, 525, 13);
		contentPane.add(l6);
		l6.setText("Prepare Your Ingredients && Whisk the Dry Mix");
				
		
		JLabel l7 = new JLabel("");
		l7.setForeground(new Color(255, 255, 255));
		l7.setFont(new Font("Times New Roman", Font.BOLD, 18));
		l7.setBounds(125, 302, 537, 13);
		contentPane.add(l7);
		l7.setText("Cream Your Butter,Sugar&&Combine,Pour Batterin Pan&&Bake");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pruth\\Desktop\\photo-1578985545062-69928b1d9587.jpg"));
		lblNewLabel.setBounds(0, 0, 713, 441);
		contentPane.add(lblNewLabel);
	}
}
}