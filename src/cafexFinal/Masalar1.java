package cafexFinal;
import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Masalar1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Masalar1 frame = new Masalar1();
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
	public Masalar1() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setTitle("Yönetici CafeX - Masalar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 477);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Anasayfa");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Manager mg = new Manager();
				mg.setVisible(true);
				dispose();
			}
		});
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("Masa");
		menuBar.add(menu_1);
		
		JMenuItem menuItem = new JMenuItem("Masalar");
		menu_1.add(menuItem);
		
		JMenu menu_2 = new JMenu("Rezervasyon");
		menu_1.add(menu_2);
		
		JMenuItem menuItem_1 = new JMenuItem("Rezervasyon Ekle");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rezekle re;
				try {
					re = new rezekle();
					re.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		menu_2.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Rezervasyon D\u00FCzenle");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rezduz rd = new rezduz();
				rd.setVisible(true);
				dispose();
			}
		});
		menu_2.add(menuItem_2);
		
		JMenu mnMutfak = new JMenu("Mutfak");
		mnMutfak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Kitchen kc;
				try {
					kc = new Kitchen();
					kc.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				dispose();
				
				
			}
		});
		menuBar.add(mnMutfak);
		
		JMenu menu_4 = new JMenu("Men\u00FC");
		menu_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Product prd;
				try {
					prd = new Product();
					prd.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		menuBar.add(menu_4);
		
		JMenu menu_5 = new JMenu("Personel");
		menu_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Personal ps;
				try {
					ps = new Personal();
					ps.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		menuBar.add(menu_5);
		
		JMenu menu_6 = new JMenu("Cari");
		menuBar.add(menu_6);
		
		JMenu menu_7 = new JMenu("Tedarik\u00E7i");
		menu_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tedarikci td;
				try {
					td = new Tedarikci();
					td.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				dispose();
			}
		});
		menuBar.add(menu_7);
		
		JMenu menu_8 = new JMenu("Oturumu kapat");
		menu_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				dispose();
			}
		});
		menuBar.add(menu_8);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("MASAYI KAPAT");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\hazaly\\Desktop\\icon\\left (1).png"));
		btnNewButton_1.setBackground(new Color(255, 102, 0));
		btnNewButton_1.setBounds(550, 113, 151, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnSipari = new JButton("S\u0130PAR\u0130\u015E");
		btnSipari.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSipari.setBackground(new Color(255, 102, 0));
		btnSipari.setBounds(550, 183, 151, 53);
		contentPane.add(btnSipari);
		
		JButton btnAdisyon = new JButton("AD\u0130SYON ");
		btnAdisyon.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdisyon.setBackground(new Color(255, 102, 0));
		btnAdisyon.setBounds(550, 249, 151, 53);
		contentPane.add(btnAdisyon);
		
		JButton btnNewButton = new JButton("MASA-1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btnNewButton.setBackground(new Color(152, 251, 152));
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnNewButton.setBounds(38, 40, 130, 108);
		contentPane.add(btnNewButton);
		
		JButton btnMasa = new JButton("MASA-2");
		btnMasa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Butonlar bb = new Butonlar();
				bb.setVisible(true);
				bb.setTitle("MASA 1");
				dispose();
				
				
			}
		});
		btnMasa.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnMasa.setBackground(new Color(152, 251, 152));
		btnMasa.setBounds(189, 40, 130, 108);
		contentPane.add(btnMasa);
		
		JButton btnMasa_2 = new JButton("MASA-4");
		btnMasa_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnMasa_2.setBackground(new Color(152, 251, 152));
		btnMasa_2.setBounds(38, 215, 130, 108);
		contentPane.add(btnMasa_2);
		
		JButton btnMasa_3 = new JButton("MASA-5");
		btnMasa_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnMasa_3.setBackground(new Color(152, 251, 152));
		btnMasa_3.setBounds(189, 215, 130, 108);
		contentPane.add(btnMasa_3);
		
		JButton btnMasa_1 = new JButton("MASA-3");
		btnMasa_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnMasa_1.setBackground(new Color(152, 251, 152));
		btnMasa_1.setBounds(341, 40, 130, 108);
		contentPane.add(btnMasa_1);
		
		JButton btnMasa_4 = new JButton("MASA-6");
		btnMasa_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 17));
		btnMasa_4.setBackground(new Color(152, 251, 152));
		btnMasa_4.setBounds(341, 215, 130, 108);
		contentPane.add(btnMasa_4);
	}
}