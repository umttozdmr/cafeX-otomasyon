package cafexFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.SystemColor;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cashier extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
				Cashier frame = new Cashier();
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
	public Cashier() {
		setTitle("Kasiyer CafeX");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 885, 483);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Anasayfa");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cashier kc;
				kc = new Cashier();
				kc.setVisible(true);
			
				dispose();
			}
		});
	
		menuBar.add(mnNewMenu);
		
		JMenu mnMasa = new JMenu("Masa");
		menuBar.add(mnMasa);
		
		JMenuItem mnıtmMasalar = new JMenuItem("Masalar");
		mnıtmMasalar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kasiyerMas ms = new kasiyerMas();
				ms.setVisible(true);
				dispose();
			}
		
		
		});
		mnMasa.add(mnıtmMasalar);
		
		JMenu mnRezervasyon = new JMenu("Rezervasyon");
		mnMasa.add(mnRezervasyon);
		
		JMenuItem mnıtmRezervasyonEkle = new JMenuItem("Rezervasyon Ekle");
		mnıtmRezervasyonEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kasiyerRezE re = new kasiyerRezE();
				re.setVisible(true);
				dispose();
			}
		});
		mnRezervasyon.add(mnıtmRezervasyonEkle);
		
		JMenuItem mnıtmRezervasyonDzenle = new JMenuItem("Rezervasyon D\u00FCzenle");
		mnıtmRezervasyonDzenle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kasiyerRezD rd = new kasiyerRezD();
				rd.setVisible(true);
				dispose();
			}
		});
		mnRezervasyon.add(mnıtmRezervasyonDzenle);
		
		JMenu mnSipari = new JMenu("Mutfak");
		mnSipari.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				kasiyerMut kc;
				try {
					kc = new kasiyerMut();
					kc.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				dispose();
				
				
			}
		});
		menuBar.add(mnSipari);
		
		JMenu mnOturumuKapat = new JMenu("Oturumu kapat");
		mnOturumuKapat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Login lg = new Login();
				lg.setVisible(true);
				dispose();
			}
		});
		menuBar.add(mnOturumuKapat);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\2150656046\\Desktop\\cX\\cafeXk\u00FCc\u00FCk.png"));
		lblNewLabel.setBounds(183, 0, 721, 410);
		contentPane.add(lblNewLabel);
	}
}
