package cafexFinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.SystemColor;

public class kasiyerRezD extends JFrame {

	private JPanel contentPane;
	private JTextField ara;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					kasiyerRezD frame = new kasiyerRezD();
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
	public kasiyerRezD() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setTitle("Rezervasyon D\u00FCzenle CafeX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 433);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(60, 88, 46, 32);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\network.png"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(60, 32, 46, 37);
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\restaurant.png"));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(553, 237, 46, 32);
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\question.png"));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ad Soyad");
		lblNewLabel_6.setBounds(12, 44, 111, 14);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Telefon");
		lblNewLabel_7.setBounds(12, 76, 111, 14);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Tarih");
		lblNewLabel_8.setBounds(298, 216, 132, 14);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Masa No");
		lblNewLabel_9.setBounds(12, 17, 111, 14);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("Not");
		lblNewLabel_11.setBounds(12, 117, 72, 14);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(lblNewLabel_11);
		
		ara = new JTextField();
		ara.setBounds(84, 13, 169, 20);
		contentPane.add(ara);
		ara.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(84, 40, 169, 20);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(84, 71, 169, 20);
		textField_3.setColumns(10);
		contentPane.add(textField_3);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(84, 103, 169, 51);
		contentPane.add(editorPane);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(296, 237, 175, 146);
		contentPane.add(calendar);
		
		JButton btnNewButton = new JButton("KONTROL");
		btnNewButton.setBounds(256, 13, 94, 20);
		btnNewButton.addActionListener(new ActionListener() {
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
			 	try {
			 		
					Class.forName("com.mysql.jdbc.Driver");
					
					Statement stmt=conn.createStatement(); 
					String sql="Select * from rezervation where tableName='"+ara.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql); 
					if(rs.next()) {
						rezduz rd = new rezduz();
						rd.setVisible(true);
						rd.setTitle("Rezervasyon Bilgileri");
					
						
					}
			
					 
					else	{
					JOptionPane.showMessageDialog(null, "Rezervasyon Yok");
						ara.setText("");
					conn.close();
					}}
				catch(Exception b) { System.out.print(b);
				}
				}
			 	
			}
		);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\magnifier.png"));
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnNewButton);
		
		JButton btnDzenle = new JButton("D\u00DCZENLE");
		btnDzenle.setBounds(175, 167, 78, 27);
		btnDzenle.setBackground(new Color(51, 153, 0));
		btnDzenle.setForeground(Color.WHITE);
		btnDzenle.setFont(new Font("Tahoma", Font.BOLD, 8));
		btnDzenle.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\pencil-edit-button.png"));
		btnDzenle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnDzenle);
		
		JButton btnSil = new JButton("S\u0130L");
		btnSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSil.setBounds(84, 167, 78, 27);
		btnSil.setForeground(Color.WHITE);
		btnSil.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSil.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\cancel"));
		btnSil.setBackground(new Color(255, 0, 0));
		contentPane.add(btnSil);
		
		JButton btnGeriDn = new JButton("ANASAYFA");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cashier mg = new Cashier();
				mg.setVisible(true);
				dispose();
			}
		});
		btnGeriDn.setBounds(339, 146, 132, 37);
		btnGeriDn.setBackground(new Color(255, 102, 0));
		btnGeriDn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGeriDn.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\left (1).png"));
		btnGeriDn.setForeground(Color.WHITE);
		contentPane.add(btnGeriDn);
	}
}