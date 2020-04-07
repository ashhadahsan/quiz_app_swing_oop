import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class WelcomeFrame extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lblLogin;
	private JLabel lblWelcomeToTesting;
	private JButton btnSignup;
	private JButton btnLogin;
	private JLabel lblSignup;
	private JButton btnAdmin;
	private JSeparator separator;
	private JLabel lblAdminLogin;



	/**
	 * Create the frame.
	 */
	
	@SuppressWarnings("deprecation")
	public WelcomeFrame() {
		super("Welcome");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\welcome.png"));
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 611, 378);
		

	setResizable(true);
		setLayout(null);
		int handCursor = HAND_CURSOR;
		super.setCursor(handCursor);
		
		
		lblLogin = new JLabel("NEW HERE ?");
		lblLogin.setFont(new Font("Arial Black", Font.BOLD, 12));
		lblLogin.setBounds(77, 193, 91, 29);
	add(lblLogin);
		
		lblSignup = new JLabel("OLD USER ?");
		lblSignup.setFont(new Font("Arial Black", Font.BOLD, 11));
		lblSignup.setBounds(77, 268, 91, 29);
		add(lblSignup);
		
		lblWelcomeToTesting = new JLabel("WELCOME  TO TESTING SERVICE");
		
		lblWelcomeToTesting.setFont(new Font("Arial Black", Font.PLAIN, 18));
		lblWelcomeToTesting.setBounds(110, 28, 354, 71);
		lblWelcomeToTesting.setForeground(Color.RED);
		add(lblWelcomeToTesting);
		
		btnSignup = new JButton(""); //SignUpButton

		btnSignup.setIcon(new ImageIcon("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\signupf  (1).png"));
		btnSignup.setBounds(242, 184, 55, 49);
		add(btnSignup);
		
		btnLogin = new JButton("");
	
	
		
		
		btnAdmin = new JButton("");
		btnAdmin.setIcon(new ImageIcon("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\admin.png"));
		
		btnAdmin.setBounds(490, 184, 55, 49);
		add(btnAdmin);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(320, 141, 91, 184);
		add(separator);
		
		
		lblAdminLogin = new JLabel("Admin Login");
		lblAdminLogin.setBounds(357, 201, 91, 29);
		lblAdminLogin.setFont(new Font("Arial Black", Font.BOLD, 12));
		
	add(lblAdminLogin);
	btnLogin.setIcon(new ImageIcon("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\login.png"));
	btnLogin.setBounds(242, 259, 55, 49);
	add(btnLogin);
	
	btnLogin.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
		JButton check=(JButton) e.getSource();
		if(check==btnLogin) {
			dispose();
			new LoginFrame();
	
		}
			
		}
		
	});
	btnSignup.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton check=(JButton) e.getSource();

			if(check==btnSignup) {
				dispose();
				new SignupFrame();
		
			}
			
		}
		
	});
	btnAdmin.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton check=(JButton)e.getSource();
			if(check==btnAdmin) {
				dispose();
				JOptionPane.showMessageDialog(null, "Users are not allowed","Admin Panel",JOptionPane.WARNING_MESSAGE,null);
				String passcode=JOptionPane.showInputDialog(null, "Enter passcode");
				if(passcode.equals("54321")) {
					new AdminLoginFrame();
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid passcode","Warning,",JOptionPane.WARNING_MESSAGE);
					new WelcomeFrame();
				}
				
				
			}
			
			
			
		}
		
	});

	setVisible(true);

	}
	
	

	public static void main(String[] args) {

				WelcomeFrame frame=new WelcomeFrame();
				
			}




			
		
		}
