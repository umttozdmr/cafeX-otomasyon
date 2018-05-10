package cafexFinal;


import java.sql.*;
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

import com.mysql.jdbc.Statement;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class rezekle extends JFrame  {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rezekle frame = new rezekle();
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
	
	public rezekle() throws SQLException{
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setTitle("Rezervasyon Ekle CafeX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 375);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\network.png"));
		lblNewLabel.setBounds(81, 49, 46, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\phone-call.png"));
		lblNewLabel_1.setBounds(81, 109, 46, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\calendar.png"));
		lblNewLabel_2.setBounds(589, 331, 46, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\restaurant.png"));
		lblNewLabel_3.setBounds(81, 194, 46, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\maid.png"));
		lblNewLabel_4.setBounds(81, 259, 46, 32);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\notepad.png"));
		lblNewLabel_5.setBounds(81, 331, 46, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Ad Soyad");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(12, 41, 126, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Telefon");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(12, 68, 126, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblMasaNo = new JLabel("Masa");
		lblMasaNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMasaNo.setBounds(12, 94, 127, 14);
		contentPane.add(lblMasaNo);
		
		JLabel lblPersonelAd = new JLabel("Personel");
		lblPersonelAd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPersonelAd.setBounds(11, 127, 127, 14);
		contentPane.add(lblPersonelAd);
		
		JLabel lblNotlar = new JLabel("NOTLAR");
		lblNotlar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNotlar.setBounds(12, 167, 127, 14);
		contentPane.add(lblNotlar);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField.setBounds(81, 37, 158, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(81, 61, 158, 20);
		contentPane.add(textField_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Tahoma", Font.BOLD, 14));
		editorPane.setBounds(81, 160, 158, 86);
		contentPane.add(editorPane);
		
		JLabel lblTarih = new JLabel("Tarih");
		lblTarih.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTarih.setBounds(264, 49, 126, 32);
		contentPane.add(lblTarih);
		

	 	
	 	
	 	
	 	
		JComboBox masaCombo = new JComboBox();
		masaCombo.setFont(new Font("Tahoma", Font.BOLD, 13));
		masaCombo.setBounds(81, 88, 158, 20);
		contentPane.add(masaCombo);
		 
       
	
		
		

	
	 	

	 	
	 	
		
		
		
		
	
		JButton btnNewButton = new JButton("EKLE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}

		});
		
	
	 	
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\ok-mark (1).png"));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(51, 153, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(79, 284, 72, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u0130PTAL");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\left (1).png"));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 102, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(167, 284, 72, 34);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 13));
		comboBox.setBounds(81, 121, 158, 20);
		contentPane.add(comboBox);
		
		
		JButton btnAnasayfa = new JButton("ANASAYFA");
		btnAnasayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager mg = new Manager();
				mg.setVisible(true);
				dispose();
			}
		});
		btnAnasayfa.setForeground(Color.WHITE);
		btnAnasayfa.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAnasayfa.setBackground(new Color(255, 102, 0));
		btnAnasayfa.setBounds(344, 288, 91, 34);
		contentPane.add(btnAnasayfa);
	}
}