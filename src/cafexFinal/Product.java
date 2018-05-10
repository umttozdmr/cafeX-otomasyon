package cafexFinal;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Product extends JFrame {

	private JPanel contentPane;
	private JTextField proName;
	private JTextField proPurch;
	private JTextField proSell;
	private JTextField textField;
	private JTextField countBox;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product frame = new Product();
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
	public Product() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setTitle("Yönetici CafeX - Menü");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 806, 475);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Anasayfa");
		menuBar.add(menu);
		
		JMenu menu_5 = new JMenu("Masa");
		menuBar.add(menu_5);
		
		JMenuItem menuItem_1 = new JMenuItem("Masalar");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 Masalar1 ms1 = new Masalar1();
			 ms1.setVisible(true);
			 dispose();
				
			}
		});
		menu_5.add(menuItem_1);
		
		JMenu menu_6 = new JMenu("Rezervasyon");
		menu_5.add(menu_6);
		
		JMenuItem menuItem_2 = new JMenuItem("Rezervasyon Ekle");
		menuItem_2.addActionListener(new ActionListener() {
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
		menu_6.add(menuItem_2);
		
		JMenuItem menuItem_3 = new JMenuItem("Rezervasyon D\u00FCzenle");
		menuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				rezduz rd = new rezduz();
				rd.setVisible(true);
				dispose();
			}
		});
		menu_6.add(menuItem_3);
		
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
		
		JMenu menu_8 = new JMenu("Men\u00FC");
		menu_8.addMouseListener(new MouseAdapter() {
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
		menuBar.add(menu_8);
		
		JMenu menu_1 = new JMenu("Personel");
		menu_1.addMouseListener(new MouseAdapter() {
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
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("Cari");
		menuBar.add(menu_2);
		
		JMenu menu_4 = new JMenu("Tedarik\u00E7i");
		menu_4.addMouseListener(new MouseAdapter() {
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
		menuBar.add(menu_4);
		
		JMenu menu_3 = new JMenu("Oturumu kapat");
		menu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login lg = new Login();
				lg.setVisible(true);
				dispose();
			}
		});
		menuBar.add(menu_3);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
			
		
		
		
		
		
		DefaultTableModel tableModel = new DefaultTableModel();

		tableModel.addColumn("Ürün Adı");
		tableModel.addColumn("Türü");
		tableModel.addColumn("Stok");
		tableModel.addColumn("Alış Fiyatı");
		tableModel.addColumn("Satış Fiyatı");
		tableModel.addColumn("Tedarikci");
		contentPane.setLayout(null);
		
		
		
		
		proName = new JTextField();
		proName.setBounds(105, 59, 116, 22);
		contentPane.add(proName);
		proName.setColumns(10);
		
		proPurch = new JTextField();
		proPurch.setBounds(105, 127, 116, 22);
		proPurch.setColumns(10);
		contentPane.add(proPurch);
		
		JLabel lblrnAd = new JLabel("\u00DCr\u00FCn Ad\u0131");
		lblrnAd.setBounds(18, 62, 56, 16);
		lblrnAd.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblrnAd);
		
		JLabel lblTr = new JLabel("T\u00FCr\u00FC");
		lblTr.setBounds(18, 95, 56, 16);
		lblTr.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblTr);
		
		JLabel lblAlFiyat = new JLabel("Al\u0131\u015F fiyat\u0131");
		lblAlFiyat.setBounds(18, 130, 56, 16);
		lblAlFiyat.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblAlFiyat);
		
		JLabel lblSatFiyat = new JLabel("Sat\u0131\u015F fiyat\u0131");
		lblSatFiyat.setBounds(18, 165, 71, 16);
		lblSatFiyat.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblSatFiyat);
		
		proSell = new JTextField();
		proSell.setBounds(105, 162, 116, 22);
		proSell.setColumns(10);
		contentPane.add(proSell);
		
		JComboBox proComp = new JComboBox();
		proComp.setBounds(105, 197, 116, 22);
		contentPane.add(proComp);
		
		
		JLabel lblFirma = new JLabel("Firma");
		lblFirma.setBounds(18, 203, 71, 16);
		lblFirma.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblFirma);
		
		JComboBox proType = new JComboBox();
		proType.setBounds(105, 94, 116, 22);
		contentPane.add(proType);
		
	    
		
		JComboBox proType2 = new JComboBox();
		proType2.setBounds(275, 48, 116, 22);
		contentPane.add(proType2);
	
		

		JComboBox proCombo = new JComboBox();
		proCombo.setBounds(70, 283, 116, 22);
		contentPane.add(proCombo);
		
		
		Connection conn = null;
		
	 	try {
	           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
	           
	 		if(conn!=null) {
	 			System.out.println("Connected Succesfully");
	 		}
		}catch(Exception e1) {
	 		System.out.println(e1);
		
	 	}
	
	 	Statement stmt=conn.createStatement(); 
	 	Statement stmt2=conn.createStatement();
	 	Statement stmt3=conn.createStatement();
	 	Statement stmt4=conn.createStatement();
	 
	 	
	    String ProSql ="SELECT * FROM product";
	    ResultSet rs3=stmt3.executeQuery(ProSql);
	 	
	 	String TypeSql = "SELECT TypeName FROM producttype";
	 	ResultSet rs=stmt.executeQuery(TypeSql);
	    
	 	String CompSql = "SELECT CompanyName FROM company";
	    ResultSet rs2=stmt2.executeQuery(CompSql);
	    
	    while (rs2.next()) {
	    	proComp.addItem(rs2.getString("CompanyName"));
	    }
	    		
	 	while (rs.next()) {
	 		proType.addItem(rs.getString("TypeName"));
	 		proType2.addItem(rs.getString("TypeName"));
		}
	 	
	 	while (rs3.next()) {
	 		String product_data1 = rs3.getString("ProductName");
	 		String product_data5 = rs3.getString("ProductCount");
			String product_data2 = rs3.getString("ProductTypeID");
			String product_data3 = rs3.getString("ProductPurchasePrice");
			String product_data4 = rs3.getString("ProductSellPrice");
			String product_data6 = rs3.getString("CompanyID");
			
			proCombo.addItem(product_data1);
			
			Object[] objs = {product_data1, product_data2, product_data3, product_data4, product_data5, product_data6,  };
			tableModel.addRow(objs);
	 	}
	 	
	 	
		Statement stmt41=conn.createStatement(); 
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.setBounds(12, 232, 62, 35);
		btnEkle.setBackground(SystemColor.activeCaption);
		btnEkle.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String urun_adi = proName.getText();
				Object urun_turu = proType.getSelectedIndex();
				String urun_afiyat = proPurch.getText();
				String urun_sfiyat = proSell.getText();
				Object urun_tedarik = proComp.getSelectedIndex();
		
				try {
					stmt41.executeUpdate("INSERT INTO product(ProductName,ProductTypeID,ProductPurchasePrice,ProductSellPrice,CompanyID)"+"VALUES('"+urun_adi +"',"+"'"+ urun_turu +"',"+"'"+  urun_afiyat  +"',"+"'"+  urun_sfiyat  +"','" + urun_tedarik+"')");
				
				 	JOptionPane.showMessageDialog(null, "Kayıt başarıyla eklenmiştir."); proName.setText("");proPurch.setText("");proSell.setText(""); 
			

			}
           	catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e1);
			
			}
			}
		});

				
				
				
				
				
			
		
		contentPane.add(btnEkle);
		
		JLabel lblrnAd_1 = new JLabel("\u00DCr\u00FCn Ad\u0131");
		lblrnAd_1.setBounds(403, 32, 56, 16);
		lblrnAd_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblrnAd_1);
		
		JLabel label = new JLabel("T\u00FCr\u00FC");
		label.setBounds(471, 32, 56, 16);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Al\u0131\u015F fiyat\u0131");
		label_1.setBounds(526, 32, 56, 16);
		label_1.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Sat\u0131\u015F fiyat\u0131");
		label_2.setBounds(590, 32, 71, 16);
		label_2.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Firma");
		label_3.setBounds(729, 32, 71, 16);
		label_3.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(label_3);
		
		JLabel lblMiktar = new JLabel("Miktar");
		lblMiktar.setBounds(663, 32, 71, 16);
		lblMiktar.setFont(new Font("Dialog", Font.BOLD, 12));
		contentPane.add(lblMiktar);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setBounds(86, 232, 85, 35);
		btnGncelle.setBackground(SystemColor.textHighlight);
		btnGncelle.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnGncelle);
		
		textField = new JTextField();
		textField.setBounds(105, 162, 116, 22);
		textField.setColumns(10);
		contentPane.add(textField);
		
		JButton btnSil = new JButton("Sil");
		btnSil.setBounds(183, 232, 62, 35);
		btnSil.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSil.setBackground(new Color(255, 0, 0));
		contentPane.add(btnSil);
		
		countBox = new JTextField();
		countBox.setBounds(70, 318, 116, 22);
		countBox.setColumns(10);
		contentPane.add(countBox);
		
		JLabel label_4 = new JLabel("Miktar");
		label_4.setBounds(18, 321, 71, 16);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(label_4);
		
		JLabel lblrn = new JLabel("\u00DCr\u00FCn");
		lblrn.setBounds(18, 292, 56, 16);
		lblrn.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblrn);
		
		
		JButton btnStokEkle = new JButton("Stok Ekle");
		btnStokEkle.setBounds(86, 353, 100, 35);
		btnStokEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String my_count =	countBox.getText();
			String my_Product = proCombo.getSelectedItem().toString();
			
		
				try {
					stmt41.executeUpdate("UPDATE product SET ProductCount=ProductCount+ '"+my_count+"' WHERE ProductName = '"+my_Product+"'");
					JOptionPane.showMessageDialog(null, "Stok eklendi");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "HATA" + e1);
				}
			}
		});
		btnStokEkle.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnStokEkle.setBackground(new Color(184, 134, 11));
		contentPane.add(btnStokEkle);
		
		textField_2 = new JTextField();
		textField_2.setBounds(275, 318, 116, 22);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JLabel lblTrIsmi = new JLabel("T\u00FCr ismi");
		lblTrIsmi.setBounds(215, 321, 56, 16);
		lblTrIsmi.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblTrIsmi);
		
		JButton btnTrEkle = new JButton("T\u00FCr Ekle");
		btnTrEkle.setBounds(291, 353, 100, 35);
		btnTrEkle.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTrEkle.setBackground(new Color(184, 134, 11));
		contentPane.add(btnTrEkle);
		
		
		
		JLabel lblrnTr = new JLabel("\u00DCr\u00FCn T\u00FCr\u00FC");
		lblrnTr.setBounds(276, 32, 71, 16);
		lblrnTr.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(lblrnTr);
		
		table = new JTable(tableModel);
		table.setBounds(403, 48, 373, 341);
		contentPane.add(table);
	}
}
