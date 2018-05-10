package cafexFinal;

import java.sql.*;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.Toolkit;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;

public class Personal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField nameBox;
	private JTextField surnameBox;
	private JTextField mailBox;
	private JTextField TCBox;
	private JTextField adressBox;
	private JTextField telBox;
	private JPasswordField passBox;
	private JTextField salaryBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personal frame = new Personal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
	public static void GuncelleDB(ResultSet rs,Statement stmt, DefaultTableModel tableModel) throws SQLException {
		
		
	while(rs.next())
	{
		String my_user_data = rs.getString("userName");
		ResultSet ds=stmt.executeQuery("SELECT * FROM duty WHERE dutyID = " + rs.getString("dutyID")); 
		ds.next();
		Object[] objs = {my_user_data,ds.getString("dutyName") };
		
		tableModel.addRow(objs);
		
	}
		

	}
	
	
	/**
	 * Create the frame. 
	 * @throws SQLException 
	 */
	public Personal() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setTitle("Yönetici CafeX - Personel");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 506);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Anasayfa");
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
		
		JComboBox dutyBox = new JComboBox();
		
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
		contentPane.setLayout(null);
		
		

		DefaultTableModel tableModel = new DefaultTableModel();

		tableModel.addColumn("User Name");
		tableModel.addColumn("Görev");
		tableModel.addColumn("TC");
		tableModel.addColumn("Mail");
		tableModel.addColumn("Adres");
		tableModel.addColumn("Tel");
		tableModel.addColumn("Gorev");
		// sdsdlsdsl//

		table = new JTable(tableModel);
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int row = table.getSelectedRow();
				DefaultTableModel model= (DefaultTableModel)table.getModel();
				 
				
				nameBox.setText(String.valueOf(model.getValueAt(row, 0).toString()));
				surnameBox.setText(String.valueOf(model.getValueAt(row, 1).toString()));
				TCBox.setText(String.valueOf(model.getValueAt(row, 2).toString()));
				mailBox.setText(String.valueOf(model.getValueAt(row, 3).toString()));
				adressBox.setText(String.valueOf(model.getValueAt(row, 4).toString()));
				telBox.setText(String.valueOf(model.getValueAt(row, 5).toString()));
			
				dutyBox.setSelectedItem(model.getValueAt(row, 6).toString());
				
				
				
				
				
			}
		});
		table.setForeground(SystemColor.textHighlight);
		table.setFont(new Font("Segoe UI Historic", Font.BOLD, 14));
		
		Connection conn = null;
	 	try {
	           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex?useUnicode=true&characterEncoding=utf-8","root","");
	           
	 		if(conn!=null) {
	 			System.out.println("Connected Succesfully");
	 		}
	 		
	 	}catch(Exception e1) {
	 		System.out.println(e1);
		
	 	}
	 	String duty_name ;
	 	Statement stmt=conn.createStatement(); 
	 	
	 	Statement stmt3=conn.createStatement(); 
	 	Statement stmt5=conn.createStatement();

	 
		
 		//Gorevleri ceker
 		String sql="SELECT\r\n" + 
 				"    users.*,\r\n" + 
 				"    duty.dutyName\r\n" + 
 				"FROM\r\n" + 
 				"    users\r\n" + 
 				"INNER JOIN duty ON users.dutyID = duty.dutyID";
 		ResultSet rs=stmt.executeQuery(sql); 
 		ResultSet rs2=stmt3.executeQuery("SELECT * FROM duty;"); 
		dutyBox.setForeground(SystemColor.desktop);
		dutyBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		dutyBox.setBounds(116, 257, 114, 22); 
		contentPane.add(dutyBox);
		dutyBox.addItem("");
		while (rs2.next()) {
			dutyBox.addItem(rs2.getString("dutyName"));
			//where 1 is column index for table retrived by query
			//where 1 is column index for table retrived by query
		}
		
 

		while(rs.next()){
			
			String my_user_data = rs.getString("userName");
			String my_user_data2 = rs.getString("userSurname");
			String my_user_data3 = rs.getString("userTCno");
			String my_user_data4 = rs.getString("userMail");
			String my_user_data5 = rs.getString("userAdress");
			String my_user_data6 = rs.getString("userTel");
			String my_user_data7 = rs.getString("dutyName");


			Object[] objs = {my_user_data,my_user_data2, my_user_data3, my_user_data4, my_user_data5, my_user_data6, my_user_data7 };
			tableModel.addRow(objs);
			
	    }

		
	

		
		//JTable table = new JTable(tableModel);
		

		table.setBounds(264, 35, 638, 398);
		contentPane.add(table);

		
	 	Statement stmt6=conn.createStatement(); 

		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(173, 216, 230));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gorevli_name = nameBox.getText();
				String gorevli_sname = surnameBox.getText();
				String gorevli_TC = TCBox.getText();
				String gorevli_mail = mailBox.getText();
				String gorevli_adres = adressBox.getText();
				String gorevli_tel = telBox.getText();
				String gorevli_pass = passBox.getText();
				int main_pass = Integer.parseInt(gorevli_pass);
				String gorevli_salary = salaryBox.getText();
				
				
				
				
				
				
				Object gorevli_yetki = dutyBox.getSelectedItem();
				System.out.println(gorevli_name);
				System.out.println(gorevli_yetki);
				try {
				 	ResultSet rs6 = stmt6.executeQuery("SELECT * FROM duty WHERE dutyName='"+gorevli_yetki+"'");//join query
				 	if(rs6.next()){
				 		String d_id = rs6.getString(1);
					 	System.out.println(d_id);
					 	stmt6.executeUpdate("INSERT INTO users(userName,userSurname,userTCno,userMail,userAdress,userTel,dutyID,userSalary,userPassword)"+"VALUES('"+gorevli_name +"',"+"'"+ gorevli_sname +"',"+"'"+  gorevli_TC  +"',"+"'"+  gorevli_mail  +"',"+"'"+  gorevli_adres  +"'," +"'"+  gorevli_tel  +"'," +d_id +",'"+gorevli_salary+"'," + main_pass+")");
					
					 	JOptionPane.showMessageDialog(null, "Kay�t ba�ar�yla eklenmi�tir."); nameBox.setText("");surnameBox.setText("");TCBox.setText("");mailBox.setText("");adressBox.setText("");telBox.setText("");salaryBox.setText("");passBox.setText("");
						
					 	
					 	for(int i = 0;i<tableModel.getRowCount();i++) {
					 		
					 		tableModel.removeRow(i);
					 	}
					 	 
					 		String sql="SELECT\r\n" + 
					 				"    users.userName,\r\n" + 
					 				"    duty.dutyName\r\n" + 
					 				"FROM\r\n" + 
					 				"    users\r\n" + 
					 				"INNER JOIN duty ON users.dutyID = duty.dutyID";
							ResultSet rs=stmt.executeQuery(sql); 
							while(rs.next()){
								
								String my_user_data = rs.getString("userName");
								
								Object[] objs = {my_user_data,rs.getString("dutyName") };
								
								tableModel.addRow(objs);
								
						    }
					 	
				 	}  
				 	
					
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, e1);
					// TODO Auto-generated catch block
				
				}
			}
		});
		btnNewButton.setBounds(12, 358, 114, 36);
		contentPane.add(btnNewButton);
		
		
	
		
		
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGncelle.setBackground(new Color(100, 149, 237));
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int row = table.getSelectedRow();
				DefaultTableModel model= (DefaultTableModel)table.getModel();
				String selected = model.getValueAt(row, 0).toString();

				 if (row >= 0) {
				
				try {
					
					String sql = "UPDATE users SET userName = ?,userSurname = ?, \r\n" + 
							"userTCno = ?,userMail= ?,\r\n" + 
							"userAdress = ?,userTel= ?,\r\n" + 
							"userSalary = ?,userPassword = ? WHERE userName = '"+selected+"'";
					
					PreparedStatement PST = null;
					
					Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
					PST = conn.prepareStatement(sql);
					PST.setString(1, nameBox.getText());
					PST.setString(2, surnameBox.getText());
					PST.setString(3, TCBox.getText());
					PST.setString(4, mailBox.getText());
					PST.setString(5, adressBox.getText());
					PST.setString(6, telBox.getText());
					PST.setString(7, salaryBox.getText());
					PST.setString(8, passBox.getText());
					
					PST.executeUpdate();
					
					JOptionPane.showMessageDialog(null, "GÜNCELLEME BAŞARILI");
					
					
				
					/*
					String gorevli_sname = surnameBox.getText();
					String gorevli_TC = TCBox.getText();
					String gorevli_mail = mailBox.getText();
					String gorevli_adres = adressBox.getText();
					String gorevli_tel = telBox.getText();
					String gorevli_pass = passBox.getText();
					int main_pass = Integer.parseInt(gorevli_pass);
					String gorevli_salary = salaryBox.getText();
					*/
					

				}catch (Exception e3) {
					JOptionPane.showMessageDialog(null, "Güncelleme Başarısız, Bilgileri Kontrol Ediniz."+ e3.getMessage());
					
				}
				
				
				 }
				
				
				
				
				
			}
		});
		btnGncelle.setBounds(138, 358, 114, 36);
		contentPane.add(btnGncelle);
		
		nameBox = new JTextField();
		nameBox.setForeground(SystemColor.desktop);
		nameBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		nameBox.setBounds(116, 57, 114, 22);
		contentPane.add(nameBox);
		nameBox.setColumns(10);
		
		
		
		
		JLabel lblIsim = new JLabel("\u0130sim");
		lblIsim.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblIsim.setBounds(35, 60, 56, 16);
		contentPane.add(lblIsim);
			
		JLabel lblGrev = new JLabel("TC");
		lblGrev.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblGrev.setBounds(35, 124, 56, 16);
		contentPane.add(lblGrev);
		
		surnameBox = new JTextField();
		surnameBox.setForeground(SystemColor.desktop);
		surnameBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		surnameBox.setColumns(10);
		surnameBox.setBounds(116, 92, 114, 22);
		contentPane.add(surnameBox);
		
		JLabel lblSoyisim = new JLabel("Soyisim");
		lblSoyisim.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblSoyisim.setBounds(35, 95, 56, 16);
		contentPane.add(lblSoyisim);
		
		mailBox = new JTextField();
		mailBox.setForeground(SystemColor.desktop);
		mailBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		mailBox.setColumns(10);
		mailBox.setBounds(116, 160, 114, 22);
		contentPane.add(mailBox);
		
		TCBox = new JTextField();
		TCBox.setForeground(SystemColor.desktop);
		TCBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		TCBox.setColumns(10);
		TCBox.setBounds(116, 127, 114, 22);
		contentPane.add(TCBox);
		
		JLabel lblMailAdresi = new JLabel("Mail");
		lblMailAdresi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblMailAdresi.setBounds(35, 163, 69, 16);
		contentPane.add(lblMailAdresi);
		
		adressBox = new JTextField();
		adressBox.setForeground(SystemColor.desktop);
		adressBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		adressBox.setColumns(10);
		adressBox.setBounds(116, 190, 114, 22);
		contentPane.add(adressBox);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblAdres.setBounds(35, 193, 69, 16);
		contentPane.add(lblAdres);
		
		telBox = new JTextField();
		telBox.setForeground(SystemColor.desktop);
		telBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		telBox.setColumns(10);
		telBox.setBounds(116, 222, 114, 22);
		contentPane.add(telBox);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblTelefon.setBounds(35, 225, 69, 16);
		contentPane.add(lblTelefon);
		
		passBox = new JPasswordField();
		passBox.setForeground(SystemColor.desktop);
		passBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		passBox.setBounds(116, 321, 114, 22);
		contentPane.add(passBox);
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblParola.setBounds(35, 324, 69, 16);
		contentPane.add(lblParola);
		
		JLabel lblGrevi = new JLabel("G\u00F6revi");
		lblGrevi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblGrevi.setBounds(35, 260, 69, 16);
		contentPane.add(lblGrevi);
		
		salaryBox = new JTextField();
		salaryBox.setForeground(SystemColor.desktop);
		salaryBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		salaryBox.setColumns(10);
		salaryBox.setBounds(116, 292, 114, 22);
		contentPane.add(salaryBox);
		
		JLabel lblMaa = new JLabel("Maa\u015F");
		lblMaa.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblMaa.setBounds(35, 295, 69, 16);
		contentPane.add(lblMaa);
		
		JButton btnSil = new JButton("Sil");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				 	
					 	stmt6.executeUpdate("DELETE FROM users WHERE userTCno ='"+ TCBox.getText()+"'");
					
					 	JOptionPane.showMessageDialog(null, "Kayıt başarıyla silinmiştir."); 
					 	nameBox.setText("");surnameBox.setText("");TCBox.setText("");mailBox.setText("");
					 	adressBox.setText("");telBox.setText("");salaryBox.setText("");passBox.setText("");
					 	
					 	
					 	DefaultTableModel tbl = (DefaultTableModel)table.getModel();
					 	tbl.getDataVector().removeAllElements();
					 	tbl.fireTableDataChanged();
					  	
						String sql="SELECT\r\n" + 
				 				"    users.userName,\r\n" + 
				 				"    duty.dutyName\r\n" + 
				 				"FROM\r\n" + 
				 				"    users\r\n" + 
				 				"INNER JOIN duty ON users.dutyID = duty.dutyID";
						ResultSet rs=stmt.executeQuery(sql); 
	
	while(rs.next()){
		
		String my_user_data = rs.getString("userName");
		String my_user_data2 = rs.getString("userSurname");
		String my_user_data3 = rs.getString("userTCno");
		String my_user_data4 = rs.getString("userMail");
		String my_user_data5 = rs.getString("userAdress");
		String my_user_data6 = rs.getString("userTel");
		String my_user_data7 = rs.getString("dutyName");


		Object[] objs = {my_user_data,my_user_data2, my_user_data3, my_user_data4, my_user_data5, my_user_data6, my_user_data7 };
		tableModel.addRow(objs);
		
    }
					 	
					 	
				
					
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, e1);
					// TODO Auto-generated catch block
				
				}
			
				
				
			}
		});
		btnSil.setForeground(new Color(255, 255, 0));
		btnSil.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSil.setBackground(new Color(0, 0, 205));
		btnSil.setBounds(74, 397, 114, 36);
		contentPane.add(btnSil);
		
		JLabel lblIsim_1 = new JLabel("İsim");
		lblIsim_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIsim_1.setBounds(264, 13, 56, 16);
		contentPane.add(lblIsim_1);
		
		JLabel lblSoyisim_1 = new JLabel("Soyisim");
		lblSoyisim_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSoyisim_1.setBounds(351, 13, 56, 16);
		contentPane.add(lblSoyisim_1);
		
		JLabel lblTc = new JLabel("TC");
		lblTc.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTc.setBounds(453, 13, 56, 16);
		contentPane.add(lblTc);
		
		JLabel lblMail = new JLabel("Mail");
		lblMail.setFont(new Font("Dialog", Font.BOLD, 12));
		lblMail.setBounds(549, 13, 71, 16);
		contentPane.add(lblMail);
		
		JLabel lblAdres_1 = new JLabel("Adres");
		lblAdres_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblAdres_1.setBounds(644, 13, 71, 16);
		contentPane.add(lblAdres_1);
		
		JLabel lblTelefon_1 = new JLabel("Telefon");
		lblTelefon_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblTelefon_1.setBounds(727, 13, 71, 16);
		contentPane.add(lblTelefon_1);
		
		JLabel lblGrevi_1 = new JLabel("Görevi");
		lblGrevi_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblGrevi_1.setBounds(815, 13, 71, 16);
		contentPane.add(lblGrevi_1);
		
	
		
		
	
	}
}
