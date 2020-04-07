


import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class LoginFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField tfuname;
	private JPasswordField pwd;
	private JLabel lblPassword;
	private JLabel lblUserName;
	private JButton btnBack;
	private JLabel lblBack;

	/**
	 * Launch the application.
	 */

	public LoginFrame() {
		super("Login");
		getContentPane().setFont(new Font("Arial Black", Font.BOLD, 11));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\welcome.png"));
		setVisible(true);
		
		setTitle("Login");
        setExtendedState(JFrame.MAXIMIZED_BOTH); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 611, 378);
		
	
	
		setLayout(null);
	
	lblUserName = new JLabel("User Name");
	lblUserName.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblUserName.setBounds(123, 82, 81, 14);
	add(lblUserName);
	
	lblPassword = new JLabel("Password");
	lblPassword.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblPassword.setBounds(123, 128, 81, 14);
	add(lblPassword);
	
	
	tfuname = new JTextField();
	tfuname.setBounds(265, 80, 96, 20);
	add(tfuname);
	
	
	pwd = new JPasswordField();
	pwd.setBounds(265, 128, 96, 20);
	add(pwd);
	
	btnBack = new JButton("");
	btnBack.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new SignupFrame();
			
		}
		
	});
	
	/*btnBack.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	});*/
	btnBack.setIcon(new ImageIcon("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\back.png"));
	btnBack.setBounds(540, 289, 55, 49);
	add(btnBack);
	
	JButton btnSubmit = new JButton("");
	btnSubmit.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
		}
	});
	btnSubmit.setIcon(new ImageIcon("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\submit.png"));
	btnSubmit.setBounds(306, 173, 55, 49);
	add(btnSubmit);
	
	lblBack = new JLabel("Back");
	lblBack.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblBack.setBounds(482, 308, 48, 14);
	add(lblBack);
	}
}
