import java.io.Serializable;

public class User extends Person implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username,email,password;
	public Test getTesttaken() {
		return testtaken;
	}
	public void setTesttaken(Test testtaken) {
		this.testtaken = testtaken;
	}

	private Test testtaken;
	


	public User() {
		super();
		username="wizard";
		email="wizard@gmail.com";
		password="magicmagic";
		}
	public User(String n,String gen,String ph,int  ag,String uname,String mail,String pwd,Test marks)
	{
		super(n,gen,ph,ag);
		username=uname;email=mail;password=pwd;
		testtaken=marks;

		
		
		
	}


	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
