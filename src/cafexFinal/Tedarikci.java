package cafexFinal;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tedarikci extends JFrame {

	private JPanel contentPanel;
	private JTable table;
	private JTextField compName;
	private JTextField compAdres;
	private JTextField compTel;
	private JTextField compMail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tedarikci frame = new Tedarikci();
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
	public Tedarikci() throws SQLException {
		setTitle("Yönetici CafeX - Tedarikçi");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 797, 333);
		
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
		menuBar.add(menu);
		
		JMenu menu_5 = new JMenu("Masa");
		menuBar.add(menu_5);
		
		JMenuItem menuItem_1 = new JMenuItem("Masalar");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Masalar1 ms = new Masalar1();
				ms.setVisible(true);
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
		contentPanel = new JPanel();
		contentPanel.setBackground(SystemColor.inactiveCaption);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPanel);
		contentPanel.setLayout(null);
		
		JComboBox<String> compCombo = new JComboBox<String>();
		compCombo.setBounds(183, 186, 84, 22);
		contentPanel.add(compCombo);

		
		DefaultTableModel tableModel = new DefaultTableModel();

		tableModel.addColumn("Firma Ad�");
		tableModel.addColumn("Adres");
		tableModel.addColumn("Telefon");
		tableModel.addColumn("Mail");
		

		// sdsdlsdsl//

		
		
		
		table = new JTable(tableModel);
		
		
		
		Connection conn = null;
	 	try {
	           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
	           
	 		if(conn!=null) {
	 			System.out.println("Connected Succesfully");
	 		}
	 	}catch(Exception e1) {
	 		System.out.println(e1);
	 	}
	 	
	 	
	 	Statement stmt = conn.createStatement();
	 	
	 	String sql = "SELECT * FROM company;";
	 	
	 	ResultSet rs = stmt.executeQuery(sql);
	 	
while(rs.next()){
			
			String my_comp_data = rs.getString("CompanyName");
			String my_comp_data2 = rs.getString("CompanyAdress");
			String my_comp_data3 = rs.getString("CompanyTel");
			String my_comp_data4 = rs.getString("CompanyMail");
			
			compCombo.addItem(rs.getString("CompanyName"));
			
			Object[] objs = {my_comp_data, my_comp_data2, my_comp_data3, my_comp_data4};
			
			tableModel.addRow(objs);
			
}

	 	
	 		
	 		
	 	table.setBounds(279, 33, 488, 189);
		contentPanel.add(table);
	 		
		Object my_comp = compCombo.getSelectedItem();
		
		JButton compSil = new JButton("Sil");
		compSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Connection conn = null;
	
			try {
				
				String del_sql = "DELETE FROM company WHERE CompanyName= ?";
			//	@SuppressWarnings("null")
				PreparedStatement  stmt7 = conn.prepareStatement(del_sql);
				stmt7.setString(1,(String) my_comp);
				stmt7.executeUpdate(); 
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	
			
			
			
			
			}
		});
		compSil.setFont(new Font("Tahoma", Font.BOLD, 13));
		compSil.setBackground(Color.RED);
		compSil.setBounds(205, 225, 62, 35);
		contentPanel.add(compSil);
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
	 		
		
		JLabel lblFirmaAd_1 = new JLabel("Firma ad\u0131");
		lblFirmaAd_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFirmaAd_1.setBounds(279, 13, 71, 16);
		contentPanel.add(lblFirmaAd_1);
		
		JLabel lblAdres_1 = new JLabel("Adres");
		lblAdres_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAdres_1.setBounds(414, 13, 56, 16);
		contentPanel.add(lblAdres_1);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTelefon.setBounds(534, 13, 71, 16);
		contentPanel.add(lblTelefon);
		
		JLabel lblMail_1 = new JLabel("Mail");
		lblMail_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMail_1.setBounds(661, 13, 48, 16);
		contentPanel.add(lblMail_1);
		
		compName = new JTextField();
		compName.setColumns(10);
		compName.setBounds(105, 13, 116, 22);
		contentPanel.add(compName);
		
		JLabel lblFirmaAd = new JLabel("Firma ad\u0131");
		lblFirmaAd.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblFirmaAd.setBounds(18, 16, 75, 16);
		contentPanel.add(lblFirmaAd);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAdres.setBounds(18, 49, 56, 16);
		contentPanel.add(lblAdres);
		
		compAdres = new JTextField();
		compAdres.setColumns(10);
		compAdres.setBounds(105, 48, 116, 55);
		contentPanel.add(compAdres);
		
		JLabel lblTedarik = new JLabel("Telefon");
		lblTedarik.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblTedarik.setBounds(18, 119, 71, 16);
		contentPanel.add(lblTedarik);
		
		compTel = new JTextField();
		compTel.setColumns(10);
		compTel.setBounds(105, 116, 116, 22);
		contentPanel.add(compTel);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblMail.setBounds(18, 157, 71, 16);
		contentPanel.add(lblMail);
		
		Statement stmt2 = conn.createStatement();
	
		
		
		JButton compEkle = new JButton("Ekle");
		compEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    String getCompName = compName.getText();
				String getCompAdres = compAdres.getText();
				String getCompTel = compTel.getText();
				String getCompMail = compMail.getText();
				
				try {
	                    stmt2.executeUpdate("INSERT INTO company(CompanyName,CompanyAdress,CompanyTel,CompanyMail)"+"VALUES('"+getCompName +"',"+"'"+ getCompAdres +"',"+"'"+  getCompTel  +"',"+"'"+  getCompMail  +"')");
					
					 	JOptionPane.showMessageDialog(null, "Kayıt başarıyla eklenmiştir."); compName.setText("");compAdres.setText("");compMail.setText("");compTel.setText(""); 
				

				}
               	catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, e1);
				
				}
				}
			
		});
		compEkle.setFont(new Font("Tahoma", Font.BOLD, 13));
		compEkle.setBackground(SystemColor.activeCaption);
		compEkle.setBounds(12, 186, 62, 35);
		contentPanel.add(compEkle);
		
		JButton compGuncel = new JButton("G\u00FCncelle");
		compGuncel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					
		
			}
		});
		compGuncel.setFont(new Font("Tahoma", Font.BOLD, 13));
		compGuncel.setBackground(SystemColor.textHighlight);
		compGuncel.setBounds(86, 186, 85, 35);
		contentPanel.add(compGuncel);
		
		
		
		compMail = new JTextField();
		compMail.setColumns(10);
		compMail.setBounds(105, 151, 116, 22);
		contentPanel.add(compMail);
		
	
	}
}
