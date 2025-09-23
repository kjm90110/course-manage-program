package courseManageProgram.model;

public class Professor {

	public Professor(String id, String password, String pname, String email) {
		super();
		this.id = id;
		this.password = password;
		this.pname = pname;
		this.email = email;
	}

	private String id;
	private String password;
	private String pname;
	private String email;
	
	Professor() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Professor [id=" + id + ", password=" + password + ", pname=" + pname + ", email=" + email + "]";
	}

}
