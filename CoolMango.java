package prowin;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.Color;

public class CoolMango extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoolMango frame = new CoolMango();
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
	public CoolMango() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 891, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel l1 = new JLabel("CoolMangoLassi");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l1.setBounds(44, 80, 239, 21);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Ingredients");
		l2.setForeground(new Color(0, 0, 0));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 22));
		l2.setBounds(76, 275, 109, 21);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l3.setBounds(198, 315, 309, 21);
		contentPane.add(l3);
		l3.setText("1 mango && 2 cup curd");
		
		JLabel l4 = new JLabel("");
		l4.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l4.setBounds(210, 275, 149, 21);
		contentPane.add(l4);
		l4.setText("3 tbsp sugar");
		
		JLabel l5 = new JLabel("Procedure");
		l5.setFont(new Font("Times New Roman", Font.BOLD, 22));
		l5.setBounds(100, 405, 114, 21);
		contentPane.add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setForeground(new Color(255, 255, 255));
		l6.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l6.setBounds(224, 405, 490, 21);
		contentPane.add(l6);
		l6.setText("Remove Mango Pulp&&In Mixer add mango riphe");
		
		JLabel l7 = new JLabel("");
		l7.setForeground(new Color(255, 255, 255));
		l7.setFont(new Font("Times New Roman", Font.BOLD, 21));
		l7.setBounds(235, 447, 490, 21);
		contentPane.add(l7);
		l7.setText("Now add Sugar && Curd and make Paste and serve");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pruth\\Downloads\\mangolassi4.jpg"));
		lblNewLabel.setBounds(10, 0, 876, 606);
		contentPane.add(lblNewLabel);
	}

}
