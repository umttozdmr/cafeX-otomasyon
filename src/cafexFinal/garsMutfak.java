package cafexFinal;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class garsMutfak extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					garsMutfak frame = new garsMutfak();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	

	
	
	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public garsMutfak() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setTitle("Garson CafeX - Mutfak");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 444);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Anasayfa");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Waiter mg = new Waiter();
				mg.setVisible(true);
				dispose();
				
			}
		});
		menuBar.add(menu);
		
		JMenu menu_1 = new JMenu("Masa");
		menuBar.add(menu_1);
		
		JMenuItem menuItem = new JMenuItem("Masalar");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				garsMasa ms1 = new garsMasa();
				ms1.setVisible(true);
				dispose();
				
			}
		});
		menu_1.add(menuItem);
		
		JMenu mnMutfak = new JMenu("Mutfak");
		mnMutfak.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				garsMutfak kc;
				try {
					kc = new garsMutfak();
					kc.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				dispose();
			}
		});
	
		menuBar.add(mnMutfak);
		
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
		

		DefaultTableModel tableModel = new DefaultTableModel();

		tableModel.addColumn("Sipariş No");
		tableModel.addColumn("İçerik");
		tableModel.addColumn("MasaNo");
		tableModel.addColumn("Sayi");
		tableModel.addColumn("Tutar");
		tableModel.addColumn("Kullanıcı");
		tableModel.addColumn("SiparisDurum");

		
		table = new JTable(tableModel);

	
		
		
		Connection conn = null;
	 	try {
	           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
	           
	 		if(conn!=null) {
	 			System.out.println("Connected Succesfully");
	 		}
	 		
	 	}
	 	catch(Exception e1) {
	 		System.out.println(e1);
	 	}
	 		Statement stmt2 = conn.createStatement();
		 	String sql2 = "SELECT * FROM orderx";
		 	ResultSet rs2 = stmt2.executeQuery(sql2);
		    System.out.println(rs2);
		 	
while(rs2.next()){
				
				String my_order_data = rs2.getString("OrderID");
				String my_order_data2 = rs2.getString("orderContent");
				String my_order_data3 = rs2.getString("orderStatusID");
				String my_order_data4 = rs2.getString("orderCount");
				String my_order_data5 = rs2.getString("UserID");
				String my_order_data6 = rs2.getString("orderCost");
				String my_order_data7 = rs2.getString("TableID");
				

				Object[] objs = {my_order_data, my_order_data2, my_order_data7, my_order_data4, my_order_data5, my_order_data6, my_order_data3};
				
				tableModel.addRow(objs);
				
	}
		
		
	table.setBounds(12, 56, 644, 302);
	contentPane.add(table);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		JButton btnNewButton = new JButton("Sipari\u015Fi Onayla");
		btnNewButton.setBackground(new Color(32, 178, 170));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(697, 56, 156, 62);
		contentPane.add(btnNewButton);
		
		JButton btnSipariiIptalEt = new JButton("Sipari\u015F \u0130ptal");
		btnSipariiIptalEt.setBackground(new Color(255, 0, 0));
		btnSipariiIptalEt.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSipariiIptalEt.setBounds(697, 175, 156, 62);
		contentPane.add(btnSipariiIptalEt);
		
		JButton btnSipariHazr = new JButton("Sipari\u015F Haz\u0131r");
		btnSipariHazr.setBackground(new Color(127, 255, 0));
		btnSipariHazr.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSipariHazr.setBounds(697, 296, 156, 62);
		contentPane.add(btnSipariHazr);
		
		JLabel lblDurum = new JLabel("Durum");
		lblDurum.setFont(new Font("Dialog", Font.BOLD, 12));
		lblDurum.setBounds(541, 29, 71, 16);
		contentPane.add(lblDurum);
		
		JLabel lblKullanc = new JLabel("Kullan\u0131c\u0131");
		lblKullanc.setFont(new Font("Dialog", Font.BOLD, 12));
		lblKullanc.setBounds(424, 29, 71, 16);
		contentPane.add(lblKullanc);
		
		JLabel lblTutar = new JLabel("Tutar");
		lblTutar.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTutar.setBounds(358, 29, 71, 16);
		contentPane.add(lblTutar);
		
		JLabel lblMasano = new JLabel("MasaNo");
		lblMasano.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMasano.setBounds(267, 29, 56, 16);
		contentPane.add(lblMasano);
		
		JLabel lblIerik = new JLabel("\u0130\u00E7erik");
		lblIerik.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIerik.setBounds(117, 29, 56, 16);
		contentPane.add(lblIerik);
		
		JLabel lblSiparino = new JLabel("Sipari\u015FNo");
		lblSiparino.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSiparino.setBounds(26, 29, 64, 16);
		contentPane.add(lblSiparino);
	}
}

