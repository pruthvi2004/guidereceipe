package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;

public class maintea extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					maintea frame = new maintea();
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
	public maintea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 666, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel l1 = new JLabel("Tea");
		l1.setFont(new Font("Times New Roman", Font.BOLD, 19));
		l1.setBounds(54, 76, 45, 13);
		contentPane.add(l1);
		
		JLabel l2 = new JLabel("Ingredients");
		l2.setForeground(new Color(255, 255, 255));
		l2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l2.setBounds(35, 189, 78, 13);
		contentPane.add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setForeground(new Color(0, 0, 0));
		l3.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		l3.setBounds(169, 201, 352, 13);
		contentPane.add(l3);
		l3.setText("1tbs tea powder");
		
		JLabel l4 = new JLabel("");
		l4.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		l4.setBounds(168, 224, 392, 13);
		contentPane.add(l4);
		l4.setText("3 cup milk && 3 tbs sugar");
		
		JLabel l5 = new JLabel("Procedure");
		l5.setForeground(new Color(255, 255, 255));
		l5.setFont(new Font("Times New Roman", Font.BOLD, 14));
		l5.setBounds(35, 264, 86, 13);
		contentPane.add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setForeground(new Color(0, 0, 0));
		l6.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		l6.setBounds(164, 265, 462, 13);
		contentPane.add(l6);
		l6.setText("combine all ingredients with 2cup water&&stay boil 3min");
		
		JLabel l7 = new JLabel("");
		l7.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		l7.setBounds(164, 289, 434, 13);
		contentPane.add(l7);
		l7.setText("strain immedi.use stariner&&discard powder");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pruth\\Downloads\\OItea 1.jpg"));
		lblNewLabel.setBounds(10, 0, 642, 438);
		contentPane.add(lblNewLabel);
	}

}
