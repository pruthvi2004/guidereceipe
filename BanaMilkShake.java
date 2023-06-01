package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;

public class BanaMilkShake extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BanaMilkShake frame = new BanaMilkShake();
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
	public BanaMilkShake() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 890, 577);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("BananaMilkShake");
		l1.setForeground(new Color(0, 0, 0));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l1.setBounds(31, 46, 355, 13);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Ingredients");
		l2.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l2.setBounds(45, 172, 106, 13);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l3.setBounds(191, 171, 425, 13);
		contentPane.add(l3);
		l3.setText("2 banana Chopped && 1tbsp Sugar");
		
		JLabel l4 = new JLabel("");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l4.setBounds(191, 207, 277, 13);
		contentPane.add(l4);
		l4.setText("3 cup Milk");
		
		JLabel l5 = new JLabel("Procedure");
		l5.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l5.setBounds(57, 266, 94, 13);
		contentPane.add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l6.setBounds(189, 265, 458, 13);
		contentPane.add(l6);
		l6.setText("In Mixer add Banana and Sugar and make Paste");
		
		JLabel l7 = new JLabel("");
		l7.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l7.setBounds(188, 301, 595, 13);
		contentPane.add(l7);
		l7.setText("Now Add Milk into paste and keep fridge 10min && serve");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pruth\\Downloads\\banana.jpg"));
		lblNewLabel.setBounds(10, 0, 874, 543);
		contentPane.add(lblNewLabel);
	}

}
