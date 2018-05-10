package cafexFinal;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class Butonlar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Butonlar frame = new Butonlar();
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
	public Butonlar() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("YENİ SİPARİŞ");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(153, 51, 204));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				kasiyerMas ms = new kasiyerMas();
				ms.setVisible(true);
				dispose();
			
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				masaKasiyer ms = new masaKasiyer();
				ms.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(76, 149, 125, 50);
		contentPane.add(btnNewButton);
		
		JButton btnSipariEkle = new JButton("ADİSYON");
		
		
		
		btnSipariEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSipariEkle.setForeground(Color.WHITE);
		btnSipariEkle.setBackground(new Color(0, 153, 153));
		btnSipariEkle.setBounds(211, 149, 131, 50);
		contentPane.add(btnSipariEkle);
		
		JButton btnNewButton_1 = new JButton("    GER\u0130 D\u00D6N");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Handan Kele\u015F\\Desktop\\Masa\\icon\\left (1).png"));
		btnNewButton_1.setBackground(new Color(255, 102, 0));
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Masalar1 m1 = new Masalar1();
				m1.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(76, 61, 266, 50);
		contentPane.add(btnNewButton_1);
	}

}