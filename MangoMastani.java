package prowin;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Color;

public class MangoMastani extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MangoMastani frame = new MangoMastani();
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
	public MangoMastani() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 903, 636);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel l1 = new JLabel("MangoMastani");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		l1.setBounds(688, 142, 191, 21);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Ingredients");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		l2.setBounds(37, 219, 123, 21);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 22));
		l3.setBounds(172, 219, 395, 21);
		contentPane.add(l3);
		l3.setText("3 small riphen mango && 2 glass milk");
		
		JLabel l4 = new JLabel("");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l4.setBounds(182, 256, 449, 21);
		contentPane.add(l4);
		l4.setText("3 tbsp sugar && 2 scoop VanilaIcecream");
		
		JLabel l5 = new JLabel("Procedure");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l5.setBounds(37, 310, 123, 21);
		contentPane.add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l6.setBounds(182, 310, 568, 21);
		contentPane.add(l6);
		l6.setText("In Mixer add mango riphen and Sugar ang make Paste");
		
		JLabel l7 = new JLabel("");
		l7.setFont(new Font("Times New Roman", Font.BOLD, 20));
		l7.setBounds(182, 350, 635, 21);
		contentPane.add(l7);
		l7.setText("Now Add Milk &&Icecream into paste and keep fridge 10min && serve");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pruth\\Downloads\\mango-mastani-01.jpg"));
		lblNewLabel.setBounds(10, 10, 879, 589);
		contentPane.add(lblNewLabel);
	}

}
