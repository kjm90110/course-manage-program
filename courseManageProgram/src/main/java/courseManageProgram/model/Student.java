package courseManageProgram.model;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 3827857328520387L;
	
	private String id;
	private String password;
	private String sname;
	private int grade;
	private String major;
	private int classNumber;
	private String email;
	
	public Student() {};
	
	public Student(String id, String password, String sname, int grade, String major, int classNumber, String email) {
		this.id = id;
		this.password = password;
		this.sname = sname;
		this.grade = grade;
		this.major = major;
		this.classNumber = classNumber;
		this.email = email;
	}

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

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", password=" + password + ", sname=" + sname + ", grade=" + grade + ", major="
				+ major + ", classNumber=" + classNumber + ", email=" + email + "]";
	}
	
	
	
	
}
