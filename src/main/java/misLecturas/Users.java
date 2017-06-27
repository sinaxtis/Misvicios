package misLecturas;

public class Users extends People{
	private String username, pass;
	public Users(String username, String pass, String name, String lastname){
		super(name, lastname);
		this.setUsername(username);
		this.setPass(pass);
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}	
}
