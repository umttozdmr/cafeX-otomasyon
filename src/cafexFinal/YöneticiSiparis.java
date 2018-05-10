package cafexFinal;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.TableModel;
import java.awt.SystemColor;
import java.awt.Toolkit;

public class YöneticiSiparis extends JFrame {

	private JPanel contentPane;
	private JTextField adet;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					YöneticiSiparis frame = new YöneticiSiparis();
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
	public YöneticiSiparis() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setTitle("Kasiyer CafeX - Sipariş");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 880, 620);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Anasayfa");
		menu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cashier cs = new Cashier();
				cs.setVisible(true);
				dispose();
			}
		});
		menuBar.add(menu);
		
		JMenu menu_3 = new JMenu("Masa");
		menuBar.add(menu_3);
		
		JMenuItem menuItem = new JMenuItem("Masalar");
		menuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kasiyerMas ks = new kasiyerMas();
				ks.setVisible(true);
				dispose();
			}
		});
		menu_3.add(menuItem);
		
		JMenu menu_4 = new JMenu("Rezervasyon");
		menu_3.add(menu_4);
		
		JMenuItem menuItem_1 = new JMenuItem("Rezervasyon Ekle");
		menuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 kasiyerRezE kre = new kasiyerRezE();
			 kre.setVisible(true);
			 dispose();
			}
		});
		menu_4.add(menuItem_1);
		
		JMenuItem menuItem_2 = new JMenuItem("Rezervasyon Düzenle");
		menuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kasiyerRezD kre = new kasiyerRezD();
				 kre.setVisible(true);
				 dispose();
			}
		});
		menu_4.add(menuItem_2);
		
		JMenu menu_1 = new JMenu("Mutfak");
		menu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				kasiyerMut km;
				try {
					km = new kasiyerMut();
					km.setVisible(true);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
				dispose();
			}
		});
		menuBar.add(menu_1);
		
		JMenu menu_2 = new JMenu("Oturumu kapat");
		menuBar.add(menu_2);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("      Masa 1");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(12, 13, 149, 28);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		contentPane.setLayout(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 102, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\dining-table (1).png"));
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("   GER\u0130 D\u00D6N");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(713, 1, 149, 40);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Butonlar mm = new Butonlar();
			mm.setVisible(true);
			dispose();
	
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\left (1).png"));
		btnNewButton_1.setBackground(new Color(255, 102, 0));
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("   FAST FOOD");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_2.setBounds(12, 71, 135, 53);
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\hamburger.png"));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(51, 204, 51));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
			 		Connection conn = null;
			 		
					Class.forName("com.mysql.jdbc.Driver");
					conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
					
					Statement stmt=conn.createStatement(); 
					String sql="Select * from product";
					ResultSet rs=stmt.executeQuery(sql); 
					System.out.println(rs);
					
					
					
					
					
				}catch(Exception e1) {
			 		System.out.println(e1);
			 	
			}}
		});
		contentPane.add(btnNewButton_2);
		
		JButton btnTatllar = new JButton("   TATLILAR");
		btnTatllar.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnTatllar.setBounds(12, 137, 135, 53);
		btnTatllar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
			 	try {
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}
			}
		});
		btnTatllar.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\muffin.png"));
		btnTatllar.setForeground(new Color(255, 255, 255));
		btnTatllar.setBackground(new Color(255, 0, 255));
		contentPane.add(btnTatllar);
		
		JButton btnDondurma = new JButton("   DONDURMA");
		btnDondurma.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDondurma.setBounds(12, 200, 135, 53);
		btnDondurma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
			 	try {
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}
			}
		});
		btnDondurma.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\ice-cream.png"));
		btnDondurma.setForeground(new Color(255, 255, 255));
		btnDondurma.setBackground(new Color(255, 204, 51));
		contentPane.add(btnDondurma);
		
		JButton btnScakIecekler = new JButton(" SICAK \u0130\u00C7ECEKLER");
		btnScakIecekler.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnScakIecekler.setBounds(12, 266, 135, 53);
		btnScakIecekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
			 	try {
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}
			}
		});
		btnScakIecekler.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cup (1).png"));
		btnScakIecekler.setForeground(new Color(255, 255, 255));
		btnScakIecekler.setBackground(new Color(255, 0, 51));
		contentPane.add(btnScakIecekler);
		
		JButton btnSoukIecekler = new JButton("SO\u011EUK \u0130\u00C7ECEKLER");
		btnSoukIecekler.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSoukIecekler.setBounds(12, 332, 135, 53);
		btnSoukIecekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
			 	try {
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}
			}
			
		});
		btnSoukIecekler.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cola (2).png"));
		btnSoukIecekler.setForeground(new Color(255, 255, 255));
		btnSoukIecekler.setBackground(new Color(0, 102, 204));
		contentPane.add(btnSoukIecekler);
		
		adet = new JTextField();
		adet.setBounds(694, 71, 156, 40);
		adet.setColumns(10);
		contentPane.add(adet);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn1.setBounds(694, 124, 44, 40);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adet.setText(adet.getText()+"1");
			}
		});
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn2.setBounds(750, 124, 44, 40);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adet.setText(adet.getText()+"2");
			}
			
		});
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn3.setBounds(806, 124, 44, 40);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"3");
			}
		});
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn4.setBounds(694, 175, 44, 40);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"4");
			}
		});
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn5.setBounds(750, 175, 44, 40);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"5");
			}
		});
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn8.setBounds(750, 228, 44, 40);
		btn8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"8");
			}
		});
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn7.setBounds(694, 228, 44, 40);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"7");
			}
		});
		contentPane.add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.setBounds(806, 175, 44, 40);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"6");
			}
		});
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.setBounds(806, 228, 44, 40);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"9");
			}
		});
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn0.setBounds(806, 281, 44, 40);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"0");
			}
		});
		contentPane.add(btn0);
		
		JButton btnC = new JButton("c");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnC.setBounds(694, 281, 100, 40);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back=null;
				if (adet.getText().length()>0)
				{
					StringBuilder strB= new StringBuilder(adet.getText());
					strB.deleteCharAt(adet.getText().length()-1);
					back=strB.toString();
					adet.setText(back);
				}
			}
		});
		contentPane.add(btnC);
		
		JButton btnSipariOnay = new JButton("Sipari\u015F Onay");
		btnSipariOnay.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSipariOnay.setBounds(694, 330, 156, 45);
		btnSipariOnay.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\ok-mark (1).png"));
		btnSipariOnay.setForeground(Color.WHITE);
		btnSipariOnay.setBackground(new Color(51, 153, 0));
		contentPane.add(btnSipariOnay);
		
		JButton btnSipariIptal = new JButton("  Sipari\u015F \u0130ptal");
		btnSipariIptal.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSipariIptal.setBounds(694, 388, 156, 45);
		btnSipariIptal.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cancel"));
		btnSipariIptal.setForeground(Color.WHITE);
		btnSipariIptal.setBackground(new Color(255, 0, 0));
		contentPane.add(btnSipariIptal);
		
		JLabel lbldemeekli = new JLabel("\u00D6deme \u015Eekli");
		lbldemeekli.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbldemeekli.setBounds(203, 429, 118, 20);
		contentPane.add(lbldemeekli);
		
		JLabel lblAraToplam = new JLabel("Ara Toplam");
		lblAraToplam.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblAraToplam.setBounds(203, 470, 70, 20);
		contentPane.add(lblAraToplam);
		
		JLabel lblGenelToplam = new JLabel("Genel Toplam");
		lblGenelToplam.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblGenelToplam.setBounds(203, 511, 94, 20);
		contentPane.add(lblGenelToplam);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setBounds(300, 466, 175, 28);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JComboBox costBox = new JComboBox();
		costBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		costBox.setBounds(300, 425, 175, 28);
		contentPane.add(costBox);
		costBox.addItem("Kredi Kartı");
		costBox.addItem("Nakit");
		costBox.addItem("Multinet");

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_2.setBounds(300, 507, 175, 28);
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		JButton btnNewButton_3 = new JButton("  \u00D6deme Yap");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_3.setBounds(508, 413, 113, 52);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
			 	try {
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}
			}
		});
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\turkish-lira.png"));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 204, 153));
		contentPane.add(btnNewButton_3);
		
		JButton btnHesabKapat = new JButton("Hesab\u0131 Kapat");
		btnHesabKapat.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHesabKapat.setBounds(508, 478, 113, 53);
		btnHesabKapat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
		
		DefaultTableModel tableModel = new DefaultTableModel();

		tableModel.addColumn("Ürün adı");
		tableModel.addColumn("Adet");
		tableModel.addColumn("Fiyat");
		
		Connection conn = null;
	 	try {
	           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
	           
	 		if(conn!=null) {
	 			System.out.println("Connected Succesfully");
	 		}
	 		
	 	}catch(Exception e1) {
	 		System.out.println(e1);
		
	 	}
		
	 	
	 try {
	 	Statement stmt = conn.createStatement();
	 	
	 	String sql = "SELECT * FROM product;";
	 	
	 	ResultSet rs = stmt.executeQuery(sql);
	 	
while(rs.next()){
			
			String my_comp_data = rs.getString("ProductName");
			String my_comp_data2 = rs.getString("ProductCount");
			String my_comp_data3 = rs.getString("ProductSellPrice");
			
			
		
			
			Object[] objs = {my_comp_data, my_comp_data2, my_comp_data3};
			
			tableModel.addRow(objs);
			}}

	catch(Exception e1) {
 		System.out.println(e1);
	
 	}

	
			

	
		
		
		btnHesabKapat.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\list.png"));
		btnHesabKapat.setForeground(new Color(255, 255, 255));
		btnHesabKapat.setBackground(new Color(255, 51, 51));
		contentPane.add(btnHesabKapat);
		
		table = new JTable(tableModel);
		table.setBounds(193, 71, 182, 314);
		contentPane.add(table);
		
		table_1 = new JTable((TableModel) null);
		table_1.setBounds(439, 71, 182, 314);
		contentPane.add(table_1);
		
		JLabel lblMenIerik = new JLabel("Menü İçerik");
		lblMenIerik.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMenIerik.setBounds(203, 43, 118, 20);
		contentPane.add(lblMenIerik);
		
		JLabel lblSipariler = new JLabel("Siparişler");
		lblSipariler.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblSipariler.setBounds(439, 46, 118, 20);
		contentPane.add(lblSipariler);
		
		JLabel lblAdet = new JLabel("Adet");
		lblAdet.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAdet.setBounds(690, 46, 118, 20);
		contentPane.add(lblAdet);
	}
}