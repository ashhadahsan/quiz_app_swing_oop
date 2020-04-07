import java.io.Serializable;

public class Admin extends Person implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username,password;
	public Admin() {
		super();
		username="ashhad1";
		password="33236";
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	

}
