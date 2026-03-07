package Assignment_Signup;

public class User {
	
	private String username;
	private String password;
	private String email;
	private String mobile;
	public User(String username, String password, String email, String mobile) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getMobile() {
		return mobile;
	}
	
	

}
