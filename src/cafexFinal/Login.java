package cafexFinal;

import java.sql.*;
import java.util.Objects;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField Pass;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btnC;
	private JButton btn1;
	private JButton btn0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login CafeX");
		setForeground(new Color(0, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 499);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Pass = new JPasswordField(11);
		Pass.setBounds(80, 136, 186, 46);
		Pass.setFont(new Font("Tahoma", Font.BOLD, 24));
		contentPane.add(Pass);
		Pass.setColumns(10);
		
		JButton btnGiri = new JButton("");
		btnGiri.setBounds(212, 364, 54, 46);
		btnGiri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
			 	try {
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}try {
			 		
				Class.forName("com.mysql.jdbc.Driver");
				
				Statement stmt=conn.createStatement(); 
				String sql="Select * from users where userPassword='"+Pass.getText().toString()+"'";
				ResultSet rs=stmt.executeQuery(sql); 
				if(rs.next()) {
					
					if(Objects.equals(rs.getString("dutyID"), new String("0"))) {
						Manager mg=new Manager();
					
						mg.setVisible(true);
					    dispose();
					}
					else if(Objects.equals(rs.getString("dutyID"), new String("1"))) {
						Waiter wt=new Waiter();
						wt.setVisible(true);
					    dispose();
						
					}	else if(Objects.equals(rs.getString("dutyID"), new String("2"))) {
						Cashier cr=new Cashier();
						cr.setVisible(true);
					    dispose();
					    
					}
					else if(Objects.equals(rs.getString("dutyID"), new String("3"))) {
						mutfakG kt=new mutfakG();
						kt.setVisible(true);
					    dispose();
					    }
		
				}
		
				 
				else	{
					JOptionPane.showMessageDialog(null, "Yanl�� parola girdiniz. Yeniden deneyin ya da y�neticinize ba�vurun."); Pass.setText("");
				conn.close();
				}}
			catch(Exception b) { System.out.print(b);
			}
			}
		
		
				
				
				
			
		});
		btnGiri.setIcon(new ImageIcon("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\ok-mark (1).png"));
		btnGiri.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btnGiri.setBackground(new Color(50, 205, 50));
		btnGiri.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnGiri);
		
		btn2 = new JButton("2");
		btn2.setBounds(146, 195, 54, 46);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn2.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn2.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn2.setBackground(new Color(70, 130, 180));
		contentPane.add(btn2);
		
		btn3 = new JButton("3");
		btn3.setBounds(212, 195, 54, 46);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn3.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn3.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn3.setBackground(new Color(70, 130, 180));
		contentPane.add(btn3);
		
		btn4 = new JButton("4");
		btn4.setBounds(80, 250, 54, 46);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn4.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn4.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn4.setBackground(new Color(70, 130, 180));
		contentPane.add(btn4);
		
		btn5 = new JButton("5");
		btn5.setBounds(146, 250, 54, 46);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn5.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn5.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn5.setBackground(new Color(70, 130, 180));
		contentPane.add(btn5);
		
		btn6 = new JButton("6");
		btn6.setBounds(212, 250, 54, 46);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn6.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn6.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn6.setBackground(new Color(70, 130, 180));
		contentPane.add(btn6);
		
		btn7 = new JButton("7");
		btn7.setBounds(80, 305, 54, 46);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn7.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn7.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn7.setBackground(new Color(70, 130, 180));
		contentPane.add(btn7);
		
		btn8 = new JButton("8");
		btn8.setBounds(146, 305, 54, 46);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn8.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn8.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn8.setBackground(new Color(70, 130, 180));
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(212, 305, 54, 46);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn9.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn9.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn9.setBackground(new Color(70, 130, 180));
		contentPane.add(btn9);
		
		btnC = new JButton("");
		btnC.setBounds(80, 364, 54, 46);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Pass.setText("");
			}
			
		});
		btnC.setIcon(new ImageIcon("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\eraser.png"));
		btnC.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnC.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btnC.setBackground(new Color(178, 34, 34));
		contentPane.add(btnC);
		
		btn1 = new JButton("1");
		btn1.setBounds(80, 195, 54, 46);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn1.getText();
				Pass.setText(EnterNumber );
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn1.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn1.setBackground(new Color(70, 130, 180));
		contentPane.add(btn1);
		
		btn0 = new JButton("0");
		btn0.setBounds(146, 364, 54, 46);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = Pass.getText() + btn0.getText();
				Pass.setText(EnterNumber );
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn0.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btn0.setBackground(new Color(70, 130, 180));
		contentPane.add(btn0);
		
		JLabel lblGiriEkran = new JLabel("G\u0130R\u0130\u015E EKRANI");
		lblGiriEkran.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblGiriEkran.setBounds(72, 58, 252, 74);
		contentPane.add(lblGiriEkran);
	}
}
