import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class SignupFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSeparator separator;
	private JTextField tfName;
	private JTextField tfcno;
	private JTextField tfage;
	private JTextField tfmail;
	private JTextField tfuname;
	private JPasswordField pwd;

	private JLabel lblFullName;
	private JLabel lblCntctno;
	private JLabel lblAge;
	private JLabel lblNewLabel;
	private JRadioButton rdbtnMale;
	private JRadioButton rdbtnFmale;
	
	private JLabel lblPassword;
	private JLabel lblUserName;
	private JLabel lblEmail;
	private ButtonGroup bg;
	private JButton btnBack;
	private JLabel lblBack;
	private JButton btnSubmit;
	public SignupFrame() {
		
		super("Registration");

		setFont(new Font("Arial Black", Font.BOLD, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\welcome.png"));
		
	
        setExtendedState(JFrame.MAXIMIZED_BOTH); 

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 500, 612, 378);
		setVisible(true);
		
	
	
		setLayout(null);
		
		separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(231, 12, 2, 327);
		add(separator);
	
	lblFullName = new JLabel("Full Name");
	lblFullName.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblFullName.setBounds(10, 41, 81, 14);
	add(lblFullName);
	
	lblCntctno = new JLabel("Contact no");
	lblCntctno.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblCntctno.setBounds(10, 82, 81, 14);
	add(lblCntctno);
	
	lblAge = new JLabel("Age");
	lblAge.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblAge.setBounds(10, 128, 81, 14);
	add(lblAge);
	
	lblNewLabel = new JLabel("Gender");
	lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblNewLabel.setBounds(10, 170, 81, 14);
	add(lblNewLabel);
	
	lblUserName = new JLabel("User Name");
	lblUserName.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblUserName.setBounds(291, 82, 81, 14);
	add(lblUserName);
	
	lblPassword = new JLabel("Password");
	lblPassword.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblPassword.setBounds(291, 128, 81, 14);
	add(lblPassword);
	
	
	
	lblEmail = new JLabel("Email");
	lblEmail.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblEmail.setBounds(291, 41, 48, 14);
	add(lblEmail);
	
	tfName = new JTextField();
	tfName.setBounds(121, 39, 96, 20);
	add(tfName);
	
	
	tfcno = new JTextField();
	tfcno.setBounds(121, 80, 96, 20);
	add(tfcno);

	
	tfage = new JTextField();
	tfage.setBounds(121, 128, 96, 20);
	add(tfage);
	
	
	
	
	rdbtnMale = new JRadioButton("Male");
	rdbtnMale.setFont(new Font("Arial Black", Font.BOLD, 12));
	rdbtnMale.setBounds(98, 166, 109, 23);
	add(rdbtnMale);
	
	rdbtnFmale = new JRadioButton("Female");
	rdbtnFmale.setFont(new Font("Arial Black", Font.BOLD, 12));
	rdbtnFmale.setBounds(98, 193, 109, 23);
	add(rdbtnFmale);
	bg=new ButtonGroup();
	bg.add(rdbtnMale);
	bg.add(rdbtnFmale);
	rdbtnFmale.setEnabled(true);
	
	rdbtnMale.setActionCommand("Male");
	rdbtnFmale.setActionCommand("FeMale");

	
	tfmail = new JTextField();
	tfmail.setBounds(415, 39, 96, 20);
	add(tfmail);
	tfmail.setColumns(10);
	
	tfuname = new JTextField();
	tfuname.setBounds(415, 80, 96, 20);
	getContentPane().add(tfuname);
	
	
	pwd = new JPasswordField();
	pwd.setBounds(415, 126, 96, 20);
	add(pwd);
	pwd.setEchoChar('*');
	
	
	
	btnSubmit = new JButton("");
	btnSubmit.setBounds(250, 289, 89, 23);
	btnSubmit.setIcon(new ImageIcon("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\submit.png"));
	btnSubmit.setBounds(519, 193, 55, 49);
	add(btnSubmit);
	lblBack = new JLabel("Back");
	lblBack.setFont(new Font("Arial Black", Font.BOLD, 12));
	lblBack.setBounds(482, 308, 48, 14);
	add(lblBack);
	
	

	
	btnBack = new JButton("");
	btnBack.setIcon(new ImageIcon("C:\\Users\\Ashhad Rehman\\Desktop\\imgs\\back.png"));
	btnBack.setBounds(540, 289, 55, 49);
	add(btnBack);
		
		
	btnBack.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose();
			new WelcomeFrame();
		
			
			
			
			
		}
		
	});
	
	btnSubmit.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			String name=tfName.getText();
			String contactno=tfcno.getText();
			String age=tfage.getText();
			int ageString=Integer.parseInt(age);
			
			String gender=bg.getSelection().getActionCommand();
			String email=tfmail.getText();
			String UserName=tfuname.getText();
			char Password[]= pwd.getPassword();
			String passString=new String(Password);
			boolean checkEmpty=false;boolean checkUnique=false;
			
		
			
			if(name.isEmpty() || contactno.isEmpty() || age.isEmpty() || gender.isEmpty() || email.isEmpty() || UserName.isEmpty() || passString.isEmpty()) {
				JOptionPane.showMessageDialog(null, "All Fields are required");
				dispose();
				new SignupFrame();
				checkEmpty=true;
			
			}
			
		ArrayList<User> CUserList=readAllData();
			for(int i=0;i<CUserList.size();i++) {
				if(CUserList.get(i).getUsername().equalsIgnoreCase(name)) {
					JOptionPane.showMessageDialog(null,"Username already taken");
					dispose();
					new SignupFrame();
					checkUnique=true;
					break;
				
			
					
				
				
					
					
			}

			}
			if(checkEmpty==false && checkUnique==false) {
			Test initial=new Test();
			User us=new User(name,gender,contactno,ageString,UserName,email,passString,initial);
			try {
	            ArrayList<User> UserList = readAllData();
	            UserList.add(us);
	            ObjectOutputStream outputStream;
	            outputStream = new ObjectOutputStream(new FileOutputStream("UserList.ser"));
	            for(int i = 0 ; i<UserList.size() ; i++) {
	                outputStream.writeObject(UserList.get(i));
	            }
	            outputStream.close();
	        }  
	        catch(IOException exp){
	            System.out.println("IO Exception while opening file");
	        }
			catch(NumberFormatException numexp){
				JOptionPane.showMessageDialog(null, "Illegal format");
			}
			JOptionPane.showMessageDialog(null,"Account Created","Welcome", JOptionPane.OK_OPTION);
			dispose();
			new LoginFrame();
			}
			
		
		

			
		}
			
			
			
			
		
		
	});
	
	
	

	
	}
    public static ArrayList<User> readAllData() {
        ArrayList<User>UserList = new ArrayList<>(0);
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("UserList.ser"));
            boolean EOF = false;
            while (!EOF) {
                try {
                    User myObj = (User) inputStream.readObject();
                    UserList.add(myObj);
                } catch (ClassNotFoundException e) {
                    System.out.println("Class not found");
                } catch (EOFException end) {
                    EOF = true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file");
        } catch (IOException e) {
            System.out.println("IO exception while opening stream");
        }
        finally {
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                System.out.println("IO exception found while closing file");
            }
        }
        return UserList;
    }

	
	
	
	
	


}
	
	
	