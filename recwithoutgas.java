package prowin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

public class recwithoutgas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recwithoutgas frame = new recwithoutgas();
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
	public recwithoutgas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 883, 663);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("BananaMilkShake");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b1.equals(b1))
				{
					BanaMilkShake BMS=new BanaMilkShake();
					BMS.show();
					
					
					}
			}
		});
		b1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b1.setBounds(297, 201, 195, 49);
		contentPane.add(b1);
		
		JButton b2 = new JButton("MangoMastani");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b2.equals(b2))
				{
					MangoMastani MM=new MangoMastani();
					MM.show();
					
					
					}
			}
		});
		b2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b2.setBounds(297, 278, 195, 49);
		contentPane.add(b2);
		
		JButton b3 = new JButton("CoolMangoLassi");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(b2.equals(b2))
				{
					CoolMango CM=new CoolMango();
					CM.show();
					
					
					}
				
			}
		});
		b3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		b3.setBounds(297, 358, 211, 49);
		contentPane.add(b3);
		
		JLabel l1 = new JLabel("New label");
		l1.setForeground(new Color(255, 255, 255));
		l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		l1.setBounds(174, 112, 521, 30);
		contentPane.add(l1);
		l1.setText("PLz Select Which Receipe You Want TO Make");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\pruth\\Downloads\\without gas.jpg"));
		lblNewLabel.setBounds(0, 0, 874, 629);
		contentPane.add(lblNewLabel);
	}
}
